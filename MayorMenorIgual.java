import javax.swing.JOptionPane;
class MayorMenorIgual{
	public static void main(String args[]){
		double Nu1,Nu2;
		Nu1=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese Nu1:"));
		Nu2=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese Nu2:"));
		
		if(Nu1>Nu2){
			JOptionPane.showMessageDialog(null,"\nNu1 es mayor a Nu2");
		}else if(Nu1<Nu2){
			JOptionPane.showMessageDialog(null,"\nNu1 es menor a Nu2");
		}else if(Nu1==Nu2){
			JOptionPane.showMessageDialog(null,"\nNu1 es igual a Nu2");
		}
		
	}
}