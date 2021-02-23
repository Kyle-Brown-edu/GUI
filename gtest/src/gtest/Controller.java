package gtest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {

    @FXML
    public Button exitBtn;

    @FXML
    public Button signBtn;

    @FXML
    public String userName;

    @FXML
    public String passWord;

    //Retrieves inputted user name
    @FXML
    public String get_User(){
        userName = exitBtn.getText();
        return userName;
    }

    //Retrieves inputted password
    @FXML
    public String get_Pass(){
        passWord = signBtn.getText();
        return passWord;
    }



    // Allows the window to be exited
    @FXML
    public void exit_Button(ActionEvent event) {
        Stage stage = (Stage) exitBtn.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void sign_Button(){
        //will call get_User() & get_Pass()
        //will have the call to authentication
        // and then will call the DBScreen after successful authentication
    }


}
