/**
 * Clase PesoCaja de la tarea 6 del curso de ICC
 * @author Jorge Miguel Aaron Barrientos Alvarez. NC:421111666
 * @since Curso de ICC 2021-1
 * @version 1.0 Enero 2021
 */

public class PesoCaja extends Caja{

    /** Peso de la caja. */
    protected double peso;
    
    /**
     * Metodo constructor
     * @param ancho el ancho de la caja
     * @param alto el alto de la caja
     * @param profundo la profundid de la caja
     * @param peso el peso dimensional de la caja
     */ 
    public PesoCaja(double ancho, double alto, double profundo){
	super(ancho, alto, profundo);
	/**
	 * El peso dimensional es igual al volumen de la caja entre 
	 * 5000 (cm^3/kg). Como las dimensiones de las cajas son en 
	 * cm, el volumen es en cm, por lo tanto al dividir entre 
	 * 5000 (cm^3/kg) las unidades resultantes son kilogramos.
	 */
	this.peso=this.volumen()/5000;
    }         

    @Override
    public String toString(){
	String ret="Ancho = "+ this.ancho+" cm"
	    +"\nAlto = "+ this.alto+" cm"
	    +"\nProfundo = "+ this.profundo+" cm"
	    +"\nPeso dimensional = "+this.peso+" kg\n";
	return ret;
    }

    public static void main(String[] args){
	PesoCaja caja1=new PesoCaja(5.3,3.2,2.5);
	PesoCaja caja2=new PesoCaja(100.2, 50.5, 80.3);
	PesoCaja caja3=new PesoCaja(123, 100, 80);
		
	System.out.println("\nCaja 1:\n"+caja1
			   +"\nCaja 2:\n"+caja2
			   +"\nCaja 3:\n"+caja3);
    }
}
