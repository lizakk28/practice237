package ru.gorodetskaya.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button ResButton;

    @FXML
    private Label ResLabel;

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private TextField cTextField;

    @FXML
    private TextField dTextField;

    @FXML
    private TextField x2TextField;

    @FXML
    private TextField xTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float a = Float.parseFloat(aTextField.getText().toString());
        float b = Float.parseFloat(bTextField.getText().toString());
        float c = Float.parseFloat(cTextField.getText().toString());
        float d = Float.parseFloat(dTextField.getText().toString());
        float x = Float.parseFloat(xTextField.getText().toString());
        float x2 = Float.parseFloat(x2TextField.getText().toString());
        double D = Math.pow(b,2) - 4 * a * c  ;

    }

}
