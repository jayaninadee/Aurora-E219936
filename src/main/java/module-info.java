module com.auroraskincare {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;

    exports com.auroraskincare.view;
    opens com.auroraskincare.view to javafx.fxml;
    exports com.auroraskincare.main;
    opens com.auroraskincare.main to javafx.fxml;
    exports com.auroraskincare.controller;
    opens com.auroraskincare.controller to javafx.fxml;
}