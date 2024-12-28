module ru.gorodetskaya.task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gorodetskaya.task6 to javafx.fxml;
    exports ru.gorodetskaya.task6;
}