package ru.gorodetskaya.task2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.List;

public class ResultController {

    @FXML
    private TextField aT;

    @FXML
    private Button hB;

    @FXML
    private Button jab;

    @FXML
    private ListView<Integer> nelist;

    @FXML
    private Button nok;

    @FXML
    private Label net;


    @FXML
    void hV(ActionEvent event) {
        if (aT.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(aT.getText().toString());
            nelist.getItems().add(x);
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введите корректное число");
            alert.showAndWait();
        } finally {
            aT.setText("");
        }
    }


    @FXML
    void jab(ActionEvent event) {
        List<Integer> data = nelist.getItems();
        int a = 0;

        for (int num : data) {

            if (Math.abs(num) >= 10 && Math.abs(num) < 100 && num % 8 == 0) {
                a++;
            }
        }


        if (a > 0) {
            net.setText("" + a);
        } else {
            net.setText("Нет чисел");
        }
    }


    @FXML
    void nok(ActionEvent event) {
        Platform.exit();
    }
}
