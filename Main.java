package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");



        StackPane pane=new StackPane(new CirclePane());



        primaryStage.setScene(new Scene(pane, 400, 300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

class CirclePane extends Pane{
    Circle circle=new Circle(10);

    class CircleHandler implements EventHandler<MouseEvent>{

        public void handle(MouseEvent e){
            move();
        }

    }

    public  CirclePane(){



        circle.setStroke(Color.BLACK);
        circle.setOnMouseClicked(new CircleHandler());
        circle.setFill(Color.color(Math.random(),Math.random(),Math.random()));
        circle.setCenterX(Math.random()*(getWidth()-20)+20);
        circle.setCenterY(Math.random()*(getWidth()-20)+20);

        getChildren();
        getChildren().add(circle);

    }

    public void move(){

        circle.setFill(Color.color(Math.random(),Math.random(),Math.random()));
        circle.setCenterX(Math.random()*(getWidth()-25)+20);
        circle.setCenterY(Math.random()*(getHeight()-25)+20);

    }



}
