public class CaballeroDeBronce extends Personaje{
	private int poderEspecial;
	private Objeto[] mochila;

	public CaballeroDeBronce(String nombre,int hp,int energia, int ataque,int defensa,int poderEspecial){
		super(nombre,hp,energia,ataque,defensa);
		mochila= new Objeto[3];
		this.poderEspecial= poderEspecial;
	}

	public void setPoderEspecial(int poderEspecial){
		this.poderEspecial=poderEspecial;
	}

	public int getPoderEspecial(){
		return poderEspecial;
	}

	public Objeto[] getMochila(){
		return mochila;
	}

	public void addObjetoToMochila(Objeto o, int index){
		mochila[index]=o;
	}

	public void removeObjetoFromMochila(int index){
		mochila[index]=null;
	}

	public String imprimeInventario(){
		String resultado="Mochila: [";
		for(int i=0;i<mochila.length;i++){
			if(mochila[i]!=null){
			resultado= resultado+" Objeto: "
				+mochila[i].getNombre()
				+" puntos: "+ mochila[i].getPuntos()+",";				
			}else{
				resultado= resultado+" Vacío ,";					
			}
		}
		resultado= resultado+"]";
		return resultado;
	}











}