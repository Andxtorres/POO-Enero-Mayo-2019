public class Usuario{
	private String name;
	private String password;

	public Usuario(String name,String password){
		this.name=name;
		this.password=password;
	}

	public String getPassword(){
		return password;
	}

	public String getName(){
		return name;
	}

	public String saludar(){
		return "Hola yo soy "+name;
	}
}