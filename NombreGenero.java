import javax.swing.JOptionPane;
class NombreGnenero{
	public static void main(String args[]){
		Double Nombre, Genero;
	
		
		Nombre=Double.parseDouble(JOptionPane.showInputDialog(null,"porfavor ingresar el Nombre"));
		Genero=Double.parseDouble(JOptionPane.showInputDialog(null,"porfavor ingresar tu Genero"));
			hombre=Integer.parseInt(Genero);
			mujer=Integer.parseInt(Genero);
			if(hombre!=mujer){
				JOptionPane.showMessageDialog(null,"hombre no es igual que mujer");
			}else{
				JOptionPane.showMessageDialog(null,"hombre no toma el valor de mujer");
			}
	}
	
}