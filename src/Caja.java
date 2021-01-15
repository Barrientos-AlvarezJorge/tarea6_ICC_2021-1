/**
 *
 * @author Janeth Pablo
 */

public class Caja{
    protected double ancho;
    protected double alto;
    protected double profundo;
    
    public Caja(double ancho, double alto, double profundo){
	this.ancho = ancho;
	this.alto = alto;
	this.profundo = profundo;
    }
    
    public double volumen(){
	return ancho * alto * profundo;
    }

    public String toString(){
	String ret = "Ancho =  " + ancho
	    + "\nAlto =  " + alto
	    + "\nProfundo =  " + profundo + "\n";
	return ret;
    }

    public static void main(String []args){
	Caja caja = new Caja (5.3, 3.2 ,2.5);
	System.out.println(caja + "Volumen = " + caja.volumen());
    }
}
