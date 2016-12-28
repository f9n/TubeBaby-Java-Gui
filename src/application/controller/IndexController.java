package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.model.DoctorModel;
import application.model.IndexModel;
import application.util.AlertBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class IndexController implements Initializable{
	public IndexModel indexModel = null;
	@FXML
	private TextField username, pass, dr_no;
	
	@FXML
	private Label dbStatus;
	
	@FXML
    private TableView<DoctorModel> doctorTable;
    @FXML
    private TableColumn<DoctorModel, String>  drIdColumn;
    @FXML
    private TableColumn<DoctorModel, String>  drNameColumn;
    @FXML
    private TableColumn<DoctorModel, String> drLastNameColumn;
    @FXML
    private TableColumn<DoctorModel, String> drEmailColumn;
    @FXML
    private TableColumn<DoctorModel, String> drPhoneNumberColumn;
    @FXML
    private TableColumn<DoctorModel, String>  hospitalNoColumn;
    @FXML
    private TableColumn<DoctorModel, String> drHireDateColumn;
    @FXML
    private TableColumn<DoctorModel, Integer> salaryColumn;
	
    private ObservableList<DoctorModel> table = FXCollections.observableArrayList();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		AlertBox.display("Title of Window", "Please write username and password for Database");
		/*
		doctorTable.add(new DoctorModel("a", "b", "c", "d", "e", "f", "k", 1));
		employeeTable.setItems(doctorTable);
		*/
	}
	
	public void tablolariFiltreleme() {
		System.out.println("Filtrele panpa ...");
		System.out.println(dr_no.getText());
	}
	public void function1clicked() {
		
	}
	public void function2clicked() {
		
	}
	public void function3clicked() {
		
	}
	public void loginButtonClicked() {
		System.out.println("User logged in ...");
		if(username.getText() != null && pass.getText() != null) {
			indexModel = new IndexModel(username.getText(), pass.getText());
		} else {
			AlertBox.display("Title of Window", "Please write username and password");
		}
		if(indexModel.isDbConnected()) {
			dbStatus.setText("Connected");
		} else {
			dbStatus.setText("Not Connected");
		}
	}
	public void settingButtonClicked() {
		System.out.println("User Setting logged in ...");
		indexModel = new IndexModel();
		if(indexModel.isDbConnected()) {
			dbStatus.setText("Connected");
		} else {
			dbStatus.setText("Not Connected");
		}
	}
	public void CreateScene(String title, String file) throws IOException {
		Stage primaryStage = new Stage();
		primaryStage.initModality(Modality.APPLICATION_MODAL);
		primaryStage.setTitle(title);
		FXMLLoader loader = new  FXMLLoader();
		Pane root = loader.load(getClass().getResource(file).openStream());
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.showAndWait();
	}
	public void AddHospital() throws IOException{
		System.out.println("Adding data to Hospital Table");
		CreateScene("Tüp Bebek Sistemindeki Hastane Tablosuna Veri Ekleme",
				"/application/view/AddHospital.fxml");
	}
	public void AddDoctor() throws IOException {
		System.out.println("Adding data to Doctor Table");
		CreateScene("Tüp Bebek Sistemindeki Doktor Tablosuna Veri Ekleme",
				"/application/view/AddDoctor.fxml");
	}
	public void AddPatient() throws IOException {
		System.out.println("Adding data to Patient Table");
		CreateScene("Tüp Bebek Sistemindeki Hasta Tablosuna Veri Ekleme",
				"/application/view/AddPatient.fxml");
	}
	public void AddPatientPartner() throws IOException {
		System.out.println("Adding data to PatientPartner Table");
		CreateScene("Tüp Bebek Sistemindeki Hastane Eþi Tablosuna Veri Ekleme",
				"/application/view/AddPatientPartner.fxml");
	}
	public void AddFamily() throws IOException {
		System.out.println("Adding data to Family Table");
		CreateScene("Tüp Bebek Sistemindeki Aile Tablosuna Veri Ekleme",
				"/application/view/AddFamily.fxml");
	}
	public void AddRooms() throws IOException {
		System.out.println("Adding data to Rooms Table");
		CreateScene("Tüp Bebek Sistemindeki Oda Tablosuna Veri Ekleme",
				"/application/view/AddRooms.fxml");
	}
	public void AddPhoneNumber() throws IOException {
		System.out.println("Adding data to PhoneNumber Table");
		CreateScene("Tüp Bebek Sistemindeki Telefon Numarasi Tablosuna Veri Ekleme",
				"/application/view/AddPhoneNumber.fxml");
	}
	public void AddPill() throws IOException {
		System.out.println("Adding data to Pill Table");
		CreateScene("Tüp Bebek Sistemindeki Ilaç Tablosuna Veri Ekleme",
				"/application/view/AddPill.fxml");
	}
	public void AddPillPatient() throws IOException {
		System.out.println("Adding data to PillPatient Table");
		CreateScene("Tüp Bebek Sistemindeki Ilaç-Hasta Tablosuna Veri Ekleme",
				"/application/view/AddPillPatient.fxml");
	}
}
