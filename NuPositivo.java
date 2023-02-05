import javax.swing.JOptionPane;
class NuPositivo{
	public static void main (String args[]) {
		double Nu;
		Nu=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese un numero"));
 	if(Nu>=0){
 		JOptionPane.showMessageDialog(null,"numero:"+""+Nu+"\n el numero es positivo");
 		System.out.println("el numero"+""+Nu+"\n es positivo");
 	}else{
 		JOptionPane.showMessageDialog(null,"ingrese un numero mayor o igual a cero");
 		System.out.println("el numero"+""+Nu+"\n es negativo");
 	}
 	}
}