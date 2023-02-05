
import javax.swing.JOptionPane;
class NumerosPositivos{
	public static void main(String args[]){
		  double Numero;
        Numero =Double.parseDouble(JOptionPane.showInputDialog(null,"POR FAVOR INGRESE UN NÚMERO "));

      if (Numero>=0){  
           JOptionPane.showMessageDialog(null,"EL NUMERO" +" "+Numero + "\nES POSITIVO");
     
        System.out.println("EL NUMERO" +" "+Numero + "\nES POSITIVO");
            
          } 
      else {    
          JOptionPane.showMessageDialog(null,"POR FAVOR INGRESE NUMEROS MAYORES AL CERO");
     
        System.out.println("POR FAVOR INGRESE NUMEROS MAYORES AL CERO");
      
      }
   }

	
}