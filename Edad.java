import javax.swing.JOptionPane;
class Edad{
	public static void main(String args[]){
		int a�o_actual, a�o_nacimiento, edad;
		a�o_actual=Integer.parseInt(JOptionPane.showInputDialog("ingrese el a�o actual"));
		a�o_nacimiento=Integer.parseInt(JOptionPane.showInputDialog("ingrese el a�o de nacimiento"));
		edad=a�o_actual-a�o_nacimiento;
		JOptionPane.showMessageDialog(null,"Tu edad es"+edad);
		
		
	}
}