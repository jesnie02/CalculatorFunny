import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
    public static void main(String[] args)
    {
        Application.launch();
    }
    public void start(Stage primaryStage) throws Exception
    {
        FXMLLoader calculatorLoader = new FXMLLoader(getClass().getResource("/CalculatorWindow.fxml"));
        Parent root = calculatorLoader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }
}