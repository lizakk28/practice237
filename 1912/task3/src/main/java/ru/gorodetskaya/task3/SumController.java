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
    private TextField nTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(nTextField.getText().toString());
        double R = 0;
        switch (n) {
            case 1:
                R = n;
                break;
            case 2:
                R = n / 2;
                break;
            case 3:
                R = n / (2 * Math.PI);
                break;
            case 4:
                R = (n / Math.PI);
                break;
            default:
                ResLabel.setText("1-4");


        }
        double D = 2 * R;
        double L = 2 * Math.PI * R;
        double S = Math.PI * R * R;
        ResLabel.setText("R=%.2f" + R + " D=%.2f" + D + " R=%.2f" + L + " R=%.2f" + S);
    }
}


