package br.senai.sp.jandira;

import javax.swing.JOptionPane;

public class ReajusteSalarial {

	public static void main(String[] args) {

		double salarioInicial, salarioFinal;
		String strSalarioInicial, nome;
		
		JOptionPane.showMessageDialog(null, "Bem-vindo ao reajuste\n" + "salarial da Acme Ltda.");
		nome = JOptionPane.showInputDialog("Qual o seu Nome?");
		strSalarioInicial = JOptionPane.showInputDialog("Olá " + nome + ", qual o seu salário atual?");
		
		salarioInicial = Double.parseDouble(strSalarioInicial);
		
		if (salarioInicial < 1500) {
			
			salarioFinal = salarioInicial * 15 / 100 + salarioInicial;
			
		} if (salarioInicial > 3000) {
			
			salarioFinal = salarioInicial * 5 / 100 + salarioInicial;
			
		} else {
			
			salarioFinal = salarioInicial * 10 / 100 + salarioInicial;
			
		}
		
		JOptionPane.showMessageDialog(null, nome + ", seu salário agora será R$:" + salarioFinal);
		
	}

}
