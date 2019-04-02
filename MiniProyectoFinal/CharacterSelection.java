import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.input.*;
public class CharacterSelection extends Scene{
	private Main main;
	public CharacterSelection(Main main){
		super(new GridPane());
		this.main=main;
		GridPane gridPane= (GridPane)super.getRoot();
		gridPane.setGridLinesVisible(true);
		Button seiyaButton= new Button();
		seiyaButton.setStyle("-fx-background-image:url('assets/seiya.jpg');");
		seiyaButton.setMinHeight(400);
		seiyaButton.setMinWidth(200);
		seiyaButton.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){
			public void handle(MouseEvent e){
				CaballeroDeBronce cb= new Seiya();
				main.setCaballeroDeBronce(cb);
				main.openGame();
			}
		});
		Button shaunButton= new Button();
		shaunButton.setStyle("-fx-background-image:url('assets/shaun.jpg');");
		shaunButton.setMinHeight(400);
		shaunButton.setMinWidth(200);
		shaunButton.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){
			public void handle(MouseEvent e){
				CaballeroDeBronce cb= new Shaun();
				main.setCaballeroDeBronce(cb);
				main.openGame();
			}
		});	
		Button ikkiButton= new Button();
		ikkiButton.setStyle("-fx-background-image:url('assets/ikki.jpg');");
		ikkiButton.setMinHeight(400);
		ikkiButton.setMinWidth(200);		
		ikkiButton.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){
			public void handle(MouseEvent e){
				CaballeroDeBronce cb= new Ikki();
				main.setCaballeroDeBronce(cb);
				main.openGame();
			}
		});
		Button shiryuButton= new Button();
		shiryuButton.setStyle("-fx-background-image:url('assets/shiryu.jpg');");
		shiryuButton.setMinHeight(400);
		shiryuButton.setMinWidth(200);			
		shiryuButton.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){
			public void handle(MouseEvent e){
				CaballeroDeBronce cb= new Shiryu();
				main.setCaballeroDeBronce(cb);
				main.openGame();
			}
		});					
		gridPane.add(seiyaButton,0,0);
		gridPane.add(shaunButton,1,0);
		gridPane.add(ikkiButton,2,0);
		gridPane.add(shiryuButton,3,0);

		
	}



}
