public abstract class Envio{
	private double precioBase;
	private int ancho;
	private int largo;
	private int alto;
	private int distancia;

	public Envio(int ancho,int largo,int alto,int distancia){
		precioBase=1000.00;
		this.ancho=ancho;
		this.largo=largo;
		this.alto=alto;
		this.distancia=distancia;
	}

	public double getPrecioBase(){
		return precioBase;
	}

	public int getAncho(){
		return ancho;
	}

	public int getLargo(){
		return largo;
	}

	public int getAlto(){
		return alto;
	}
	public int getDistancia(){
		return distancia;
	}

	public abstract double calcularPrecio();

}