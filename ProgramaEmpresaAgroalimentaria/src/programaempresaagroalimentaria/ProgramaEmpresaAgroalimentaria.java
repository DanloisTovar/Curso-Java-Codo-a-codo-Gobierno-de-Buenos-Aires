
package programaempresaagroalimentaria;



public class ProgramaEmpresaAgroalimentaria {

   
    public static void main(String[] args) {
        
         Producto producto = new Producto ();
         
         producto.settipoProducto(" ");
         producto.setFechaCaducidad("31/12/2018");
         producto.setNumeroLote("2354");
         
         ProductoFresco pFresco= new ProductoFresco();
         
         pFresco.settipoProducto("Producto Fresco");       
         pFresco.setFechaCaducidad("20/12/2018");
          pFresco.setfechaEnvasado("20/01/2018");
         pFresco.setNumeroLote("2355");
         pFresco.setPaisOrigen("Argentina");
         
         
         
         ProductoRefrigerado pRefrigerado = new ProductoRefrigerado ();
         
         pRefrigerado.settipoProducto("Producto Refrigerado");
         pRefrigerado.setFechaCaducidad("22/12/2018");
         pRefrigerado.setNumeroLote("2356");
         pRefrigerado.setcodigodeOrganismoSuperAlim("123456");
         
         
         
         ProductoCongelado pCongelado = new ProductoCongelado ();
         
         pCongelado.settipoProducto("Producto Congelado");
         pCongelado.setfechaCaducidad("31/12/2018");
         pCongelado.setnumerodeLote("2357");
         pCongelado.settemperaturaConRecomendada("10 °C"); 
         
         
         System.out.println("La informacion es la siguente : \n" + "\n"+ "Tipode producto : " + pFresco.gettipoProducto()+"\n" + "\n"+" Fecha de caducidad : " + pFresco.getFechaCaducidad() + " \n" +" Nuero de lote : " + pFresco.getNumeroLote() + " \n" +"Fecha de Envasado : "+ pFresco.getfechaEnvasado() + "\n" +"Pais de origen: " + pFresco.getpaisOrigen()+ "\n");
         
         System.out.println("La informacion es la siguente : \n" +"\n"+ "Tipode producto : " + pRefrigerado.gettipoProducto()+"\n" +"\n'"+" Fecha de caducidad : " + pRefrigerado.getFechaCaducidad() + " \n" +" Nuero de lote : " + pRefrigerado.getNumeroLote()+ "\n" +"Numero de Organismo : "+ pRefrigerado.getcodigodeOrganismoSuperAlim()+ "\n") ;
         
         System.out.println("La informacion es la siguente : \n"+"\n" +  "Tipode producto : " + pCongelado.gettipoProducto()+"\n" + "\n" +"Fecha de caducidad : "+pCongelado.getfechaCaducidad() + "\n" + "Numero de lote : " + pCongelado.getnumerodeLote()+ "\n" + "Temperatura de congrlacion recomendada : " +pCongelado.gettemperaturaConRecomendada() + "\n");
           
         }
    
}
