package ru.gorodetskaya.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label Tresult;

    @FXML
    private TextField rTextField;

    @FXML
    private Button sButton;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
float R = Float.parseFloat(rTextField.getText().toString());
Tresult.setText("L=" +2*Math.PI*R +  "S=" +Math.PI*R *Math.pow(R,2));

    }

}
