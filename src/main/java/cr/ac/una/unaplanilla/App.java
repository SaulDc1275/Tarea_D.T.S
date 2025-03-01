package cr.ac.una.unaplanilla;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        int number;
       
        System.out.println("Digite su numero para calcular el Factorial");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        


 
        System.out.println("El resultado es: " + number);

//        long result = number + 1;
//        while(number != 0){
//            
//        result = number * result;
//        number--;
//        
//        }
//        System.out.println("El resultado es: " + result);
        
//        scene = new Scene(loadFXML("primary"), 640, 480);
//        stage.setScene(scene);
//        stage.show();
    }
    
    
    

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}