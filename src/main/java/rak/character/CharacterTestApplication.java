package rak.character;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import rak.utility.ResourceLoader;

import java.io.IOException;

public class CharacterTestApplication extends Application {
	private static Stage primaryStage;
	
	public final static String MAIN_MENU = "MainView";
	public final static long DEFAULT_SEED = 123;
	public final static int DEFAULT_DENSITY = 400;
	
	public static void main(String[] args) {
        ResourceLoader.setRootClass(CharacterTestApplication.class);
		launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		CharacterTestApplication.primaryStage = primaryStage;
		
        primaryStage.setTitle("Character Tester");
        primaryStage.getIcons().add(new Image(ResourceLoader.getResourceAsStream("images/Logo Icon.png")));
        setScene(MAIN_MENU);
        primaryStage.show();
	}
	
	public static void setScene(String sceneName){
		try {
			Scene scene = ResourceLoader.loadFXML(sceneName);
			primaryStage.setScene(scene);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
