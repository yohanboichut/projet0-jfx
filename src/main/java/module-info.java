module fr.univ.orleans.pnt {
    requires javafx.controls;
    requires javafx.fxml;

    opens vues.fxml to javafx.fxml;
    opens modele to javafx.base;
    exports pnt;
}