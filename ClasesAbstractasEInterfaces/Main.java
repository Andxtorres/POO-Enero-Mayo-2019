public class Main{
	public static void main(String args[]){

		Artista a= new ArtistaAlternativo("El recodo");
		Artista am= new ArtistaMetalero("Megadeth");
		Artista[] artistas= new Artista[2];
		artistas[0]=a;
		artistas[1]=am;
		for(int i=0;i<artistas.length;i++){
			artistas[i].tocar();
			artistas[i].irDeGira();
			artistas[i].separarse();
		}

	
	}


}