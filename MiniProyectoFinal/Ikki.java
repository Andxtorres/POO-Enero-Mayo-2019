public class Ikki extends CaballeroDeBronce{

	public Ikki(){
		super("Ikki",100,100,15,4,20);
		Habilidad[] habilidades= new Habilidad[3];
		habilidades[0]= new Habilidad("Meteoro Pegaso",20);
		habilidades[1]= new Habilidad("Golpe fuerte",10);
		habilidades[2]= new Habilidad("Golpe muy fuerte",25);
		super.setHabilidades(habilidades);		
		
	}
	public void atacar(Personaje enemigo){
		System.out.println("Ataque normal de Ikki");
		enemigo.setHp(enemigo.getHp()-(getAtaque()-enemigo.getDefensa()));
	}

}