package gtest;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

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

}
