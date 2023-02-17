package com.nmn.nguyenminhnhat;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int c = 10;
        if(c == 1)
            App.setRoot("secondary");
    }
}
