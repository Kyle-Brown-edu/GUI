package gtest;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class dbController {


    @FXML
    private TableColumn<dataBaseItems, String> col_id;

    @FXML
    private TableColumn<dataBaseItems,Integer> col_quantity;

    @FXML
    private TableColumn<dataBaseItems, Float> col_cost;

    @FXML
    private TableColumn<dataBaseItems, Float> col_price;

    @FXML
    private TableColumn<dataBaseItems, String> col_sid;

}
