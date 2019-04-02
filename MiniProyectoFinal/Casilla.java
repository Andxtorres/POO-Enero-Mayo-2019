import javafx.scene.layout.*;
import javafx.scene.control.*;


public class Casilla extends StackPane{
	private Label label;
	private CaballeroDeBronce caballeroDeBronce;
	private CaballeroDeOro caballeroDeOro;
	public Casilla(){
		label= new Label("");
		getChildren().add(label);
	}

	public void pintarCasilla(){
		if(caballeroDeBronce==null){
			if(caballeroDeOro!=null){
				label.setText(caballeroDeOro.getNombre());
			}else{
				label.setText("   ");
			}
			


		}else{
			label.setText(caballeroDeBronce.getNombre());
		}
	}

	public void setCaballeroDeBronce(CaballeroDeBronce caballeroDeBronce){
		this.caballeroDeBronce=caballeroDeBronce;
	}


	public CaballeroDeBronce getCaballeroDeBronce(){
		return caballeroDeBronce;
	}

	public CaballeroDeOro getCaballeroDeOro(){
		return caballeroDeOro;
	}

	public void setCaballeroDeOro(CaballeroDeOro caballeroDeOro){
		this.caballeroDeOro=caballeroDeOro;
	}


}