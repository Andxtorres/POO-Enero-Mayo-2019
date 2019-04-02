public abstract class CaballeroDeBronce extends Personaje implements AtaquesInterface{
	private Habilidad[] habilidades;
	private Objeto[] mochila;
	private int x,y;

	public CaballeroDeBronce(String nombre,int hp,int energia, int ataque,int defensa,int poderEspecial){
		super(nombre,hp,energia,ataque,defensa);
		mochila= new Objeto[3];
	}

	public Habilidad[] getHabilidades(){
		return habilidades;
	}

	public void setHabilidades(Habilidad[] habilidades){
		this.habilidades=habilidades;
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
	public String imprimeHabilidades(){
		String resultado="Habilidades: [";
		for(int i=0;i<habilidades.length;i++){

			resultado= resultado+" Habilidad: "
				+habilidades[i].getNombre()
				+" puntos: "+ habilidades[i].getPuntosEspeciales()+",";				

		}
		resultado= resultado+"]";
		return resultado;
	}
	public void atacar(Personaje enemigo, Habilidad habilidad){
		enemigo.setHp(enemigo.getHp()-(habilidad.getPuntosEspeciales()-enemigo.getDefensa()));
	}
	public void atacar(Personaje enemigo, Objeto objeto){
		enemigo.setHp(enemigo.getHp()-(objeto.getPuntos()-enemigo.getDefensa()));
	}

	public void setX(int x){
		this.x=x;
	}

	public int getX(){
		return x;
	}
	public void setY(int y){
		this.y=y;
	}

	public int getY(){
		return y;
	}
}