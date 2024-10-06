module org.example.sdegame {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.sdegame to javafx.fxml;
    exports org.example.sdegame;
}