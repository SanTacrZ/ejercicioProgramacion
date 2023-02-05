import javax.swing.JOptionPane;

class AreaTriangulo{
		
		public static void main(String args[]){
			double base, altura, AreaTriangulo;
			
			base=Double.parseDouble(JOptionPane.showInputDialog("por favor ingresar la base"));
			altura=Double.parseDouble(JOptionPane.showInputDialog("por favor ingresar altura"));
			
			AreaTriangulo=(base*altura)/2;
			JOptionPane.showMessageDialog(null,"el area es:"+ AreaTriangulo);
		System.out.println("el area del triangulo es :"+ AreaTriangulo);
		}
}