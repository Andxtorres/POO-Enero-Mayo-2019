import javafx.scene.layout.*;
import javafx.scene.control.*;
public class Mapa extends VBox{
	private Casilla[][] casillas;
	private Main main;

	public Mapa(Main main,String titulo,int casillasX,int casillasY){
		this.main=main;
		GridPane grid= new GridPane();
		Label label= new Label(titulo);
		casillas= new Casilla[casillasX][casillasY];
		for(int i=0;i<casillas.length;i++){
			for(int j=0;j<casillas[i].length;j++){
				System.out.println("Crea casilla "+i+" "+j);
				casillas[i][j]= new Casilla();
				grid.add(casillas[i][j],i,j);
			}
		}	
		getChildren().add(label);
		getChildren().add(grid);
		casillas[0][0].setCaballeroDeBronce(main.getCaballeroDeBronce());
		casillas[7][4].setCaballeroDeOro(new CaballeroDeOro("Mu",40,20,15,10));
		pintarMapa();
	}

	public Casilla[][] getCasillas(){
		return casillas;
	}

	public void pintarMapa(){
		for(int i=0;i<casillas.length;i++){
			for(int j=0;j<casillas[i].length;j++){
				casillas[i][j].pintarCasilla();
			}
		}	
	}

	public Mapa getNextMap(){
		return new Mapa2(main);
	}


}