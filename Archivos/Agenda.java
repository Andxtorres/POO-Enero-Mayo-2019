import java.io.Serializable;

public class Agenda implements Serializable{
	private Contacto[] contactos;

	public Agenda(){
		contactos= new Contacto[50];
	}

	public Contacto[] getContactos(){
		return contactos;
	}

	public void addContacto(Contacto contacto, int index){
		contactos[index]=contacto;
	}
}