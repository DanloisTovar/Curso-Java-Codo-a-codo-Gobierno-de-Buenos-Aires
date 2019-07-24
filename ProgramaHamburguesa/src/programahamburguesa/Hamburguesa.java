
package programahamburguesa;


class Hamburguesa {
    
    private String nombre;
    private int precio;
    
    
    public String getnombre () {

       return this.nombre;
    }

   public  void setNombre(String nuevoNombre) {
      
         this.nombre = nuevoNombre;
             
    }
    
    public  int getprecio () {
    
        return this.precio;
    }

    void setPrecio(int nuevoPrecio) {
        this.precio = nuevoPrecio;
    }
    
}
