package ru.gorodetskaya.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private TextField aT;

    @FXML
    private TextField bT;

    @FXML
    private Label rL;

    @FXML
    void ab(ActionEvent event) {
        int a=Integer.parseInt(aT.getText().toString());
        int b=Integer.parseInt(bT.getText().toString());
        if (a >= b) {
            rL.setText("A < B.");
            return;
        }
        StringBuilder result = new StringBuilder();
        int q = 0;


        for (int i = a; i <= b; i++) {
            result.append(i).append(" ");
            q++;
        }

        // Выводим все числа и их количество
        rL.setText("Числа: " + result.toString() + "\nКоличество: " + q);
    }

}
