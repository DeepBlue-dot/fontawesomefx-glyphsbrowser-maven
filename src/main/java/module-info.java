module org.IDentifyMe {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires de.jensd.fx.glyphs.commons;
    requires de.jensd.fx.glyphs.fontawesome;
    requires de.jensd.fx.glyphs.materialdesignicons;
    requires de.jensd.fx.glyphs.octicons;
    requires de.jensd.fx.glyphs.weathericons;
    requires de.jensd.fx.glyphs.controls;
    requires de.jensd.fx.glyphs.emojione;
    requires de.jensd.fx.glyphs.iconsfivetwofive;
    requires de.jensd.fx.glyphs.materialicons;
    requires java.logging;
    requires org.controlsfx.controls;


    opens de.jensd.glyphs.browser to javafx.fxml, org.controlsfx;
    exports de.jensd.glyphs.browser to javafx.graphics, org.controlsfx;
}