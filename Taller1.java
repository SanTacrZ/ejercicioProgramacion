public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double A,B,El,C,Res,x1,x2;
    A=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el valor de A:"));
    B=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el valor de B:"));
    C=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el valor de C:"));
    
    El=(Math.pow(B,2));
    Res=(Math.pow(B,2)-4*A*C);
    if(A!=0){
    	JOptionPane.showInputDialog("x1 y x2 equivalen a:");
    }else{
    	JOptionPane.showInputDialog("error matematico");
    }
    }
}  