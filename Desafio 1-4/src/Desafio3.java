import javax.swing.JOptionPane;

public class Desafio3 {

	public static void main (String [] agrs){
		int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do array: "  ));
		int k = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor alvo: "  ));
		
		int [] array = new int[n];
		for (int i = 0; i < n; i++) {
	    	array [i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "  ));
	    }
		
		int cont = 0;
		int aux = n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = k; j < aux; j++) {
				if (array [i] > array [j]) {
					if ((array [i] - array[j]) == k) {
				    	cont += 1;
				    }
				}else {
					if ((array [j] - array [i]) == k) {
				    	cont += 1;
				    }
				}
		    }
	    }
		System.out.println("O alvo foi atingido " + cont + " vezes.");
	}
}
