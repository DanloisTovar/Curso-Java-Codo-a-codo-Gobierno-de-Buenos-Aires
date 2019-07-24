
package unidad5electrodomesticos;


public class Unidad5Electrodomesticos {

    
    public static void main(String[] args) {
        
        Electrodomesticos electrodomestico [] = new Electrodomesticos[3];
        
        electrodomestico [0] = new Electrodomesticos(10000, 60, 'A', "Verde");
        electrodomestico [1] = new Lavaropa(10000, "Blanco", 'A', 28);
        electrodomestico [2] = new Television(40, true, 10000, " ", 'A', 1);
        
        double sumaElectrodomesico = 0;        
        double sumaLavaRopa = 0;
        double SumaTV = 0;
        
        
        for (int i = 0; i < electrodomestico.length; i++) {
            
            if (electrodomestico [i] instanceof Electrodomesticos) {
                sumaElectrodomesico += electrodomestico [i].precioFinal();                
            }
            if (electrodomestico [i] instanceof Electrodomesticos) {
                
                sumaLavaRopa += electrodomestico [i].precioFinal();                
            }
            if (electrodomestico [i] instanceof Electrodomesticos) {
                SumaTV += electrodomestico [i].precioFinal();
            }
            
        }
        
        System.out.println("El monto de los electrodometicos es " + sumaElectrodomesico);
        System.out.println("El monto del lavaropa es :" + sumaLavaRopa);
        System.out.println("El monto del televisor es : " + SumaTV);
    }
    
   
    
}
