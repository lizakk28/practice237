package ru.gorodetskaya.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class SumController {

    @FXML
    private Button ResButton;

    @FXML
    private Label ResLabel;

    @FXML
    private TextField n1TextField;

    @FXML
    private TextField n2TextField;

    @FXML
    private TextField n3TextField;

    @FXML
    private TextField n4TextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {

        TextField input1 = new TextField();
        input1.setPromptText("Введите первое число");

        TextField input2 = new TextField();
        input2.setPromptText("Введите второе число");

        TextField input3 = new TextField();
        input3.setPromptText("Введите третье число");

        TextField input4 = new TextField();
        input4.setPromptText("Введите четвертое число");

        Label resultLabel = new Label("Результат:");

        Button findButton = new Button("Найти уникальное число");
        findButton.setOnAction(e -> {
            int[] numbers = {
                    Integer.parseInt(n1TextField.getText()),
                    Integer.parseInt(n2TextField.getText()),
                    Integer.parseInt(n3TextField.getText()),
                    Integer.parseInt(n4TextField.getText())
            };
            int uniqueIndex = findUniqueIndex(numbers);
            ResLabel.setText("Порядковый номер уникального числа: " + (uniqueIndex + 1));
        });

        VBox vbox = new VBox(10, input1, input2, input3, input4, findButton, resultLabel);
        vbox.setPadding(new Insets(20));

        Scene scene = new Scene(vbox, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private int findUniqueIndex(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != numbers[(i + 1) % 4] && numbers[i] != numbers[(i + 2) % 4]) {
                return i;
            }
        }
        return -1; // Если уникальное число не найдено
    }

    public static void main(String[] args) {
        main(args);
    }
}

}
