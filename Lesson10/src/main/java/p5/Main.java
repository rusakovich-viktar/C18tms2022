package p5;//package p5;
//
//import org.openjfx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//public class Main extends Application {
//    private int idControl;
//
//    public static void main(String[] args) {
//        Application.launch(args);
//    }
//
//    @Override
//    public void start(Stage stage) {
//        // установка надписи
//        Text text = new Text("Мое первое приложение!");
//        text.setLayoutY(80);    // установка положения надписи по оси Y
//        text.setLayoutX(100);   // установка положения надписи по оси X
//
//        Button button = new Button();
//        button.setLayoutY(90);
//        button.setLayoutX(100);
//        button.setText("Нажми меня");
//
//
//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                text.setText(++idControl + "");
//            }
//        });
//
//        Group group = new Group(text, button);
//        Scene scene = new Scene(group);
//        stage.setScene(scene);
//        stage.setTitle("First Application");
//        stage.setWidth(300);
//        stage.setHeight(250);
//        stage.show();
//    }
//}