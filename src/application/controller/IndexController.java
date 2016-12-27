package application.controller;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class IndexController {
	public void loginButtonClicked() {
		System.out.println("User logged in ...");
	}
	public void AddHospital() throws IOException {
		System.out.println("Adding data to Hospital Table");
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Tüp Bebek Sistemindeki Hastane Tablosuna Veri Ekleme");
		FXMLLoader loader = new  FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/view/AddHospital.fxml").openStream());
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public void AddDoctor() throws IOException {
		System.out.println("Adding data to Doctor Table");
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Tüp Bebek Sistemindeki Doktor Tablosuna Veri Ekleme");
		FXMLLoader loader = new  FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/view/AddDoctor.fxml").openStream());
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public void AddPatient() throws IOException {
		System.out.println("Adding data to Patient Table");
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Tüp Bebek Sistemindeki Hasta Tablosuna Veri Ekleme");
		FXMLLoader loader = new  FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/view/AddPatient.fxml").openStream());
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public void AddPatientPartner() throws IOException {
		System.out.println("Adding data to PatientPartner Table");
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Tüp Bebek Sistemindeki Hastane Eþi Tablosuna Veri Ekleme");
		FXMLLoader loader = new  FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/view/AddPatientPartner.fxml").openStream());
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public void AddFamily() throws IOException {
		System.out.println("Adding data to Family Table");
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Tüp Bebek Sistemindeki Aile Tablosuna Veri Ekleme");
		FXMLLoader loader = new  FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/view/AddFamily.fxml").openStream());
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public void AddRooms() throws IOException {
		System.out.println("Adding data to Rooms Table");
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Tüp Bebek Sistemindeki Oda Tablosuna Veri Ekleme");
		FXMLLoader loader = new  FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/view/AddRooms.fxml").openStream());
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public void AddPhoneNumber() throws IOException {
		System.out.println("Adding data to PhoneNumber Table");
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Tüp Bebek Sistemindeki Telefon Numarasi Tablosuna Veri Ekleme");
		FXMLLoader loader = new  FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/view/AddPhoneNumber.fxml").openStream());
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public void AddPill() throws IOException {
		System.out.println("Adding data to Pill Table");
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Tüp Bebek Sistemindeki Ilaç Tablosuna Veri Ekleme");
		FXMLLoader loader = new  FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/view/AddPill.fxml").openStream());
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public void AddPillPatient() throws IOException {
		System.out.println("Adding data to PillPatient Table");
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Tüp Bebek Sistemindeki Ilaç-Hasta Tablosuna Veri Ekleme");
		FXMLLoader loader = new  FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/view/AddPillPatient.fxml").openStream());
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
