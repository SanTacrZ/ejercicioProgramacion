import javax.swing.JOptionPane;
class nomina{
	
	public static void main(String args[]){
		
		String nombre;
		
		int  hora, valorHora, valorBruto, retencion, neto;
		
		nombre=JOptionPane.showInputDialog(null,"porfavor ingrese su nombre");
		
		hora=Integer.parseInt(JOptionPane.showInputDialog("tus horas trabajadas"));
		
		valorHora=Integer.parseInt(JOptionPane.showInputDialog("tu valor por hora"));
		
		valorBruto=hora*valorHora;
		
		retencion=valorBruto*10;
		
		neto=valorBruto*retencion;
		
		JOptionPane.showMessageDialog(null,"el empleado "+nombre+" con sus "+hora+" horas trabajadas, su valorBruto "+ valorBruto+" la retencion "+retencion+" el neto a pagar "+neto);
	}
}