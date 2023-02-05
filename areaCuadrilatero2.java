import javax.swing.JOptionPane;

class areaCuadrilater2{
	public static void main(String args[]){
		double lado1, lado2, area;
		
		lado1=Double.parseDouble(JOptionPane.showInputDialog("por favor ingrese el valor del lado1"));
		lado2=Double.parseDouble(JOptionPane.showInputDialog("por favor ingrese el valor del lado2"));
		
		area=lado1*lado2;
		
		JOptionPane.showMessageDialog(null,"el area es:"+ area);
		System.out.println("el area es:"+ area);
	}
}