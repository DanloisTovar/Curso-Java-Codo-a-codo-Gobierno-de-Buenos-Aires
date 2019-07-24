
package combohamburguesas;


public class Bebida extends Combo{
    
private String nombre;
private int precio;


/*mire los circulos que me aparecen */
public String getNombre () {

    return this.nombre;
}
/*mire los circulos que me aparecen */
public void setNombre (String nuevoNombre) {

this.nombre = nuevoNombre;
}

public int getPrecio (){
return this.precio;
}

public void setPrecio (int nuevoPrecio){

    this.precio = nuevoPrecio;
}
    
}
