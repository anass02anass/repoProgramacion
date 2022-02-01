package _01objetos;

import javax.swing.JOptionPane;

public class Zona {
	
	private int entradasPorVender;

	public Zona(int n) {
		entradasPorVender = n;
	}
	
	public int getEntradasPorVender() {
		return entradasPorVender;
	}
	
	//Vende un n�mero de entradas. Comprueba si quedan entradas libres antes de realizar la venta.
	
	public void vender(int n) {
		
		if (this.entradasPorVender ==0) {
			JOptionPane.showMessageDialog(null, "Lo siento, las entradas para esa zona est�n agotadas.");
		} else if (this.entradasPorVender < n) {
			JOptionPane.showMessageDialog(null, "S�lo quedan " + this.entradasPorVender + " entradas para esa zona.");
		}
		
		if (this.entradasPorVender >= n) {
			entradasPorVender -= n;
			JOptionPane.showMessageDialog(null, "Aqu�- tiene sus " + n + " entradas, gracias.");
		}
	}
}
