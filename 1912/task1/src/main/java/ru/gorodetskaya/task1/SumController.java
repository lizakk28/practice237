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
    private TextField nTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int day = Integer.parseInt(nTextField.getText().toString());
        String dayName;

        switch (day) {
            case 1:
                dayName = "Понедельник"; break;
            case 2:
                dayName = "Вторник"; break;
            case 3:
                dayName = "Среда"; break;
            case 4:
                dayName = "Четверг"; break;
            case 5:
                dayName = "Пятница"; break;
            case 6:
                dayName = "Суббота"; break;
            case 7:
                dayName = "Воскресенье"; break;
            default:
                dayName = "Некорректный номер дня";
        }

        ResLabel.setText(dayName);

    }

}
