package jdbcConnectWithDB
import java.sql._


object MYSQLConnectivityWithScala extends App{

  val driver = "com.mysql.jdbc.Driver"
  //Since you're using Terminal instead of a GUI, log into MYSQL on Terminal and use
  //SHOW GLOBAL VARIABLES LIKE 'PORT'
  //to get your port number.
  val url = "jdbc:mysql://localhost:3306/MySQL80"
  val username = "root"
  val password = "CallumKnape"




}
