package gui.model;

import javafx.beans.property.*;
import java.sql.Date;

public class Doctor {
	 //Declare Doctor Table Columns
    private StringProperty dr_no;
    private StringProperty dr_name;
    private StringProperty dr_lname;
    private StringProperty dr_email;
    private StringProperty dr_cell_telephone;
    private StringProperty hospital_no;
    private SimpleObjectProperty<Date> dr_hire_date;
    private IntegerProperty dr_salary;
 
    //Constructor
    public Employee() {
        this.dr_no = new SimpleStringProperty();
        this.dr_name= new SimpleStringProperty();
        this.dr_lname = new SimpleStringProperty();
        this.dr_email = new SimpleStringProperty();
        this.dr_cell_telephone = new SimpleStringProperty();
        this.hospital_no = new SimpleStringProperty();
        this.dr_hire_date = new SimpleObjectProperty<>();
        this.dr_salary = new SimpleIntegerProperty();
    }
 
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
    public Object getDrHireDate(){
        return dr_hire_date.get();
    }
 
    public void setDrHireDate(Date hireDate){
        this.dr_hire_date.set(hireDate);
    }
 
    public SimpleObjectProperty<Date> drHireDateProperty(){
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
