package com.nmn.nguyenminhnhat;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int n;
        n = 2;
        if(n>10)
            App.setRoot("secondary");
    }
}
