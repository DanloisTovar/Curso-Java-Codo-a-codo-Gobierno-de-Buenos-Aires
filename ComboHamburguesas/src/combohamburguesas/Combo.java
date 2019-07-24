
package combohamburguesas;


public class Combo {

    private String nombre;
    private int precio;
    private Papas papas;
    private Hamburguesa hamburguesa;
    private Bebida bebida;
    
    /*mire los circulos que me aparecen */
    public  String getNombre () {
    return this.nombre;
    }
    
    public void setNombre (String nuevoNombre) {

        this.nombre = nuevoNombre;
    
    }
    
    public int getPrecioTotal () {
    
    return this.precio;
        
    }
    
   public void setPrecioTotal (int nuevoPrecioTotal) {
   
   this.precio = nuevoPrecioTotal;
   } 

    void setPapas(Papas papas) {
       
    }

    void setHamburguesa(Hamburguesa hamburguesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setBebida(Bebida bebida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
