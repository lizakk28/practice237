package ru.gorodetskaya.task1;

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
    private TextField lTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float l = Float.parseFloat(lTextField.getText().toString());
ResLabel.setText("W="+ l/100);
    }

}
