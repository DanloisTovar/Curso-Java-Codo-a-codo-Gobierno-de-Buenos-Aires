
package programahamburguesa;

public class ProgramaHamburguesa {


    public static void main(String[] args) {
        Combo combo = new Combo();
        combo.setNombre("Cuarto de libra");
        
        Papas papas = new Papas();
        papas.setTamanio("Mediano");
        papas.setPrecio(25);
        
        Hamburguesa hamburguesa = new Hamburguesa();
        hamburguesa.setNombre("Doble queso");
        hamburguesa.setPrecio(60);
        
        Bebida bebida = new Bebida();
        bebida.setNombre("Gaseosa Cola");
        bebida.setPrecio(35);

        combo.setPapas(papas);
        combo.setHamburguesa(hamburguesa);
        combo.setBebida(bebida);
        
        
        int precioTotal = combo.getPrecioTotal();
        if(precioTotal == 120) {
            System.out.print("Muy bien, el precio correcto es 120!!");
        }
        else {
            System.out.print("Parece que hay un error, el precio del combo debería ser 120!!");
        }
        
    }
    }
    

