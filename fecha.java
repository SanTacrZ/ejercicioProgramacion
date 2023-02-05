import javax.swing.JOptionPane;
 class fecha{

    public static void main (String[] args) {
    
    double edad,dias;
    
    edad= Double.parseDouble(JOptionPane.showInputDialog(null,"porfavor ingrese su edad:"));
    
    dias=edad*365.25;
    
    System.out.println("tu edad en dias es: "+dias);
    
    }
 }        