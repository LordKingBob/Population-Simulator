package com.sci.populationsimulator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Main Frame of Population Simulator
 *
 */
public class App extends Application
{
    public static void main( String[] args )
    {
        launch();
    }


    /**
     *
     * @param stage
     * @throws Exception
     *
     * We will need to split this up into seperate methods and functions in order to stay organized. Also inherit classes to add function as nessesary.
     */
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();
        MenuBar mB = new MenuBar();
        Menu menu = new Menu("File");
        menu.getItems().add(new MenuItem("New")); // We'll have to expand to add function to the MenuItem
        menu.getItems().add(new MenuItem("Open"));
        mB.getMenus().add(menu);
        VBox tiles = new VBox(mB);
        pane.setTop(tiles);

        Scene scene = new Scene(pane);
        stage.setTitle("Population Simulator");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }
}
