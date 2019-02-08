public class Main{
	public static void main(String args[]){
		ChequeDePago cheque= new ChequeDePago();
		AutoNuevo auto= new AutoNuevo();
		auto.precio=1000;
		cheque.setAuto(auto);
		System.out.println(cheque.getAuto().calcularPrecioSeguro());
	}
}