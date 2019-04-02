public class EnvioPrioritario extends Envio{
	
	public EnvioPrioritario(int ancho,int largo,int alto,int distancia){
		super(ancho,largo,alto,distancia);
	}

	public double calcularPrecio(){
		return (getPrecioBase()*getAncho()*getLargo()*getAlto()*(getDistancia()/10))*1.20;
	}
	public double calcularPrecio(double descuento){
		return calcularPrecio()*(1-descuento);
	}	

}