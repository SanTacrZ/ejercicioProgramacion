import javax.swing.JOptionPane;
class mas{
	public static void main(String args[]){
		double a,b,c,x1,x2;
		a=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de a"));
		b=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de b"));
		c=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de c"));
		if(a>0){
			x1=((-b+Math.pow(b,2)-4*a*c)/(2*a));
			x2=((-b-Math.pow(b,2)-4*a*c)/(2*a));
			System.out.println("x1="+x1);
			System.out.println("x2="+x2);
		}else{
			System.out.println("el valor de a debe ser mayor a 0");
		}
		
	}
}