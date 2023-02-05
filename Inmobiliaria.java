import javax.swing.JOptionPane;
class Inmobiliaria{
	public static void main(String args[]){
		 double Numero,Salario,CuotaInicial,Resto,RestoMensual,RestoMensual2,CuotaInicial2,Casa;
        String Nombre;
      Nombre= JOptionPane.showInputDialog(null,"por favor ingrese su Nombre ");
        Numero =Double.parseDouble(JOptionPane.showInputDialog(null,"POR FAVOR ESCRIBA SUS INGRESOS ANUALES "));
        Casa =Double.parseDouble(JOptionPane.showInputDialog(null,"POR FAVOR INGRESE EL VALOR DE LA CASA "));

        Salario=Numero;
        CuotaInicial=Casa*0.15;
        CuotaInicial2=Casa*0.30;
        Resto=Casa-CuotaInicial;
        RestoMensual=(Resto/120);
        RestoMensual2=(Resto/96);
        
      if (Salario>=8000000){  
          
           JOptionPane.showMessageDialog(null,"BIENVENIDO" +" "+Nombre +"\nSU SALARIO ANUAL ES DE  " +" "+ Salario                         + 
           "\nLA CUOTA INICIAL A PAGAR ES DE:"+" "+CuotaInicial2                  + "\nSU DEUDA ES DE:"+" "+Resto                          + 
                   "\nY TENDRA QUE PAGAR MENSUALMENTE DURANTE 7 AÑOS:"+" "+RestoMensual2);  
          } 
      else {    
          System.out.println("BIENVENIDO" +" "+Nombre +"\nSU SALARIO ANUAL ES DE  " +" "+ Salario + 
           "\nLA CUOTA INICIAL A PAGAR ES DE:"+" "+CuotaInicial+ "\nSU DEUDA ES DE:"+" "+Resto+ 
                   "\nY TENDRA QUE PAGAR MENSUALMENTE DURANTE 10 AÑOS:"+" "+RestoMensual);
            
      
      }if(Salario<=7999999){
      	JOptionPane.showMessageDialog(null,"BIENVENIDO" +" "+Nombre +"\nSU SALARIO ANUAL ES DE" +" "+ Salario + 
           "\nLA CUOTA INICIAL A PAGAR ES DE:"+" "+CuotaInicial+ "\nSU DEUDA ES DE:"+" "+Resto+ 
                   "\nY TENDRA QUE PAGAR MENSUALMENTE DURANTE 10 AÑOS:"+" "+RestoMensual);
      }else{
      	System.out.println("BIENVENIDO" +" "+Nombre+"\nSU SALARIO ANUAL ES DE " +" "+ Salario                         + 
           "\nLA CUOTA INICIAL A PAGAR ES DE:"+" "+CuotaInicial2+ "\nSU DEUDA ES DE:"+Resto+ 
                   "\nY TENDRA QUE PAGAR MENSUALMENTE DURANTE 7 AÑOS:"+" "+RestoMensual2);
      }
   }

   

	
}