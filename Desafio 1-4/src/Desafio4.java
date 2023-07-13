import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Desafio4 {
	
	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog("Informe o texto: ");
        esquerdaPalavras(texto);
        direitaPalavras(texto);
    }

	public static void esquerdaPalavras(String texto) {
		Stack<Character> pilha = new Stack<>();
        ArrayList<String> palavras = new ArrayList<>();
        
        for (int i = 0; i < texto.length()/2; i++) {
        	pilha.push(texto.charAt(i));
        }
        
        for (int i = 0; i < texto.length(); i++) {
            if (!pilha.isEmpty()) {
            	palavras.add(Character.toString(pilha.pop()));
            } else {
                break;
            }
        }
        
        for (String palavra : palavras) {
            System.out.print(palavra);
        }
    }
	
	public static void direitaPalavras(String texto) {
		Stack<Character> pilha = new Stack<>();
        ArrayList<String> palavras = new ArrayList<>();

        for (int i = 0; i < texto.length(); i++) {
            pilha.push(texto.charAt(i));
        }

        for (int i = 0; i < texto.length()/2; i++) {
            if (!pilha.isEmpty()) {
            	palavras.add(Character.toString(pilha.pop()));
            } else {
                break;
            }
        }

        for (String palavra : palavras) {
            System.out.print(palavra);
        }
    }
}
