package app;

/*import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Leonar extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("app.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}*/

//import gnu.io.*;
//import gnss.*;
import com.*;

import java.io.IOException;
//import java.util.Enumeration;

public class Leonar {

	public static void main(String[] args) {
		System.out.println("Program Started!!!");
		
		// debug Position
		//Position test = new Position();
		//Position test2 = new Position(2.0f, CardinalDirection.South, 4.5f, CardinalDirection.West);
		
		// debug com
		
		/*CommPortIdentifier serialPortId;
		Enumeration enumComm;
		
		enumComm = CommPortIdentifier.getPortIdentifiers();
		
		while(enumComm.hasMoreElements()) {
			serialPortId = (CommPortIdentifier)enumComm.nextElement();
			if(serialPortId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
				System.out.println(serialPortId.getName());
			}
		}*/
		
		// debug Communicator
		try {
			Communicator test = new Communicator("COM3",9600);
			test.closeUSB();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Program Finished Sucessfully");
	}

}
