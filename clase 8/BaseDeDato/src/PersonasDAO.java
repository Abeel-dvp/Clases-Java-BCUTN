import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonasDAO {
    public void guardarPesonas(Persona persona) throws PersonaException{

        Connection connection = null;
        DBUtils dbUtils = new DBUtils();
        try {

            connection = dbUtils.recuperarConnection();

             String sqlInsert = "INSERT INTO ejemplo12 (nombre, apellido, edad) VALUES (?, ?, ?)";
             PreparedStatement statementInsert = connection.prepareStatement(sqlInsert);
             statementInsert.setString(1, persona.getNombre());
             statementInsert.setString(2,persona.getApellido());
             statementInsert.setInt(3, persona.getEdad());
            statementInsert.execute();

        } catch (ClassNotFoundException e) {
           throw new PersonaException("Hay un problema al guardar la persona", e);
        } catch (SQLException e ){
            throw new PersonaException("Hay un problema al guardar la persona", e);

        } finally {
            if (connection != null){
                try {
                    System.out.println("Cerrando coneccion...");
                    connection.close();
                } catch (SQLException e) { }
            }
        }

    }

    public void actualizarPersona(Persona persona) throws PersonaException{
        Connection connection = null;
        DBUtils dbUtils = new DBUtils();
        try {

            connection = dbUtils.recuperarConnection();

            String sqlUpdate = "UPDATE ejemplo12 SET nombre = ?, apellido = ?, edad = ? WHERE id = ?";
            PreparedStatement statementUpdate = connection.prepareStatement(sqlUpdate);
            statementUpdate.setString(1, persona.getNombre());
            statementUpdate.setString(2,persona.getApellido());
            statementUpdate.setInt(3, persona.getEdad());
            statementUpdate.setLong(4, persona.getId());

            statementUpdate.execute();

        } catch (ClassNotFoundException e) {
            throw new PersonaException("Hay un problema al actualizar la persona", e);

        } catch (SQLException e ){
            throw new PersonaException("Hay un problema al actualizar la persona", e);

        } finally {
            if (connection != null){
                try {
                    System.out.println("Cerrando coneccion...");
                    connection.close();
                } catch (SQLException e) { }
            }
        }
    }

    public Persona buscarPersonaPorId( Long id) throws PersonaException{
        Connection connection = null;
        Persona persona = null;
        DBUtils dbUtils = new DBUtils();
        try {

            connection = dbUtils.recuperarConnection();

            String sqlSelect = "SELECT id, nombre, apellido, edad FROM ejemplo12 WHERE id = ?";
            PreparedStatement statementSelect = connection.prepareStatement(sqlSelect);
            statementSelect.setLong(1, id);
           ResultSet resultado =  statementSelect.executeQuery();
            if (resultado.next() == true){
                persona = new Persona();
                persona.setId(id);
                persona.setNombre(resultado.getString("nombre"));
                persona.setApellido(resultado.getString("apellido"));
                persona.setEdad(resultado.getInt("edad"));

            } else {
                throw new PersonaException("No se encontro la persona con el id: " + id);
            }

        } catch (ClassNotFoundException e) {
            throw new PersonaException("Hay un problema al buscar la persona", e);

        } catch (SQLException e ){
            throw new PersonaException("Hay un problema al buscar la persona", e);

        } finally {
            if (connection != null){
                try {
                    System.out.println("Cerrando coneccion...");
                    connection.close();
                } catch (SQLException e) { }
            }
        }
        return persona;
    }

    public void borrarPersona(Long id) throws PersonaException {
        Connection connection = null;
        DBUtils dbUtils = new DBUtils();
        try {

            connection = dbUtils.recuperarConnection();

            String sqlDelete = "DELETE from ejemplo12  WHERE id = ?";
            PreparedStatement statementDelete = connection.prepareStatement(sqlDelete);

            statementDelete.setLong(1, id);
            statementDelete.execute();

        } catch (ClassNotFoundException e) {
            throw new PersonaException("Hay un problema al borrar la persona", e);

        } catch (SQLException e) {
            throw new PersonaException("Hay un problema al borrar la persona", e);

        } finally {
            if (connection != null) {
                try {
                    System.out.println("Cerrando coneccion...");
                    connection.close();
                } catch (SQLException e) {
                }
            }
        }
    }


    public ArrayList<Persona> recuperarPersonas() throws PersonaException{

        ArrayList<Persona > personas = new ArrayList<Persona>();
        Connection connection = null;
        Persona persona = null;
        DBUtils dbUtils = new DBUtils();
        try {

            connection = dbUtils.recuperarConnection();

            String sqlSelect = "SELECT id, nombre, apellido, edad FROM ejemplo12 ";
            PreparedStatement statementSelect = connection.prepareStatement(sqlSelect);

            ResultSet resultado =  statementSelect.executeQuery();
            while (resultado.next() == true){
                persona = new Persona();
                persona.setId(resultado.getLong("id"));
                persona.setNombre(resultado.getString("nombre"));
                persona.setApellido(resultado.getString("apellido"));
                persona.setEdad(resultado.getInt("edad"));
                personas.add(persona);
            }

        } catch (ClassNotFoundException e) {
            throw new PersonaException("Hay un problema al buscar a las personas", e);

        } catch (SQLException e ){
            throw new PersonaException("Hay un problema al buscar a las personas", e);

        } finally {
            if (connection != null){
                try {
                    System.out.println("Cerrando coneccion...");
                    connection.close();
                } catch (SQLException e) { }
            }
        }
        return personas;
    }

}
