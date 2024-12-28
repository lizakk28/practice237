package ru.gorodetskaya.task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Scanner;

public class SumController {

    @FXML
    private Button ResButton;

    @FXML
    private Label ResLabel;

    @FXML
    private TextField nTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {

        int N=Integer.parseInt(nTextField.getText().toString());
        if (N <= 0) {
            ResLabel.setText("N>0.");
            return;
        }

        StringBuilder r = new StringBuilder();

        while (N > 0) {
            int d = N % 10;
            r.append(d).append(" ");
            N /= 10;
        }
        ResLabel.setText("N="+r);
    }

}





