public class CaballeroDeBronce extends Personaje{
	private int poderEspecial;
	public CaballeroDeBronce(String nombre,int hp,int energia, int ataque,int defensa,int poderEspecial){
		super(nombre,hp,energia,ataque,defensa);
		this.poderEspecial= poderEspecial;
	}

	public void setPoderEspecial(int poderEspecial){
		this.poderEspecial=poderEspecial;
	}

	public int getPoderEspecial(){
		return poderEspecial;
	}
}