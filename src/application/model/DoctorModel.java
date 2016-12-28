package application.model;

import java.sql.Connection;
import java.sql.SQLException;

import application.util.PostgresConnection;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DoctorModel {
	Connection con;
	 //Declare Doctor Table Columns
    private StringProperty dr_no;
    private StringProperty dr_name;
    private StringProperty dr_lname;
    private StringProperty dr_email;
    private StringProperty dr_cell_telephone;
    private StringProperty hospital_no;
    private StringProperty dr_hire_date;
    private IntegerProperty dr_salary;
 
    public DoctorModel() {
		con = PostgresConnection.Connector();
		if(con == null) {
			System.out.println("Connection Not successful!");
			System.exit(1);
		}
		
	}
	public DoctorModel(String a, String b, String c, String d, String e, String f, String k, int l) {
		con = PostgresConnection.Connector();
		if(con == null) {
			System.out.println("Connection Not successful!");
			System.exit(1);
		}
		 this.dr_no = new SimpleStringProperty(a);
	     this.dr_name= new SimpleStringProperty(b);
	     this.dr_lname = new SimpleStringProperty(c);
	     this.dr_email = new SimpleStringProperty(d);
	     this.dr_cell_telephone = new SimpleStringProperty(e);
	     this.hospital_no = new SimpleStringProperty(f);
	     this.dr_hire_date = new SimpleStringProperty(k);
	     this.dr_salary = new SimpleIntegerProperty(l);
	}
	public boolean isDbConnected() {
		try {
			return !con.isClosed();
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean insertDoctor (String no, String name, String lastname, String email,
			String telephone, String hospital_no, String date, String salary)
					throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt =
                        "INSERT INTO doctor" +
                        "VALUES (" + no + "," + name + ", " + lastname + "," + email + "," + 
                        telephone + "," + hospital_no + "," + date + "," + salary + 
                        ")";
 
        //Execute DELETE operation
        try {
            PostgresConnection.dbExecuteUpdate(updateStmt);
            return true;
        } catch (SQLException e) {
            System.out.print("Error occurred while DELETE Operation: " + e);
            return false;
        }
    }
	/*
	public boolean executeQuery(String...argv) {
		System.out.println("Doctor Model burasi sen kimsin?");
		System.out.println(argv[0]);
		System.out.println(argv[1]);
		System.out.println(argv[2]);
		try{
		PreparedStatement preparedStatement = null;
		String query = "INSERT INTO ? VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		preparedStatement = con.prepareStatement(query);
		preparedStatement.setString(1, argv[0]);
		preparedStatement.setString(2, argv[1]);
		preparedStatement.setString(3, argv[2]);
		preparedStatement.setString(4, argv[3]);
		preparedStatement.setString(5, argv[4]);
		preparedStatement.setString(6, argv[5]);
		preparedStatement.setString(7, argv[6]);
		preparedStatement.setString(8, argv[7]);
		preparedStatement.setString(9, argv[8]);
		preparedStatement.executeQuery();
		
		return true;
		} catch(Exception e) {
			System.out.println("Doctor Model de Patladi.");
			e.printStackTrace();
			return false;
		}
	}
	*/
	 //dr_no
    public String getDrNo() {
        return dr_no.get();
    }
 
    public void setDrNo(String no){
        this.dr_no.set(no);
    }
 
    public StringProperty drNoProperty(){
        return dr_no;
    }
 
    //dr_name
    public String getDrName () {
        return dr_name.get();
    }
 
    public void setDrName(String firstName){
        this.dr_name.set(firstName);
    }
 
    public StringProperty drNameProperty() {
        return dr_name;
    }
 
    //dr_lname
    public String getDrLname () {
        return dr_lname.get();
    }
 
    public void setDrLname(String lastName){
        this.dr_lname.set(lastName);
    }
 
    public StringProperty drLnameProperty() {
        return dr_lname;
    }
 
    //dr_email
    public String getDrEmail () {
        return dr_email.get();
    }
 
    public void setDrEmail (String email){
        this.dr_email.set(email);
    }
 
    public StringProperty drEmailProperty() {
        return dr_email;
    }
 
    //dr_cell_telephone
    public String getDrCellTelephone () {
        return dr_cell_telephone.get();
    }
 
    public void setDrCellTelephone (String phoneNumber){
        this.dr_cell_telephone.set(phoneNumber);
    }
 
    public StringProperty drCellTelephoneProperty() {
        return dr_cell_telephone;
    }
    
    //hospital_no
    public String getHospitalNo () {
        return hospital_no.get();
    }
 
    public void setHospitalNo(String no){
        this.hospital_no.set(no);
    }
 
    public StringProperty hospitalNoProperty() {
        return hospital_no;
    }
 
    //dr_hire_date
    public String getDrHireDate(){
        return dr_hire_date.get();
    }
 
    public void setDrHireDate(String hireDate){
        this.dr_hire_date.set(hireDate);
    }
 
    public StringProperty drHireDateProperty(){
        return dr_hire_date;
    }
 
    //dr_salary
    public int getDrSalary() {
        return dr_salary.get();
    }
 
    public void setDrSalary(int salary){
        this.dr_salary.set(salary);
    }
 
    public IntegerProperty drSalaryProperty(){
        return dr_salary;
    }
}
