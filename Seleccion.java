import javax.swing.JOptionPane;
class Seleccion{
	public static void main(String args[]){
		int Edad, anosParticipando;
		String Nombre;
		Nombre=JOptionPane.showInputDialog(null,"Ingrese su Nombre");
		Edad=Integer.parseInt(JOptionPane.showInputDialog(null,"porfavor ingresar su edad"));
		anosParticipando=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese años participando"));
		if(Edad>=18||anosParticipando>4){
			JOptionPane.showMessageDialog(null,"Participacion Internacional");
		}else if(Edad>=14||anosParticipando>2){
			JOptionPane.showMessageDialog(null,"Participacion Nacional");
		}else {
			System.out.println("participacion Local");
			
			
		}
		
	}
}