public class CaballeroDeBronce extends Personaje{
	private Habilidad[] habilidades;
	private Objeto[] mochila;

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










}