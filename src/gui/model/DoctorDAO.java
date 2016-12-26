package gui.model;

import java.sql.*;

import gui.util.PostgresConnection;

public class DoctorDAO {
    //*******************************
    //SELECT an Doctor
    //*******************************
    public static Doctor searchDoctor (String no) throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM doctor WHERE dr_no=" + no;
 
        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsEmp = PostgresConnection.dbExecuteQuery(selectStmt);
 
            //Send ResultSet to the getDoctorFromResultSet method and get employee object
            Doctor doctor = getDoctorFromResultSet(rsEmp);
 
            //Return doctor object
            return doctor;
        } catch (SQLException e) {
            System.out.println("While searching an employee with " + no + " id, an error occurred: " + e);
            //Return exception
            throw e;
        }
    }
    //Use ResultSet from DB as parameter and set Doctor Object's attributes and return employee object.
    private static Doctor getDoctorFromResultSet(ResultSet rs) throws SQLException
    {
        Doctor emp = null;
        if (rs.next()) {
            emp = new Doctor();
            emp.setDrNo(rs.getString("dr_no"));
            emp.setDrName(rs.getString("dr_name"));
            emp.setDrLname(rs.getString("dr_lname"));
            emp.setDrEmail(rs.getString("dr_email"));
            emp.setDrCellTelephone(rs.getString("dr_cell_telephone"));
            emp.setHospitalNo(rs.getString("hospital_no"));
            emp.setDrHireDate(rs.getDate("dr_hire_date"));
            emp.setDrSalary(rs.getInt("dr_salary"));
        }
        return emp;
    }
 

    //*******************************
    //SELECT Doctors
    //*******************************
    public static ObservableList<Doctor> searchDoctors () throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM doctor";
 
        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsEmps = PostgresConnection.dbExecuteQuery(selectStmt);
 
            //Send ResultSet to the getDoctorList method and get employee object
            ObservableList<Doctor> drList = getDoctorList(rsEmps);
 
            //Return doctor object
            return drList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has been failed: " + e);
            //Return exception
            throw e;
        }
    }
 
    //Select * from doctor operation
    private static ObservableList<Doctor> getDoctorList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare a observable List which comprises of Doctor objects
        ObservableList<Doctor> drList = FXCollections.observableArrayList();
 
        while (rs.next()) {
            Doctor emp = new Doctor();
            emp.setDrNo(rs.getString("dr_no"));
            emp.setDrName(rs.getString("dr_name"));
            emp.setDrLname(rs.getString("dr_lname"));
            emp.setDrEmail(rs.getString("dr_email"));
            emp.setDrCellTelephone(rs.getString("dr_cell_telephone"));
            emp.setHospitalNo(rs.getString("hospital_no"));
            emp.setDrHireDate(rs.getDate("dr_hire_date"));
            emp.setDrSalary(rs.getInt("dr_salary"));
            //Add doctor to the ObservableList
            drList.add(emp);
        }
        //return drList (ObservableList of Doctor)
        return drList;
    }
    //*************************************
    //UPDATE an doctor's email address
    //*************************************
    public static void updateDoctorEmail (String no, String email) throws SQLException, ClassNotFoundException {
        //Declare a UPDATE statement
        String updateStmt =
                        "   UPDATE doctor\n" +
                        "      SET dr_email = '" + email + "' " +
                        "    WHERE dr_no = " + no + ";";
 
        //Execute UPDATE operation
        try {
            PostgresConnection.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while UPDATE Operation: " + e);
            throw e;
        }
    }
 
    //*************************************
    //DELETE an doctor
    //*************************************
    public static void deleteDoctorWithDrNo (String no) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt =
                        "   DELETE FROM doctor " +
                        "         WHERE dr_no ="+ no +";";
 
        //Execute UPDATE operation
        try {
            PostgresConnection.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while DELETE Operation: " + e);
            throw e;
        }
    }
 
    //*************************************
    //INSERT an doctor
    //*************************************
    public static void insertDoctor (String no, String name, String lastname, String email, String hospital_no) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt =
                        "INSERT INTO doctor (dr_name, dr_lname, dr_no, hospital_no, dr_email)" +
                        "VALUES (" + name + ", " + lastname + ", " + no + "," + hospital_no + "," + email + 
                        ")";
 
        //Execute DELETE operation
        try {
            PostgresConnection.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while DELETE Operation: " + e);
            throw e;
        }
    }
}
