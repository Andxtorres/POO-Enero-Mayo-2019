import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.*;

public class Main extends Application{
	private Stage primaryStage;
	private CaballeroDeBronce caballeroDeBronce;
	//private CharacterSelection characterSelection;
	public static void main(String[] args){
		launch(args);
	}

	public void start(Stage primaryStage){
		this.primaryStage= primaryStage;
		primaryStage.setScene(new CharacterSelection(this));
		primaryStage.show();
	}

	public void openGame(){
		primaryStage.setScene(new MainGameScene(this));
	}


	public void returnToMap(MainGameScene mainGameScene){
		primaryStage.setScene(mainGameScene);
	}

	public void openBattle(CaballeroDeBronce p1,Personaje p2,MainGameScene mgs){
		primaryStage.setScene(new BattleScene(p1,p2,this,mgs));
	}


	public void setCaballeroDeBronce(CaballeroDeBronce caballeroDeBronce){
		this.caballeroDeBronce=caballeroDeBronce;
	}

	public CaballeroDeBronce getCaballeroDeBronce(){
		return caballeroDeBronce;
	}







}