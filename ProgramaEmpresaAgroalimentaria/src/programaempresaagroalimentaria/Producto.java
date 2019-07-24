
package programaempresaagroalimentaria;


public class Producto {
    
    private String fechadeCaducidad, numerodeLote, tipoProducto;
    
    
    
    public  String gettipoProducto (){
         return this.tipoProducto;    
    }
    
    public void settipoProducto (String nuevoTipoProducto) {
         this.tipoProducto = nuevoTipoProducto;    
    }

    public String getFechaCaducidad () {
        
         return this.fechadeCaducidad;    
    }
    
    
    public void setFechaCaducidad (String nuevoFechaCaducidad ) {
        
         this.fechadeCaducidad= nuevoFechaCaducidad;   
    
    }
    
    
    public  String getNumeroLote () {
         return this.numerodeLote ;    
    }
    
    public void setNumeroLote (String nuevoNumeroLote) {
    
         this.numerodeLote = nuevoNumeroLote;       
    }
    
        
 
    
}
