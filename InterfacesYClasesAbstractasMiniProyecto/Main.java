import java.util.Scanner;


public class Main{

	public static void main(String args[]){
		System.out.println("Que personaje quieres usar? 1)Seiya 2)Shaun");
		Scanner sc= new Scanner(System.in);
		CaballeroDeBronce cb;
		switch(sc.nextInt()){
			case 1: 
				cb= new Seiya();
				break;
			case 2:
				cb= new Shaun();
				break;
			default:
				cb= null;
				System.out.println("Personaje no encontrado");
				break;
		}
		
		CaballeroDeOro co= new CaballeroDeOro("Mascara de la muerte",50,200,5,3);
		Objeto o= new Arma("Espada",100);
		Objeto o1= new ObjetoDefensa("Escudo",100);

		cb.addObjetoToMochila(o,0);
		cb.addObjetoToMochila(o1,2);
		Batalla.iniciarBatalla(cb,co);
		

		/*
		System.out.println(cb.toString());
		System.out.println(co.toString());
		cb.atacar(co);
		cb.atacar(co,0.50);
		cb.atacar(co,cb.getHabilidades()[0]);
		co.atacar(cb);
		System.out.println(cb.toString());
		System.out.println(co.toString());
		System.out.println(cb.imprimeInventario());
		System.out.println(cb.imprimeHabilidades());
		*/
	}
}