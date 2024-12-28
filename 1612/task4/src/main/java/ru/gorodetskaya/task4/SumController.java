package ru.gorodetskaya.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Button rButton;

    @FXML
    private Label result;

    @FXML
    private TextField xTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float a = Float.parseFloat(aTextField.getText().toString());
        float b = Float.parseFloat(bTextField.getText().toString());
        float x = Float.parseFloat(xTextField.getText().toString());
        double y= Math.pow(-a,5)*x+b*Math.pow(Math.cos(Math.pow(x,2)),4)+b*x;
        result.setText("Y="+Math.sqrt(Math.abs(-a*x+y))/Math.log(Math.abs(x+Math.pow(y,2))));
    }

}
