package ru.sapteh;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage Stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/view/MainWindow.fxml"));
        Stage.setTitle("Main Window");
        Stage.getIcons().add(new Image("/images/icon.png"));
        Stage.setScene(new Scene(root));
        Stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}