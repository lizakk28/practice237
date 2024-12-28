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

            int number = Integer.parseInt(nTextField.getText().toString());
            int lastDigit = number % 10;
            int firstTwoDigits = number / 10;
            int resButton = lastDigit * 100 + firstTwoDigits;
            ResLabel.setText("Новый номер=" + resButton);    }

}
