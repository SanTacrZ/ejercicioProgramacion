import javax.swing.JOptionPane;
class DiaSemana{
	public static void main(String args[]){
	int numDia;	
		numDia=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese un numero valido")); 
		if(numDia==1){
			System.out.println("Domingo");
		}else if(numDia==2){
			System.out.println("Lunes");
		}else if(numDia==3){
			System.out.println("Martes");
		}else if(numDia==4){
			System.out.println("Miercoles");
		}else if(numDia==5){
			System.out.println("Jueves");
		}else if(numDia==6){
			System.out.println("Viernes");
		}else if(numDia==7){
			System.out.println("Sabado");
		}else{
			System.out.println("ingrese un numero valido");
		}
	}
}