package tubebaby_java_gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class GuiController implements Initializable{
	public GuiModel model = new GuiModel();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		if(model.isDbConnected()) {
			System.out.println("Connected Database");
		} else {
			System.out.println("Not Connected");
		}
	}
}
