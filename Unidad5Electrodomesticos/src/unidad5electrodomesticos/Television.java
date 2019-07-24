
package unidad5electrodomesticos;


public class Television extends Electrodomesticos {
    
    public int resolucion;
    public boolean sintonizadorTDT;
    public final static int RESOLUCION_POR_DEFECTO = 20;
    public final static boolean SINTONIZADORTDT_POR_DEFECTO = false;

    public Television(int resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Television(int resolucion, boolean sintonizadorTDT, int precioBase, int peso) {
        super(precioBase, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Television(int resolucion, boolean sintonizadorTDT, int precioBase, String color, char consumo, int peso) {
        super(precioBase, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Television(int resolucion, boolean sintonizadorTDT, int PRECIO_BASE, int PESO, char CONSUMO_ENERGETICO, String COLOR_POR_DEFCTO) {
        super(PRECIO_BASE, PESO, CONSUMO_ENERGETICO, COLOR_POR_DEFCTO);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

        
    
    public int resolucion () {
        
        return this.resolucion;
    }
    
    public boolean sintonizadorTDT () {
        
        return this.sintonizadorTDT;    
    }
    
    
    public double precioFinal () {
    
        double precioAdicional = super.precioFinal();
        
        if (resolucion > 40) {
            
            precioAdicional += precioBase *0.3;            
        }
        if (sintonizadorTDT) {
            precioAdicional+=7000;
        }
        
        return precioAdicional;
    }
    
    
}
