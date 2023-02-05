//programa hecho por sebastian santacruz
//id 298603
//26 de abril de 2016
import javax.swing.JOptionPane;

class NumeroIguales{
	public static void main(String args[]){
		int n1,n2;
		n1=Integer.parseInt(JOptionPane.showInputDialog("porfavor ingrese n1"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("porfavor ingrese n2"));
		
		if (n1==n2){
		
			JOptionPane.showMessageDialog(null, n1+"es igual a"+n2);
		}
		else{
			JOptionPane.showMessageDialog(null, n1+"es diferente"+n2);
		}
			
	}
}