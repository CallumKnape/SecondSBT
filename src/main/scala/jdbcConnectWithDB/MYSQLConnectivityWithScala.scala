package jdbcConnectWithDB
import java.sql._


object MYSQLConnectivityWithScala extends App{

  val driver = "com.mysql.jdbc.Driver"
  //Since you're using Terminal instead of a GUI, log into MYSQL on Terminal and use
  //SHOW GLOBAL VARIABLES LIKE 'PORT'
  //to get your port number.
  val url = "jdbc:mysql://localhost:3306/movies"
  val username = "root"
  val password = "CallumKnape"

  var connection: Connection = null
  try {
    Class.forName(driver)
    connection = DriverManager.getConnection(url, username, password)

    val insertMySQL = """insert into movies (title,genre,director,release_year) values(?,?,?,?)"""
      val preparedStatement:PreparedStatement = connection.prepareStatement(insertMySQL)
      preparedStatement.setString(1,"ABC")
      preparedStatement.setString(2,"Comedy")
      preparedStatement.setString(3,"Temp")
      preparedStatement.setString(4,"2022")
      preparedStatement.execute()


    val statement = connection.createStatement()
    val resultSet = statement.executeQuery("select title,genre from movies.movies; ")
    while (resultSet.next()) {
      val title = resultSet.getString("title")
      val genre = resultSet.getString("genre")
      println(s"Title of movie is ${title} and genre of the movie is ${genre}")

    }


  } catch {
    case e: Exception => e.printStackTrace()
  }
  finally {
    connection.close()
  }

}
