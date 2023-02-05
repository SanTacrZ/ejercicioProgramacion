import javax.swing.JOptionPane;
class SegundoGrado {
    public static void main(String [] args){
        double A, B, B1, C, RE;
        
        A= Double.parseDouble(JOptionPane.showInputDialog("POR FAVOR INGRESE EL NUMERO A"));
        B= Double.parseDouble(JOptionPane.showInputDialog("POR FAVOR INGRESE EL NUMERO B"));
        C= Double.parseDouble(JOptionPane.showInputDialog("POR FAVOR INGRESE EL NUMERO C"));
        
            B1=Math.pow(B,2);
            RE=Math.pow(B,2)-4*A*C; 
        
          if(A!=0){  
          if(RE<0){  
                JOptionPane.showMessageDialog(null,"LA RAIZ NO EXISTE");
          System.out.println("la raiz no existe");  
          }else{  
          double x1=(-B+Math.sqrt(RE))/(2*A);  
          double x2=(-B-Math.sqrt(RE))/(2*A);  
           JOptionPane.showMessageDialog(null,"La solucion de x1: "+x1+"\nLa solucion de x2: "+x2);
        System.out.println("La solucion de x1: "+x1+"\nLa solucion de x2: "+x2);
        }  
      }else{  
                JOptionPane.showMessageDialog(null,"A NO PUEDE VALER 0");
      System.out.println("A NO PUEDE VALER 0");  
      }        
      }  
         
     
    }
