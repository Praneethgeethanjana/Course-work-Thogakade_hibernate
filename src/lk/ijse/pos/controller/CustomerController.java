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

public class CustomerController {

    public TextField txtID;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtSalary;
    public TableView tblCustomer;
    public TableColumn tblCusID;
    public TableColumn tblCusName;
    public TableColumn tblAddress;
    public TableColumn tblSalary;
    public TableColumn tblOperator;
    public JFXTextField txtSearch;

    CustomerBOimpl customerBO= BOFactory.getInstance().getBo(BOFactory.BOType.CUSTOMER);


    public void btnOnSaveAction(ActionEvent actionEvent) throws Exception {
        boolean b = customerBO.saveCustomer(new CustomerDTO(txtID.getText(),txtName.getText(), txtAddress.getText(),Double.parseDouble(txtSalary.getText())));

        if(b){
            Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setContentText("Customer Added Fail...");
            alert.showAndWait();
        }


    }

    public void btnUpdateOnAction(ActionEvent actionEvent) throws Exception {
        customerBO.updateCustomer(new CustomerDTO(
                txtID.getText(),txtName.getText(),txtAddress.getText(),Double.parseDouble(txtSalary.getText())
        ));

    }

    public void SearchOnAction(ActionEvent actionEvent) throws Exception {
        CustomerDTO customer=customerBO.getCustomer(txtSearch.getText());
        if(customer != null){
            txtID.setText(customer.getId());
            txtName.setText(customer.getName());
            txtAddress.setText(customer.getAddress());
            txtSalary.setText(String.valueOf(customer.getSalary()));
        }




    }
}
