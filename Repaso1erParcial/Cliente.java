public class Cliente{
	private String nombre,correo,numeroTel,direccion;
	private ChequeDePago[] cheques;
	public Cliente(){
		cheques= ChequeDePago[3];
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public void setCorreo(String correo){
		this.correo=correo;
	}
	public String getCorreo(){
		return correo;
	}
	public void setNumeroTel(String numeroTel){
		this.numeroTel=numeroTel;
	}
	public String getNumeroTel(){
		return numeroTel;
	}

	public void setDireccion(String direccion){
		this.direccion=direccion;
	}

	public String getDireccion(){
		return direccion;
	}

	public void addCheque(ChequeDePago cheque, int index){
		cheques[index]=cheque;
	}
	public void removeCheque(int index){
		cheques[index]=null;
	}
}