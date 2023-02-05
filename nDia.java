import javax.swing.JOptionPane;

class DiasSemana {
	
	public static void main(String[] args) {

		int nDia;
		
		nDia= Integer.parseInt(JOptionPane.showInputDialog("Por favor Ingrese el número del día"));

		switch (nDia)  {
			case 1:
					System.out.println("Domingo");
					break;
			case 2:
					System.out.println("Lunes");
					break;
			case 3:
					System.out.println("Martes");
					break;
			case 4:
					System.out.println("Miércoles");
					break;
			case 5:
					System.out.println("Jueves");
					break;
			case 6:
					System.out.println("Viernes");
					break;
			case 7:
					System.out.println("Sabado");
					break;
			default:	
					System.out.println("Ingrese un número entre 1 y 7");
				
			
		}// fin switch
		
	
	}
}	
