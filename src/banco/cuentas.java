/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author juanh
 */
public class cuentas {
    
    	
	//atributos
	String titular;
	double cantidad;

	// Constructor
	public cuentas(){

	}
	
	public cuentas(String name,double cantida)
	{
		titular=name;

		if ( cantida < 0) {

			cantidad=0;
		} else {
            cantidad = cantida;
     }
 	} 

    public void retirar(double pisto) {
        if (cantidad - Math.abs(pisto) < 0) {
            cantidad = 0;
        } else {
            this.cantidad -= pisto;
        }
    }



		public void ingresar(double pisto) {
        	if(cantidad > 0){
            	this.cantidad += pisto;   
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    
    
    
    
}
