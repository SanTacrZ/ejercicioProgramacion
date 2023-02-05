import javax.swing.JOptionPane;
class CicloEdad{
	public static void main (String[] args){
		int Edad;
			
		Edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Porfavor Ingresar edad"));
			 
		if(Edad>=0&&Edad<=2){
				System.out.println("Bebe");
		}else if(Edad>=3&&Edad<=10){
				System.out.println("Niño");
		}else if(Edad>=11&&Edad<=18){
				System.out.println("Adolecente");
		}else if(Edad>=19&&Edad<=60){
				System.out.println("Adulto");
		}else{
			System.out.println("Adulto Mayor");
		}
		
		
	}
}