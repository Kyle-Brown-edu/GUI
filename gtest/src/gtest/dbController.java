package gtest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

public class dbController {



    @FXML
    public TableColumn<dataBaseItems, String> col_id;

    @FXML
    public TableColumn<dataBaseItems,Integer> col_quantity;

    @FXML
    public TableColumn<dataBaseItems, Float> col_cost;

    @FXML
    public TableColumn<dataBaseItems, Float> col_price;

    @FXML
    public TableColumn<dataBaseItems, String> col_sid;

    @FXML
    public RadioButton ExitB;

    @FXML
    public void exit_Button(ActionEvent event) {
        Stage stage = (Stage) ExitB.getScene().getWindow();
        stage.close();
    }

}
