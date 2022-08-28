import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args)  throws Exception  {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("views/MainScene.fxml"));
        Scene scene1 = new Scene(root, 300, 250);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
   
}
