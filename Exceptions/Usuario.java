public class Usuario{

	private String nombre;
	private int edad;

	public Usuario(String nombre, int edad) throws EdadNegativaException{
		this.nombre=nombre;
		if(edad<0){
			throw new EdadNegativaException();
		}
		this.edad= edad;
	}

	public String getNombre(){
		return nombre;
	}

	public int getEdad(){
		return edad;
	}


}