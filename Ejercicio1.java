//programa creado por sebastian
//4.05.2016
import javax.swing.JOptionPane;
class Ejercici1{
	public static void main(String args[]){
	double a,b,c;
	a=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de a"));
	b=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de b"));
	c=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de c"));
	
	if(a>=0){
		double x1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		double x2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		System.out.println("La solucion de x1: "+x1+"\nLa solucion de x2: "+x2);
    	
	}else{
		System.out.println("x1=");
		System.out.println("x2=");
		
	}	
	}
}