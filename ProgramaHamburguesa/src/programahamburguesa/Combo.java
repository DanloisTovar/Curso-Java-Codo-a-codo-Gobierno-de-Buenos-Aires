
package programahamburguesa;


class Combo {
    
    private String nombre;
    private Papas papas;
    private Hamburguesa hamburguesa;
    private Bebida bebida;
            

    public String getNombre() {        
       return  this.nombre;
    }
    
    public void setNombre( String nuevoNombre) {
      this.nombre =nuevoNombre;        
    }

   public  void setPapas(Papas nuevoPapas) {
       
       this.papas = nuevoPapas;
   }

   public  void setHamburguesa(Hamburguesa nuevohamburguesa) {
        
        this.hamburguesa = nuevohamburguesa;
    }

    void setBebida(Bebida nuevobebida) {
        this.bebida = nuevobebida;
    }

    int getPrecioTotal() {
        
        return this.papas.getprecio() + this.hamburguesa.getprecio() + this.bebida.getPrecio();
    }
    
}
