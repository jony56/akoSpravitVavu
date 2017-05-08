package test;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class OknoController {

	
	@FXML Button but1;
	
	public void met1(ActionEvent event) throws IOException{
		Parent tableViewParent = FXMLLoader.load(getClass().getResource("/View/DasFenster.fxml"));
		Scene tableViewScene = new Scene(tableViewParent);
		Stage window = (Stage) ((Node) (event.getSource())).getScene().getWindow();
		window.setScene(tableViewScene);
		window.show();
	}
}
