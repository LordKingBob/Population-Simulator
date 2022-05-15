module com.sci.populationtest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sci.populationsimulator to javafx.fxml;
    exports com.sci.populationsimulator;
}