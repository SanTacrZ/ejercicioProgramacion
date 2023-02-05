import javax.swing.JOptionPane;
class Estaciones{
	public static void main(String args[]){
		int mes;
		mes=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese un numero del mes"));
		if(mes==12){
			JOptionPane.showMessageDialog(null,"La estación es Invierno");
		}else if(mes==11){
			JOptionPane.showMessageDialog(null,"La estación es Otoño");
		}else if(mes==10){
			JOptionPane.showMessageDialog(null,"La estación es Otoño");
		}else if(mes==9){
			JOptionPane.showMessageDialog(null,"La estación es Otoño");
		}else if(mes==8){
			JOptionPane.showMessageDialog(null,"La estación es Verano");
		}else if(mes==7){
			JOptionPane.showMessageDialog(null,"La estación es Verano");
		}else if(mes==6){
			JOptionPane.showMessageDialog(null,"La estación es Verano");
		}else if(mes==5){
			JOptionPane.showMessageDialog(null,"La estación es Primavera");
		}else if(mes==4){
			JOptionPane.showMessageDialog(null,"La estacion es Primavera");
		}else if(mes==3){
			JOptionPane.showMessageDialog(null,"La estacion es Primavera");
		}else if(mes==2){
			JOptionPane.showMessageDialog(null,"La estacion es Invierno");
		}else if(mes==1){
			JOptionPane.showMessageDialog(null,"La estacion es Invierno");
		}else
			JOptionPane.showMessageDialog(null,"ingrese valor valido");
	}
}