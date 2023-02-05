import javax.swing.JOptionPane;
class Edad{
	public static void main(String args[]){
		int año_actual, año_nacimiento, edad;
		año_actual=Integer.parseInt(JOptionPane.showInputDialog("ingrese el año actual"));
		año_nacimiento=Integer.parseInt(JOptionPane.showInputDialog("ingrese el año de nacimiento"));
		edad=año_actual-año_nacimiento;
		JOptionPane.showMessageDialog(null,"Tu edad es"+edad);
		
		
	}
}