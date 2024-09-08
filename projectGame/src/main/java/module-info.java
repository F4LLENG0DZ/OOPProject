module com.example.projectgame {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires com.almasb.fxgl.all;
    requires javafx.media;
    requires java.desktop;

    opens com.example.projectgame to javafx.fxml;
    exports com.example.projectgame;
}