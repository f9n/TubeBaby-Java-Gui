package application.controller;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import application.model.DoctorModel;
import application.model.IndexModel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddDoctorController implements Initializable {

	public DoctorModel model = new DoctorModel();
	
	@FXML
	private TextField dr_no, dr_name, dr_lname, dr_email, dr_cell_telephone, 
		hospital_no, dr_hire_date, dr_salary;
	@FXML
	private Label status;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	public void AddDataDoctorTable() {
		System.out.print("Ekle butonuna tikladin.");
		try {
			if(model.insertDoctor(dr_no.getText(), dr_name.getText(), 
					dr_lname.getText(), dr_email.getText(), dr_cell_telephone.getText(),
					hospital_no.getText(), dr_hire_date.getText(), dr_salary.getText())) {
				status.setText("Okey");
			} else {
				status.setText("Not Okey");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print("Class");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.print("Sql");
			e.printStackTrace();
		}
	}
}
