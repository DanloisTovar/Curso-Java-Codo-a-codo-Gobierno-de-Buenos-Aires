
package programacuentaunidad5;

public class Cantidad extends Titular {
    
    private double montoiIngreso;
    private double montoegreso;
    
    
    public double getMontoIngreso (){
    
    return this.montoiIngreso;
    }
    
    
    public void setMontoIngreso (double nuevoMontoIngreso) {
    
        this.montoiIngreso = nuevoMontoIngreso;
    
    }
    
    public double getMontoEgreso (){
    
        return this.montoegreso;
    }
    
    public void setMontoEgreso (double nuevoMontoEgreso){
    
    this.montoegreso = nuevoMontoEgreso;
    }
    
    
   double getMontoTotal () {
   
       return this.montoiIngreso - this.montoegreso;
   }
}
