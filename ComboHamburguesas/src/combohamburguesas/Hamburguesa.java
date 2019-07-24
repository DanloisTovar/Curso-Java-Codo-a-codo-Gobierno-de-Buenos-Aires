
package combohamburguesas;


public class Hamburguesa extends Combo {
    
    private String noimbre;
    private int precio;    
    
  /*mire los circulos que me aparecen */
    public String getNombre () {
    
    return this.noimbre;
    }    
    
    
    public void setNombre (String nuevoNombre) {
    
    this.noimbre = nuevoNombre;
    
    }    
    
    public int getPrecio () {
    
    return this.precio;
    }
    
    public void setPrecio (int nuevoPrecio) {
    
    this.precio = nuevoPrecio;
    }    
    
}
