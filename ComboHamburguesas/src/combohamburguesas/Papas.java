
package combohamburguesas;


public class Papas extends Combo{
    
private String tamanio;
private int precio;

public String getTamanio (){

return this.tamanio;
}

public  void setTamanio(String nuevoNombre) {

this.tamanio = nuevoNombre;
}

public int getPrecio () {
    
    return  this.precio;
}


public void setPrecio (int nuevoPrecio) {

this.precio = nuevoPrecio;
}
    
}
