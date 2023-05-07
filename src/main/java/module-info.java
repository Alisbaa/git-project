module com.example.flappy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.flappy to javafx.fxml;
    exports com.example.flappy;
}