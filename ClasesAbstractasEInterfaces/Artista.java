public abstract class Artista implements AccionesDelArtista{
	private String nombre;
	public Artista(String nombre){
		this.nombre=nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public abstract void tocar();
	public void separarse(){
		System.out.println(getNombre()+" se separaron");
	}

	public void irDeGira(){
		System.out.println(getNombre()+" se van de gira " +a);

	}
}