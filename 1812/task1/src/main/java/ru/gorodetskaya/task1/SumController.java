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
    private TextField mTextField;

    @FXML
    private TextField nTextField;

    @FXML
    void sumButtonJnAction(ActionEvent event) {
        int M = Integer.parseInt(mTextField.getText());int N = Integer.parseInt(nTextField.getText());

        if (N != 0) {
            if (M % N == 0) {
                int quotient = M / N;
                ResLabel.setText("Частное от деления: " + quotient);
            } else {
                ResLabel.setText("M на N нацело не делится.");
            }
        } else {
            ResLabel.setText("Деление на ноль невозможно.");
        }
    }

}

