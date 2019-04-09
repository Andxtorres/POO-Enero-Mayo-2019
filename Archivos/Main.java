import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.input.MouseEvent;
import javafx.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Main extends Application{
	private Label nombreL,telefonoL,posL;
	private TextField nombreT,telefonoT,posT;
	private Button agregarButton,saveButton,loadButton;
	private Agenda agenda;
	private VBox agendaGui;
	public static void main(String[] args){
		launch(args);
	}

	public void start(Stage primaryStage){
		agenda= new Agenda();
		VBox newContactFromBox= new VBox();
		nombreL= new Label("Nombre");
		telefonoL= new Label("Teléfono");
		posL= new Label("posT");
		nombreT= new TextField();
		telefonoT= new TextField();
		posT= new TextField();
		agregarButton= new Button("Agregar");
		saveButton= new Button("Guardar");
		loadButton= new Button("Cargar");
		agregarButton.addEventHandler(
			MouseEvent.MOUSE_CLICKED,
			new EventHandler<MouseEvent>(){
				public void handle(MouseEvent e){
					Contacto c= new Contacto(nombreT.getText(),telefonoT.getText());
					agenda.addContacto(c,Integer.parseInt(posT.getText()));
					imprimirAgenda();
				}
			}
		);
		saveButton.addEventHandler(
			MouseEvent.MOUSE_CLICKED,
			new EventHandler<MouseEvent>(){
				public void handle(MouseEvent e){
					try{
						FileOutputStream fout = new FileOutputStream("agenda.atm");
						ObjectOutputStream oos = new ObjectOutputStream(fout);
						oos.writeObject(agenda);
						oos.close();
					}catch(IOException ex){

					}


				}
			}
		);
		loadButton.addEventHandler(
			MouseEvent.MOUSE_CLICKED,
			new EventHandler<MouseEvent>(){
				public void handle(MouseEvent e){
					try{
						File selectedFile = new File("agenda.atm");
						FileInputStream fin = new FileInputStream(selectedFile);
						ObjectInputStream ois = new ObjectInputStream(fin);
						agenda=(Agenda) ois.readObject();
						imprimirAgenda();
					}catch(IOException ex){
						ex.printStackTrace();
					}catch(ClassNotFoundException ex){
						ex.printStackTrace();
					}


				}
			}
		);				
		newContactFromBox.getChildren().add(nombreL);
		newContactFromBox.getChildren().add(nombreT);
		newContactFromBox.getChildren().add(telefonoL);
		newContactFromBox.getChildren().add(telefonoT);
		newContactFromBox.getChildren().add(posL);
		newContactFromBox.getChildren().add(posT);

		newContactFromBox.getChildren().add(agregarButton);
		newContactFromBox.getChildren().add(saveButton);
		newContactFromBox.getChildren().add(loadButton);

		HBox hboxPrincipal= new HBox();
		agendaGui= new VBox();
		imprimirAgenda();
		hboxPrincipal.getChildren().add(newContactFromBox);
		hboxPrincipal.getChildren().add(agendaGui);

		Scene scene= new Scene(hboxPrincipal);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void imprimirAgenda(){
		agendaGui.getChildren().clear();
		for(int i=0;i<agenda.getContactos().length;i++){
			if(agenda.getContactos()[i]!=null){
				agendaGui.getChildren().add(new Label((i+1)+".- "+agenda.getContactos()[i].getNombre()));
			}else{
				agendaGui.getChildren().add(new Label((i+1)+".- Vacío"));

			}
		}
	}

}
