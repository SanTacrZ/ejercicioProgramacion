 import javax.swing.JOptionPane;

public class Genero {
  
   public static void main (String args[]){
      double Genero;
        String Nombre;
      Nombre= JOptionPane.showInputDialog(null,"Porfavor ingrese su Nombre ");
        Genero= Double.parseDouble(JOptionPane.showInputDialog(null,"Porfavor seleccione su genero" +" \n1: HOMBRE" +"\n2: MUJER"));

      if (Genero==1){  
           JOptionPane.showMessageDialog(null,"BIENVENIDO:" +" "+Nombre + "\nGENERO:"+" "+"MASCULINO");
     
        System.out.println("BIENVENIDO" +" "+Nombre+ "\nGENERO:"+" "+"MASCULINO");
            
          } 
      else if(Genero==2){    
          JOptionPane.showMessageDialog(null,"BIENVENIDA:"+" "+Nombre + "\nGENERO:"+" "+"FEMENINO");
     
        System.out.println("BIENVENIDA:" +Nombre + "\nGENERO:"+" "+"FEMENINO");
        
      }
   }
 
}