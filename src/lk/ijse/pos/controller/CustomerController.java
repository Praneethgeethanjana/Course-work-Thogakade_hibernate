package lk.ijse.pos.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import lk.ijse.pos.bo.BOFactory;
import lk.ijse.pos.bo.custom.impl.CustomerBOimpl;
import lk.ijse.pos.dto.CustomerDTO;
import lk.ijse.pos.entity.Customer;

import java.util.ArrayList;

public class CustomerController {


    public JFXTextField txtSearch;
    public JFXTextField txtCusID;
    public JFXTextField txtCusName;
    public JFXTextField txtCusSalary;
    public JFXTextField txtCusAddress;

    CustomerBOimpl customerBO= BOFactory.getInstance().getBo(BOFactory.BOType.CUSTOMER);


    public void btnOnSaveAction(ActionEvent actionEvent) throws Exception {
        boolean b = customerBO.saveCustomer(new CustomerDTO(txtCusID.getText(),txtCusName.getText(), txtCusAddress.getText(),Double.parseDouble(txtCusSalary.getText())));

        if(b){
            Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setContentText("Customer Added Success...");
            alert.showAndWait();


        }
        txtCusID.setText("");
        txtCusName.setText("");
        txtCusAddress.setText("");
        txtCusSalary.setText("");




    }

    public void btnUpdateOnAction(ActionEvent actionEvent) throws Exception {
        customerBO.updateCustomer(new CustomerDTO(
                txtCusID.getText(),txtCusName.getText(),txtCusAddress.getText(),Double.parseDouble(txtCusSalary.getText())
        ));

    }

    public void SearchOnAction(ActionEvent actionEvent) throws Exception {
        CustomerDTO customer=customerBO.getCustomer(txtSearch.getText());
        if(customer != null){
            txtCusID.setText(customer.getId());
            txtCusName.setText(customer.getName());
            txtCusAddress.setText(customer.getAddress());
            txtCusSalary.setText(String.valueOf(customer.getSalary()));
        }
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {


    }
}
