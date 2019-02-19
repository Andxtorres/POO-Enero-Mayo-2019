public class Habilidad{
	private String nombre;
	private int puntosEspeciales;
	public Habilidad(String nombre,int puntosEspeciales){
		this.nombre=nombre;
		this.puntosEspeciales=puntosEspeciales;
	} 
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public void setPuntosEspeciales(int puntosEspeciales){
		this.puntosEspeciales=puntosEspeciales;
	}
	public int getPuntosEspeciales(){
		return puntosEspeciales;
	}
}