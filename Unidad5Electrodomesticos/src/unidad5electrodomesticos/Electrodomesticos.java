
package unidad5electrodomesticos;


public class Electrodomesticos {

    public Electrodomesticos() {
        this (PRECIO_BASE, PESO, CONSUMO_ENERGETICO, COLOR_POR_DEFCTO);
        
    }

    public Electrodomesticos(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomesticos(int precioBase, String color, char consumo, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }
    
    public int precioBase;
    public String color;
    public char consumo;
    public int peso;
    
    public final static String COLOR_POR_DEFCTO  ="blanco";
    public final static char  CONSUMO_ENERGETICO = 'F';
    public final static int PRECIO_BASE = 10000;
    public final static int PESO = 5;   

    public Electrodomesticos(int PRECIO_BASE, int PESO, char CONSUMO_ENERGETICO, String COLOR_POR_DEFCTO) {
       
    }    
    
    
    public void comprobarConsumoEnergetico (char consumo) {
        
        if (consumo >= 50 || consumo <= 60) {
            
            this.consumo = consumo;  
    } else {
        
            this.consumo =CONSUMO_ENERGETICO;        
        } 
    
}    
    
     public void comprobarColor (String color){
    
        String colores [] = { "blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado = false;
        
        for (int i = 0; i < colores.length && ! encontrado; i++) {
            
            encontrado = true;           
        }
        
        if (encontrado) {
            
            this.color = color;
            
        } else {
        
        this.color = COLOR_POR_DEFCTO;
        }    
    }
   
   public int getPrecioBase () {
        
            return this.precioBase;        
        }   
 public String getColor () {
 
            return this.color;
 }  
 
 public char getConsumoEnergetico () {
 
     return this.consumo; 
 }
 
 
 public int peso () {
 
     return this.peso; 
 }
 
 public double precioFinal () {
 
 double tipoConsumo = 0;
 
     switch (consumo) {
         case 'A':
             
             tipoConsumo += 10000;             
             break;
         case 'B':
             tipoConsumo += 8000;
             break;
             
         case 'C':
             tipoConsumo += 7000;
             break;
             
         case 'D':
             
             tipoConsumo += 5000;
             break;
     }
     
     
       if (peso > 0 && peso < 5) {
         tipoConsumo += 1000;
     }else if (peso>= 6 && peso < 8) {
         tipoConsumo += 2000;         
     } else if (peso > 8 && peso < 10) {
         tipoConsumo += 3000;         
     } else if (peso > 10 && peso < 12) {
         tipoConsumo += 4000;         
     }
   
       return PRECIO_BASE + tipoConsumo;
 } 
   
   
   
   
   
   
   
   
}
