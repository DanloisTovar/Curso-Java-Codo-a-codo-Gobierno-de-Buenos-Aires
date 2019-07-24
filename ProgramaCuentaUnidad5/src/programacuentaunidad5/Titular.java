
package programacuentaunidad5;


public class Titular  {
    
    public String nombre, apellido;
    public String numeroCuenta;
    
    
    public String getNombre () {
    
   return this.nombre;    
    }
    
    
    public void setNombre (String nuevoNombre) {    
        this.nombre = nuevoNombre;
    
    }
    
    public String getApellido (){
    
    return this.apellido;
    }
    
    public void setApellido (String nuevoApellido) {
    this.apellido = nuevoApellido;    
    }
    
    public String getNumeroCuenta () {
    
        return this.numeroCuenta;
    }
    
    public void setNumeroCuenta (String nuevoNumeroCuenta){
    
        this.numeroCuenta = nuevoNumeroCuenta;
    }
    
    
}

