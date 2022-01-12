module cz.spsmb.fxexample.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens cz.spsmb.fxexample.demo to javafx.fxml;
    exports cz.spsmb.fxexample.demo;
}