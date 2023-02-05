
import javax.swing.JOptionPane;
class calculadoraSimple{
	
public static void main (String args[]) {
	double Nu1,Nu2,Operacion, Resultado;
	Operacion=Double.parseDouble(JOptionPane.showInputDialog(null,"para suma[1]para resta[2]para multiplicar[3]para dividir[4]para potencia[5]"));
	JOptionPane.showMessageDialog(null,"Nu2 debe ser diferente de cero");
		Nu1=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el primer valor"));
	Nu2=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el segundo valor"));
	if(Operacion==1){
		JOptionPane.showMessageDialog(null,"el resultado es: "+(Nu1+Nu2));
		System.out.println("el resultado es:"+(Nu1+Nu2));
	}else if(Operacion==2){
		JOptionPane.showMessageDialog(null,"el resultado es: "+(Nu1-Nu2));
		System.out.println("el resultado es:"+(Nu1-Nu2));
	}else if(Operacion==3){
		JOptionPane.showMessageDialog(null,"el resultado es: "+(Nu1*Nu2));
		System.out.println("el resultado es:"+(Nu1*Nu2));
	}else if(Operacion==4){
		JOptionPane.showMessageDialog(null,"el resultado es: "+(Nu1/Nu2));
		System.out.println("el resultado es:"+(Nu1/Nu2));
	}else if(Operacion==4){
		JOptionPane.showMessageDialog(null,"Nu2 debe ser diferente de cero");
	}else if(Operacion==5){
		JOptionPane.showMessageDialog(null,"Nu2 debe ser diferente de cero");
		JOptionPane.showMessageDialog(null,"el resultado es: "+Math.pow(Nu1,Nu2));
		System.out.println(null,"el resultado es:"+Math.pow(Nu1,Nu2))
		
	}
	
}
}