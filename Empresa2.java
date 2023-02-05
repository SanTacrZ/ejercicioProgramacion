import javax.swing.JOptionPane;
public class Empresa2{   
    public static void main (String [] args){
    	double Categoria, Invitados,Valor,Pedido,IvaTotal,IvaIndividual,Neto,pan;
    		Categoria= Double.parseDouble(JOptionPane.showInputDialog(null,"Categoria" +
    	 	"\n1: Jugo de naranja o Café y Sanduche." +
    	 	"\n2: Jugo de naranja o Café y Huevos pericos."+
			"\n3: Jugo de naranja o Café, Fruta y huevos pericos. "+
			"\n4: Jugo de naranja y café, fruta, huevos pericos y canastilla de panes por cada 3 invitado."+
 			"\n5: Jugo de naranja y café, fruta, huevos pericos, salchichas y canastilla de panes por cada 3 invitados."));
    	
    	 Invitados= Double.parseDouble(JOptionPane.showInputDialog(null,"INGRESE EL NUMERO DE INVITADOS"));
    	 
    	 if(Categoria==1){
    	 	Pedido=6000*Invitados;
    	 	Valor=6000;
    	 	IvaTotal=Pedido*0.16;
    	 	IvaIndividual=6000*0.16;
    	 	Neto=Pedido-IvaTotal;
    	 	
    	 	  JOptionPane.showMessageDialog(null,"TOTAL"+
    	 	  	"\nEl refrigerio viene con:."+" "+Invitados+" "+"Jugo(s) de naranja o Café" +" "+"y"+" "+Invitados+" "+ "Sanduche(S)"  + 
    	 	  	"\nla cantidad de invitados es:"+" "+Invitados+	
    		  	"\nel costo individual.es de: "+" "+Valor+	  
    	 	  	"\nel valor del iva es de 16%:"+" "+IvaTotal+
    	 	  	"\nel iva individual es de:" +" "+IvaIndividual+ 
    	 	  	"\nel valor neto a pagar. "+" "+Neto+
    	 	 	"\nel costo total del desayuno ES:"+" "+Pedido+
               "" ,"TOTAL",JOptionPane.INFORMATION_MESSAGE);
  }
  
  
  else if(Categoria==2){
    	 	Pedido=  7500*Invitados;
    	 	Valor=7500;
    	 	IvaTotal=Pedido*0.16;
    	 	IvaIndividual=7500*0.16;
    	 	Neto=Pedido-IvaTotal;
    	 	
    	 	  JOptionPane.showMessageDialog(null,"TOTAL"+
    	 	  	"\nEl refrigerio viene con:."+" "+Invitados+" "+"Jugo(s) de naranja o Café " +" "+"y"+" "+Invitados+" "+ "Huevos pericos"  + 
    	 	  	"\nla cantidad de invitados es:"+" "+Invitados+	
    		  	"\nel costo individual.es de: "+" "+Valor+	  
    	 	  	"\nel valor del iva es de 16%:"+" "+IvaTotal+
    	 	  	"\nel iva individual es de:" +" "+IvaIndividual+ 
    	 	  	"\nel valor neto a pagar:"+" "+Neto+
    	 	 	"\nel costo total del desayuno ES:"+" "+Pedido+
               "" ,"TOTAL",JOptionPane.INFORMATION_MESSAGE);
  }
  	
  	else if(Categoria==3){
    	 	Pedido=  10000*Invitados;
    	 	Valor=10000;
    	 	IvaTotal=Pedido*0.16;
    	 	IvaIndividual=10000*0.16;
    	 	Neto=Pedido-IvaTotal;
    	 	
    	 	  JOptionPane.showMessageDialog(null,"TOTAL"+
    	 	  	"\nEl refrigerio viene con:."+" "+Invitados+" "+"Jugo(s) de naranja o Café y fruta" +" "+"y"+" "+Invitados+" "+ "Huevos pericos"  + 
    	 	  	"\nla cantidad de invitados es:"+" "+Invitados+ 	
    		  	"\nel costo individual.es de: "+" "+Valor+	  
    	 	  	"\nel valor del iva es de 16%:"+" "+IvaTotal+
    	 	  	"\nel iva individual es de:" +" "+IvaIndividual+ 
    	 	  	"\nel valor neto a pagar:"+" "+Neto+
    	 	 	"\nel costo total del desayuno es:"+" "+Pedido+
               "" ,"TOTAL",JOptionPane.INFORMATION_MESSAGE); 
  }else if(Categoria==4){
  		Pedido=13000*Invitados;
  		Valor=13000;
	  	IvaTotal=Pedido*0.16;
	  	IvaIndividual=13000+0.16;
	  	Neto=Pedido-IvaTotal;
	  	pan=Invitados/3;
		JOptionPane.showMessageDialog(null,"TOTAL"+
    	 	  	"\nEl refrigerio viene con:."+" "+Invitados+" "+"Jugo(s) de naranja o Café y fruta" +" "+"y"+" "+Invitados+" "+
    	 	  	"\nla cantidad de invitados ES:"+" "+Invitados+
    	 	  	"\ncanastilla de pan:"+" "+ pan + 	
    		  	"\nelcosto individual.es de: "+" "+Valor+	  
    	 	  	"\nel valor del iva es de 16%:"+" "+IvaTotal+
    	 	  	"\nEl iva individual es de:" +" "+IvaIndividual+ 
    	 	  	"\nel valor neto a pagar:"+" "+Neto+
    	 	 	"\nel costo total del desayuno es:"+" "+Pedido+
               "" ,"TOTAL",JOptionPane.INFORMATION_MESSAGE);  	
  	
  }else if(Categoria==5){
  	Pedido=15000*Invitados;
  	Valor=15000;
  	IvaTotal=Pedido*0.16;
  	IvaIndividual=15000*0.16;
  	Neto=Pedido-IvaTotal;
  	pan=Invitados/3;
  	JOptionPane.showMessageDialog(null,"TOTAL"+
  		"\nEl refrigerio viene con:."+" "+Invitados+" "+"Jugo(s) de naranja y café, fruta, huevos pericos" +" "+"y"+" "+Invitados+" "+ "salchicas" + 
    	 	  	"\nla cantidad de invitados ES:"+" "+Invitados+
    	 	  	"\ncanastilla de pan:"+""+ pan +	
    		  	"\nEL costo individual.es de: "+" "+Valor+	  
    	 	  	"\nel valor del iva es de 16%:"+" "+IvaTotal+
    	 	  	"\nel iva individual es de:" +" "+IvaIndividual+ 
    	 	  	"\nel valor neto a pagar. "+" "+Neto+
    	 	 	"\nel costo total del desayuno ES:"+" "+Pedido+
               "" ,"TOTAL",JOptionPane.INFORMATION_MESSAGE);
  }
  	
  }
  
  
  
  
}