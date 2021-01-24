package lk.ijse.pos.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MainFormController {
    public AnchorPane root;

    public void onCustomerClick(MouseEvent mouseEvent) throws IOException {
//        Parent root = FXMLLoader.load(this.getClass().getResource("/lk/ijse/pos/view/MainForm.fxml"));
//        Stage stage=new Stage();
//        stage.setScene(new Scene(root));
//        stage.show();
        URL resource = this.getClass().getResource("/lk/ijse/pos/view/CustomerForm.fxml");
        Parent parent=FXMLLoader.load(resource);
        Scene scene=new Scene(parent);
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.show();


//        setUI("CustomerForm.fxml");






    }

    private void setUI(String location) throws IOException {
        this.root.getChildren().clear();
        this.root.getChildren().add(FXMLLoader.load(this.getClass().getResource("/lk/ijse/pos/view/" + location)));
    }




    public void onItemClick(MouseEvent mouseEvent) throws IOException {

        URL resource = this.getClass().getResource("/lk/ijse/pos/view/ItemForm.fxml");
        Parent parent=FXMLLoader.load(resource);
        Scene scene=new Scene(parent);
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void onOrderClick(MouseEvent mouseEvent) {

    }
}
