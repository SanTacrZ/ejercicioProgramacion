import javax.swing.JOptionPane;
class RadioCirculo{
	public static void main(String args []){
		double pi=3.14;
		double radio=Double.parseDouble(JOptionPane.showInputDialog("ingrese el radio"));
		double perimetro=2*radio*pi;
		double area=pi*Math.pow(radio,2);
		JOptionPane.showMessageDialog(null, "perimtetro" +perimetro+"\n"  + "area: " +area);
		
		
	}
}