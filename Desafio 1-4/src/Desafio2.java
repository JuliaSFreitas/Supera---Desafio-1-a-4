import javax.swing.JOptionPane;

public class Desafio2 {
	
	public static void main (String [] agrs){
		double [] nota = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
		double [] moeda = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
		double [] qntN = new double [6];
		double [] qntM = new double [6];
		
	    double n = Double.parseDouble(JOptionPane.showInputDialog("Informe o N (1 a 1000000.00): "  ));
	    
	    for (int i = 0; i < nota.length; i++) {
	    	qntN[i] = Math.floor(n/nota[i]);
	    	n = n - (qntN[i] * nota[i]);
	    }
	    
	    for (int i = 0; i < moeda.length; i++) {
	    	qntM[i] = Math.floor(n/moeda[i]);
	    	n = n - (qntM[i] * moeda[i]);
	    }
	    
	    //Saída
	    System.out.println("NOTAS: ");
	    for (int i = 0; i < nota.length; i++) {
	    	System.out.println(qntN[i] + " nota(s) de R$ " + nota[i]);
	    }
	    System.out.println("MOEDAS: ");
	    for (int i = 0; i < moeda.length; i++) {
	    	System.out.println(qntM[i] + " moeda(s) de R$ " + moeda[i]);
	    }
	}
}
