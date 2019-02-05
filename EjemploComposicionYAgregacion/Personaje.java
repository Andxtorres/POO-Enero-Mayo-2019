
public class Personaje{
	private String nombre;
	private int hp;
	private int nivel;
	private int energia;
	private int ataque;
	private int defensa;
	public Personaje(String nombre, int hp,int energia,int ataque,int defensa){
		this.nombre=nombre;
		this.hp=hp;
		this.energia=energia;
		this.ataque=ataque;
		this.defensa=defensa;
	}

	public Personaje(String nombre){
		this.nombre=nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getNombre(){
		return nombre;
	}
	public void setHp(int hp){
		this.hp=hp;
	}
	public int getHp(){
		return hp;
	}

	public void setNivel(int nivel){
		this.nivel=nivel;
	}
	public int getNivel(){
		return nivel;
	}

	public void setEnergia(int energia){
		this.energia=energia;
	}

	public int getEnergia(){
		return energia;
	}
	public void setAtaque(int ataque){
		this.ataque=ataque;
	}
	public int setAtaque(){
		return ataque;
	}
	public void setDefensa(int defensa){
		this.defensa=defensa;
	}
	public int getDefensa(){
		return defensa;
	}

	public String toString(){
		return "Personaje: "+nombre+" HP: "+hp+" nivel: "+nivel+" ataque: "+ataque+" defensa: "+defensa;
	}

	public void atacar(Personaje enemigo){
		enemigo.setHp(enemigo.getHp()-(ataque-enemigo.getDefensa()));
	}



}