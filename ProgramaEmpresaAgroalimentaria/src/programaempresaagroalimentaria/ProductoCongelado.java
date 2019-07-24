
package programaempresaagroalimentaria;


public class ProductoCongelado extends Producto {
    
      private String fechadeCaducidad, numerodeLote, tipoProducto;
    private String temperaturaConRecomendada;
    
     public String gettipoProducto (){
    return  this.tipoProducto;
    }
    
    public void settipoProducto (String nuevoTipoProducto) {
    
    this.tipoProducto =nuevoTipoProducto;
    }
    
    
    public String getfechaCaducidad () {
        return this.fechadeCaducidad;
    }
    
    public  void setfechaCaducidad (String nuevoFrechaCaducidad) {
    this.fechadeCaducidad = nuevoFrechaCaducidad;
    }
    
    public  String getnumerodeLote () {
    
    return this.numerodeLote;
    }
    
    public  void setnumerodeLote (String nuevoNumerodeLote) {
    
    this.numerodeLote =nuevoNumerodeLote;
    }
    
    public String gettemperaturaConRecomendada () {
    return this.temperaturaConRecomendada;    
    }
    
    public void settemperaturaConRecomendada (String nuevotemperaturaConRecomendada) {
    this.temperaturaConRecomendada = nuevotemperaturaConRecomendada;
    }
    
    
}
