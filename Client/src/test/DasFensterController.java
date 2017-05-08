package test;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DasFensterController {
	@FXML Button b1;
	@FXML Label label1;
	@FXML AnchorPane frame1;
	int i=0;
	
	public void met1(ActionEvent e) throws IOException{
		//label1.setText("" + i++);
		Parent tableViewParent = FXMLLoader.load(getClass().getResource("/View/okno.fxml"));
		Scene tableViewScene = new Scene(tableViewParent);
		Stage window = (Stage) ((Node) (e.getSource())).getScene().getWindow();
		window.setScene(tableViewScene);
		window.show();
	}
}
