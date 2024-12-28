package ru.gorodetskaya.task2;

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
    private TextField nTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(nTextField.getText());

        if (n > 0) {
            n -= 8;
        }


        ResLabel.setText("Результат: " + n);
    }

}
