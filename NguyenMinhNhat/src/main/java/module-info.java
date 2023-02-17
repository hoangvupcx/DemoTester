module com.nmn.nguyenminhnhat {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nmn.nguyenminhnhat to javafx.fxml;
    exports com.nmn.nguyenminhnhat;
}
