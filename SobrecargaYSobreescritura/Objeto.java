public class Objeto{
	private String nombre;
	private int puntos;

	public Objeto(String nombre,int puntos){
		this.nombre=nombre;
		this.puntos=puntos;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setPuntos(int puntos){
		this.puntos=puntos;
	}

	public int getPuntos(){
		return puntos;
	}
}