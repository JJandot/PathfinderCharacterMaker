package sample;

import javafx.fxml.FXML;
import javafx.stage.Stage;

/**
 * Dialog to edit details of a person.
 *
 * @author Marco Jakob
 */
public class Controller {

    private Stage dialogStage;
    private Player player;
    private boolean okClicked = false;

    @FXML
    private void initialize() {
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }


    public void setPerson(Player player) {
        this.player = player;
    }
}
