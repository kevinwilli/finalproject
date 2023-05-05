package edu.guilford;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class WelcomeScrn extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Welcome Screen");

        // Create buttons for owner and customer login
        Button ownerLoginButton = new Button("Owner Login");
        Button customerLoginButton = new Button("Customer Login");

        // Set event handlers for the buttons
        ownerLoginButton.setOnAction(event -> openOwnerLogin());
        customerLoginButton.setOnAction(event -> openCustomerLogin());

        // Create a vertical layout and add the buttons
        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(20));

        layout.getChildren().addAll(ownerLoginButton, customerLoginButton);

        // Set the layout as the scene content and with a bige size
        Scene scene = new Scene(layout, 600, 400);
        scene.setFill(Color.BLUE);
        // Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
         //we want to make the background color of the scene to be blue
        // scene.setFill(Color.BLUE);
        primaryStage.show();
       
        
    }

    private void openOwnerLogin() {
        // Create a new stage for the owner screen
        Stage ownerStage = new Stage();
        ownerStage.setTitle("Owner Login");

        // Create GUI components for the owner screen
        Label titleLabel = new Label("Properties Owned:");
        ListView<String> propertyListView = new ListView<>();
        Button addPropertyButton = new Button("Add Property");

        // Add sample property details to the property list view
        propertyListView.getItems().addAll(
                "Property 1 - For Sale - $250,000",
                "Property 2 - For Rent - $1,200/month",
                "Property 3 - For Sale - $350,000");

        // Create a vertical layout for the owner screen
        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(titleLabel, propertyListView, addPropertyButton);

        // Set the layout as the scene content
        Scene scene = new Scene(layout, 400, 300);
        ownerStage.setScene(scene);

        // Show the owner screen
        ownerStage.show();
    }

    private void openCustomerLogin() {
        // Code to open the GUI for customer login
        // Replace with your implementation
        // System.out.println("Customer login screen opened.");
    }
}
