package Library;

import java.sql.*;

public class student {

    private static final String URL = "jdbc:mysql://localhost:3306/students";
    private static final String USER = "root";
    private static final String PASSWORD = "abcd1234";

    public static void main(String[] args) {


     try {

//1. get a connection to the database
         Connection myConn = DriverManager.getConnection(URL, USER, PASSWORD);


         //2. create a statement
         Statement myStmt= myConn.createStatement();

         //3. Execute a SQL Query
         ResultSet myRs = myStmt.executeQuery ("SELECT * FROM students");

         //4. Process the result set
         while(myRs.next()){
             System.out.println("ID #"+ myRs.getString("studentName" + " "+  myRs.getString("studentID")+ " "+ myRs.getString("studentDOB")));
         }


     }
     catch(Exception e){
         e.printStackTrace();
     }
    }
}
