module ru.gorodetskaya.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gorodetskaya.task2 to javafx.fxml;
    exports ru.gorodetskaya.task2;
}