
package programaempresaagroalimentaria;


public class ProductoFresco extends Producto {
    
    public  String fechadeCaducidad, numerodeLote, tipoProducto;
    public  String fechadeEnvasado, paisdeOrigen;
    
    public String gettipoProducto (){
    return  this.tipoProducto;
    }
    
    public void settipoProducto (String nuevoTipoProducto) {
    
    this.tipoProducto =nuevoTipoProducto;
    }
    
    public String getfechaCaducidad () {
    return this.fechadeCaducidad;
    }
    
    public  void setfechaCaducidad (String nuevoFechaCaducidad) {    
    this.fechadeCaducidad = nuevoFechaCaducidad;
    }
    
    public String getfechaEnvasado () {
    return this.fechadeEnvasado;
    }
    
      public void setfechaEnvasado (String nuevoFechaEnvasado) {    
    this.fechadeEnvasado = nuevoFechaEnvasado;
    }
    
    public String getnumerodeLote () {
    
    return this.numerodeLote;
    }
    
    public void setnumerodeLote (String nuevoNumerodeLote) {
    this.numerodeLote = nuevoNumerodeLote;
    
    }
    
    public String getpaisOrigen () {
    return this.paisdeOrigen;
    }
    
    public void setPaisOrigen (String nuevoPaisOrigen) {
    
    this.paisdeOrigen = nuevoPaisOrigen;
    } 

     
}
