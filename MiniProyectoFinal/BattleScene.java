import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.event.*;

public class BattleScene extends Scene{
	private Personaje personaje2;
	private CaballeroDeBronce personaje1;
	private Label battleLabel,heroStats,enemyStats;
	private Main main;
	private MainGameScene scene;

	public BattleScene(CaballeroDeBronce personaje1,Personaje personaje2,Main main,MainGameScene scene){
		super(new BorderPane());
		this.scene=scene;
		this.main=main;
		this.personaje1=personaje1;
		this.personaje2=personaje2;
		BorderPane borderPane=(BorderPane)super.getRoot();
		borderPane.setTop(new Label("Batalla"));
		VBox heroVbox= new VBox();
		heroStats=new Label(personaje1.toString());
		heroVbox.getChildren().add(new Label(personaje1.getNombre()));
		heroVbox.getChildren().add(heroStats);
		borderPane.setLeft(heroVbox);
		VBox enemyVbox= new VBox();
		enemyStats=new Label(personaje2.toString());
		enemyVbox.getChildren().add(new Label(personaje2.getNombre()));		
		enemyVbox.getChildren().add(enemyStats);
		
		borderPane.setRight(enemyVbox);
		battleLabel= new Label("La batalla entre: "+personaje1.getNombre()+" y "+personaje2.getNombre()+" va a comenzar" );
		borderPane.setCenter(battleLabel);
		HBox hboxBotones= new HBox();
		Button atacarButton= new Button("Atacar");
		atacarButton.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){
			public void handle(MouseEvent e){
				personaje1.atacar(personaje2);
				battleLabel.setText(battleLabel.getText()+"\n"+personaje1.getNombre()+" atacó...");
				enemyStats.setText(personaje2.toString());
				if(personaje2.getHp()<=0){
					scene.getMapa().getCasillas()[personaje1.getX()][personaje1.getY()].setCaballeroDeOro(null);
					main.returnToMap(scene);

				}
				personaje2.atacar(personaje1);
				battleLabel.setText(battleLabel.getText()+"\n"+personaje2.getNombre()+" atacó...");
				heroStats.setText(personaje1.toString());
			}
		});
		hboxBotones.getChildren().add(atacarButton);
		borderPane.setBottom(hboxBotones);
	}


}