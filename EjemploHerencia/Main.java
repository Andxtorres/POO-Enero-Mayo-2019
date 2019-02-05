public class Main{
	public static void main(String args[]){
		CaballeroDeBronce cb= new CaballeroDeBronce("Seiya",100,100,15,4,20);
		CaballeroDeOro co= new CaballeroDeOro("Mascara de la muerte",50,200,5,3);
		System.out.println(cb.toString());
		System.out.println(co.toString());
		cb.atacar(co);
		co.atacar(cb);
		System.out.println(cb.toString());
		System.out.println(co.toString());
	}
}