package lk.ijse.pos.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import lk.ijse.pos.bo.BOFactory;
import lk.ijse.pos.bo.custom.impl.ItemBOimpl;
import lk.ijse.pos.dto.ItemDTO;

public class ItemController {

    public JFXTextField txtSearch;

    public JFXTextField txtCode;
    public JFXTextField txtItemDes;
    public JFXTextField txtItemQty;
    public JFXTextField txtItemPrice;

    ItemBOimpl itemBO= BOFactory.getInstance().getBo(BOFactory.BOType.ITEM);

    public void btnSaveOnAction(ActionEvent actionEvent) throws Exception {
        boolean b = itemBO.saveItem(new ItemDTO(txtCode.getText(), txtItemDes.getText(), Integer.parseInt(txtItemQty.getText()), Double.parseDouble(txtItemPrice.getText())));
        if(b){
            Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setContentText("Item Added Success...");
            alert.showAndWait();
        }
        txtCode.setText("");
        txtItemDes.setText("");
        txtItemQty.setText("");
        txtItemPrice.setText("");


    }

    public void btnUpdateOnAction(ActionEvent actionEvent) throws Exception {
        itemBO.updateItem(new ItemDTO(txtCode.getText(),txtItemDes.getText(),Integer.parseInt(txtItemQty.getText()),Double.parseDouble(txtItemPrice.getText())));

    }

    public void SearchOnAction(ActionEvent actionEvent) throws Exception {
        ItemDTO item=itemBO.getItem(txtSearch.getText());
        if(item !=null){
            txtCode.setText(item.getItemCode());
            txtItemDes.setText(item.getDescription());
            txtItemQty.setText(String.valueOf(item.getQty()));
            txtItemPrice.setText(String.valueOf(item.getPrice()));

        }
    }
}
