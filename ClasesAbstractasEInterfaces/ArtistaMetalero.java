public class ArtistaMetalero extends Artista{
	public ArtistaMetalero(String nombre){
		super(nombre);
	}
	public void tocar(){
		System.out.println(getNombre()+" esta tocando metal...");
	}

}