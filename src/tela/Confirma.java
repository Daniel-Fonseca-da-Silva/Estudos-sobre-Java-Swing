package tela;
import java.awt.*;
import javax.swing.*;

public class Confirma {
	private static Component Confirma;
	
	public static void main(String[] args) {
		int res = JOptionPane.showConfirmDialog(Confirma, "Confirma deposito?", "Escolha a melhor opção", JOptionPane.YES_NO_CANCEL_OPTION);
	}
}
