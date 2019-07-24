
package programahamburguesa;


class Papas {
    
    private String nombre;
    private int precio;
    
    public String getTamanio () {
    
        return this.nombre;
    
    }

   public  void setTamanio(String nuevoNombre) {
        
        this.nombre = nuevoNombre;
   }

   public  int getprecio() {
       
       return this.precio;
   }
   
   
   public void setPrecio (int nuevoPrecio) {
   this.precio = nuevoPrecio;
   
   }
        
    }
