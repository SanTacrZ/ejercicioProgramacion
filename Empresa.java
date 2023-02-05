import javax.swing.JOptionPane;
class Empresa{
	public static void main(String args[]){
		double Categoria, iva,neto,personas,netounitario,total,totalneto,totaltotal,valor;
		Categoria=Double.parseDouble(JOptionPane.showMessageDialog(null,"categoria[1]categoria[2]categoria[3]categoria[4]categoria[5]"));
        personas=Double.parseDouble(JOptionPane.showMessageDialog(null,"por favor ingrese el numero de invitados"));
		if (Categoria==1){
			JOptionPane.showMessageDialog(null,"jugo de naranja o cafe y sanduche");
			JOptionPane.showMessageDialog(null,"valor:6.000");
			JOptionPane.showMessageDialog(null,"iva:"+netounitario);
			JOptionPane.showMessageDialog(null,"valor neto:"+totalneto);
			JOptionPane.showMessageDialog(null,"valor Total:"+total);
				iva=0.16;
				valor=6000;
				netounitario=valor*iva;
				total=valor*personas;
				totalneto=total*iva;
				totaltotal=total-totalneto;
				//est es el total sin el iva
		}else if(Categoria==2){
			JOptionPane.showMessageDialog(null,"jugo de naranja o Café y Huevos pericos");
			JOptionPane.showMessageDialog(null,"valor:7.500");
			JOptionPane.showMessageDialog(null,"iva:"+iva);
			JOptionPane.showMessageDialog(null,"valor neto:"+valorneto);
			JOptionPane.showMessageDialog(null,"valor Total:"+tatal);
			iva=0.16;
				valor=7.500;
				netounitario=valor*iva;
				total=valor*personas;
				totalneto=total*iva;
				totaltotal=total-totalneto;
		}else if(Categoria==3){
			JOptionPane.showMessageDialog(null,"Jugo de naranja o Café, Fruta y huevos pericos");
	JOptionPane.showMessageDialog(null,"valor:10.000");
		JOptionPane.showMessageDialog(null,"iva:"+iva);
		}
	}
}