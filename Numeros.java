import javax.swing.JOptionPane;
class Numeros{
   public static void main (String args[]){
      double num1,num2,suma,resta,multiplicacion,division;
      num1= Double.parseDouble(JOptionPane.showInputDialog(null,"por favor ingrese un número "));
      num2= Double.parseDouble(JOptionPane.showInputDialog(null,"por favor ingrese otro número "));
      
      //suma
      suma=num1+num2;
      //resta
      resta=num1-num2;
     //multiplicar
     multiplicacion=num1*num2;
     //dividir
     division=num1/num2;
     JOptionPane.showMessageDialog(null,"\nsuma:"+suma+
     	"\nresta:"+resta+
     	"\nmultiplicacion:"+multiplicacion+
     	"\ndivision:"+division);
      System.out.println("\n"+ suma);
      System.out.println("\n"+ resta);
      System.out.println("\n"+ multiplicacion);
      System.out.println("\n"+ division);
      
      
   }
}