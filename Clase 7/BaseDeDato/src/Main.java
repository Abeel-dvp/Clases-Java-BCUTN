import  java.sql.*;

public class Main {

    public static void main(String[] args) {

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String usuario = "root";
            String clave = "";
            String url = "jdbc:mysql://localhost/ejemplo1234";

            connection = DriverManager.getConnection(url,usuario,clave);

            System.out.println("isClosed: "+ connection.isClosed());

           // String sqlInsert = "INSERT INTO EJEMPLO1234 (nombre, apellido, edad) VALUES ('Maria', 'Lerez', 23)";
           // Statement statementInsert = connection.createStatement();
            //statementInsert.execute(sqlInsert);

            //String sqlDelete = "DELETE FROM ejemplo1234 WHERE id = 2";
            //Statement statementDelete = connection.createStatement();
            //statementDelete.execute(sqlDelete);

            String sqlUpdate = "UPDATE ejemplo1234 SET edad = 35 WHERE id = 1";

            Statement statement = connection.createStatement();
            int rowCount = statement.executeUpdate(sqlUpdate);
            System.out.println("Registros afectados: " + rowCount);




            String sqlSelect = "SELECT id, nombre, apellido, edad FROM EJEMPLO1234";

            Statement statementSelect = connection.createStatement();

            ResultSet resultSet = statementSelect.executeQuery(sqlSelect);

            while (resultSet.next() == true){
                System.out.println("***********************");
                System.out.println("Id: "+ resultSet.getInt("id"));
                System.out.println("Nombre: " + resultSet.getString("nombre"));
                System.out.println("Apellido: " + resultSet.getString("apellido"));
                System.out.println("Edad: "+ resultSet.getInt("edad"));
            }






        } catch (ClassNotFoundException e) {
             e.printStackTrace();
        } catch (SQLException e ){
            e.printStackTrace();
        } finally {
            if (connection != null){
                try {
                    System.out.println("Cerrando coneccion...");
                        connection.close();
                } catch (SQLException e) { }
            }
        }
    }
}