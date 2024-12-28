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
    private TextField kTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int k = Integer.parseInt(kTextField.getText().toString());
        int N = (k - 1) % 7;
        ResLabel.setText("Номер дня недели: " + N);
    }

}
