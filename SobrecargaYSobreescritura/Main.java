public class Main{
	public static void main(String args[]){

		Shaun cb= new Shaun();
		CaballeroDeOro co= new CaballeroDeOro("Mascara de la muerte",50,200,5,3);
		Objeto o= new Objeto("Espada",100);
		Objeto o1= new Objeto("Escudo",100);
		cb.addObjetoToMochila(o,0);
		cb.addObjetoToMochila(o1,2);
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
	}
}