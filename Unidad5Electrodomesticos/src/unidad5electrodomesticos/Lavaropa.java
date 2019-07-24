
package unidad5electrodomesticos;

public class Lavaropa extends Electrodomesticos {
    
    int carga ;
    
    public final static int CARGA_POR_DEFECTO = 5;
    
    public int getcarga () {
        
        return this.carga;    
    }

    public Lavaropa(int precioBase, int peso) {
        super(precioBase, peso);
    }

    public Lavaropa(int precioBase, String color, char consumo, int peso) {
        super(precioBase, color, consumo, peso);
    }

    public Lavaropa(int carga, int PRECIO_BASE, int PESO, char CONSUMO_ENERGETICO, String COLOR_POR_DEFCTO) {
        super(PRECIO_BASE, PESO, CONSUMO_ENERGETICO, COLOR_POR_DEFCTO);
        this.carga = carga;
    }
    
    
    public double precioFinal () {
    
    double costoAdicional = super.precioFinal();
    
        if (carga > 30) {
            
            costoAdicional += 10000;
        } else if (carga  >0 && carga < 19) {
            
            costoAdicional += 5000;            
        } else if (carga > 20 && carga < 49) {
            costoAdicional += 10000;
        } else if (carga > 50 && carga < 69) {
            costoAdicional += 17000;
        } else if (carga >70) {
            costoAdicional += 25000;
            
        }      
        
        return costoAdicional;
    }
    
    
    

   
    }
    
    
    

