public class ArtistaAlternativo extends Artista{

	public ArtistaAlternativo(String nombre){
		super(nombre);
	}

	public void tocar(){
		System.out.println(getNombre()+" está tocando alternativo");
	}


}