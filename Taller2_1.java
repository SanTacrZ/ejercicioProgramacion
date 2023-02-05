//programa hecho por sebastian santacruz
//id 298603"
//30 de abril de 2016
import javax.swing.JOptionPane;

class Taller2_1{
	public static void main(String args[]){
		double A,B,C,x1,x2;
		A=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de A"));
		B=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de B"));
		C=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de C"));
			x1=(-B+Math.sqrt(Math.pow(B,2)-4*A*C))/(2*A);
			x2=(-B-Math.sqrt(Math.pow(B,2)-4*A*C))/(2*A);
		if(B*B<4*A*C){
			System.out.println("la solucion esta en los complejos");
		}else{
		}if(A!=0&&B*B>4*A*C){
			
			System.out.println("x1:"+(-B+Math.sqrt(B*B-4*A*C))/(2*A));
			JOptionPane.showMessageDialog(null,"\nx1:"+x1+"\nx2:"+x2);
			System.out.println("x2:"+(-B-Math.sqrt(B*B-4*A*C))/(2*A));
			JOptionPane.showMessageDialog(null,"\nx1:"+x1+"\nx2:"+x2);
		}else{
			System.out.println(null,"x1="+x1+"x2:"+x2);
			JOptionPane.showMessageDialog(null,"x1="+x1+"x2:"+x2);
		}
	}	
}
