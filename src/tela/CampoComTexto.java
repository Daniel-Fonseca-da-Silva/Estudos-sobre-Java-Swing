package tela;
import java.awt.*;
import javax.swing.*;

public class CampoComTexto {
	private static Component CampoComTexto;
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(CampoComTexto, "Qual o seu rg cadastrado", "Informe seus dados abaixo", JOptionPane.QUESTION_MESSAGE);
		System.out.println("Seu dado inserido foi" + nome);
	}
}
