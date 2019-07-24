
package programaempresaagroalimentaria;


public class ProductoRefrigerado extends Producto {
    
    private String fechadeCaducidad, numerodeLote, tipoProducto;
    private String codigodeOrganismoSuperAlim;
    
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
    
    
    public String getcodigodeOrganismoSuperAlim () {
    
        return this.codigodeOrganismoSuperAlim;    
    }
    
    public void setcodigodeOrganismoSuperAlim ( String nuevocodigodeOrganismoSuperAlim) {
    
    this.codigodeOrganismoSuperAlim = nuevocodigodeOrganismoSuperAlim;
    }
    
}
