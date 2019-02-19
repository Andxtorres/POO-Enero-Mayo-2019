public class Shaun extends CaballeroDeBronce{

	public Shaun(){
		super("Shaun",100,100,15,4,20);
		Habilidad[] habilidades= new Habilidad[3];
		habilidades[0]= new Habilidad("Cadena de andrómeda",20);
		habilidades[1]= new Habilidad("Golpe fuerte",10);
		habilidades[2]= new Habilidad("Golpe muy fuerte",25);
		super.setHabilidades(habilidades);		
		
	}
	public void atacar(Personaje enemigo){
		System.out.println("Ataque normal de Shaun");
		enemigo.setHp(enemigo.getHp()-(getAtaque()-enemigo.getDefensa()));
	}
	public String toString(){
		return "Estoy en Shaun: "+getNombre()+" HP: "+getHp()+" nivel: "+getNivel()+" ataque: "+getAtaque()+" defensa: "+getDefensa();
	}	
}