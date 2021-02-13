
public class Gato {

	private double energia;
	private double posicion;


	public double getEnergia() {
		return energia;
	}

	public void setEnergia(double energia) {
		this.energia = energia;
	}
	
	public double VelocidadTom() {
		return 5 + (getEnergia() / 10);
	}
	
	public boolean TomPuedeAtraparaJerry(Raton jerry) {
		
		return this.VelocidadTom() > jerry.VelocidaddeJerry();
		
	}

	public double getPosicion() {
		return posicion;
	}

	public void setPosicion(double posicion) {
		this.posicion = posicion;
	}
	
	public void TomCorreaJerry(Raton jerry){
		
		double distancia = jerry.getPosicion() -  this.posicion;
		double ConsumodeEnergia = 0.5 * distancia * this.VelocidadTom();
		this.setEnergia(this.energia - ConsumodeEnergia);
		
		this.posicion = jerry.getPosicion();
		
	}
}
