public class Seiya extends CaballeroDeBronce{

	public Seiya(){
		super("Seiya",100,100,15,4,20);
		Habilidad[] habilidades= new Habilidad[3];
		habilidades[0]= new Habilidad("Meteoro Pegaso",20);
		habilidades[1]= new Habilidad("Golpe fuerte",10);
		habilidades[2]= new Habilidad("Golpe muy fuerte",25);
		super.setHabilidades(habilidades);		
		
	}

}