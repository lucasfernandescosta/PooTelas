package br.univille.poo.swing;

import javax.swing.JFrame;

import javax.swing.SwingUtilities;
public class Main {
	
	public static void main(String[] args) {
	
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	// Instancia a nova Janela
            	SegundaTela segundaTela =  new SegundaTela();
            	// Finaliza o programa quando fechar a janela
            	segundaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	// Exibe a janela
            	segundaTela.show();
            }
        });
	}

}
