import javax.swing.JOptionPane;
class Laboral{
	public static void main(String args[]){
		
		double horas,valorbruto,valorhora,neto,retencion,nombre;
		nombre=Double.parseDouble(JOptionPane.showInputDialog("porfavor ingrese su nombre"));
		horas=Double.parseDouble(JOptionPane.showInputDialog("tus horas trabajadas"));
		valorhora=Double.parseDouble(JOptionPane.showInputDialog("valor de tus horas"));
		
		valorbruto=horas*valorhora;
		retencion=0.1*valorbruto;
		neto=valorbruto-retencion;
		
		JOptionPane.showMessageDialog(null,"empleado"+nombre+"valor hora"+valorhora+"valorbruto"+valorbruto+"retencion del 10% es"+retencion+"neto"+neto);
		
	}
}