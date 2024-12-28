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
    private TextField mTextField;

    @FXML
    private TextField nTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int N = Integer.parseInt(nTextField.getText());
        int M = Integer.parseInt(mTextField.getText());

        String rank = "";
        String suit = "";

        switch (N) {
            case 6:
                rank = "шестёрка";
                break;
            case 7:
                rank = "семёрка";
                break;
            case 8:
                rank = "восьмёрка";
                break;
            case 9:
                rank = "девятка";
                break;
            case 10:
                rank = "десятка";
                break;
            case 11:
                rank = "валет";
                break;
            case 12:
                rank = "дама";
                break;
            case 13:
                rank = "король";
                break;
            case 14:
                rank = "туз";
                break;
        }

        switch (M) {
            case 1:
                suit = "пик";
                break;
            case 2:
                suit = "треф";
                break;
            case 3:
                suit = "бубен";
                break;
            case 4:
                suit = "червей";
                break;
        }

        ResLabel.setText(rank + " " + suit);
    }
}



