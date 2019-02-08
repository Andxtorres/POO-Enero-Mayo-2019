public class Auto{
	public String modelo;
	public int anio;
	public double precio;



	public double calcularPrecioSeguro(){
		return precio*1.15;
	}
}