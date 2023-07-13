import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

import javax.swing.*;                                                          

public class Desafio1 {

	public static void main (String [] agrs){
		
		int t = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho: "  ));;
		int [] n = new int[t];

	    for (int i = 0; i < t; i++) {
	    	n[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o N (1 a 100000): "  ));
	    }
		
	    List<Integer> pares = Arrays.stream(n)
                .filter(num -> num % 2 == 0)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        List<Integer> impares = Arrays.stream(n)
                .filter(num -> num % 2 != 0)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        
        for (int numero : pares) {
            System.out.println(numero + " ");
        }
        for (int numero : impares) {
            System.out.println(numero + " ");
        }
	    
	}
}
