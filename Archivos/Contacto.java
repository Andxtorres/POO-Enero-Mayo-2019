import java.io.Serializable;

public class Contacto implements Serializable{
	private String nombre;
	private String telefono;

	public Contacto(String nombre,String telefono){
		this.nombre=nombre;
		this.telefono=telefono;
	}

	public String getNombre(){
		return nombre;
	}

	public String getTelefono(){
		return telefono;
	}

}