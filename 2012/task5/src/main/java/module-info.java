module ru.gorodetskaya.task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gorodetskaya.task5 to javafx.fxml;
    exports ru.gorodetskaya.task5;
}