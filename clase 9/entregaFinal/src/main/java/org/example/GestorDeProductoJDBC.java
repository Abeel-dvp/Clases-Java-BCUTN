package org.example;

import java.util.ArrayList;
import java.sql.*;
public class GestorDeProductoJDBC {

    public void guardarProductosEnLaBaseDeDatos(ArrayList<Producto> productosRecuperados) throws ProductoException {

        DBUtils dbUtils = new DBUtils();

        Connection connection = null;

        try {
            connection = dbUtils.recuperarConnection();

            String sqlInsert = "INSERT INTO productos (id, nombre, descripcion, precio, fechaAlta) VALUE(?,?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);

            for (Producto producto : productosRecuperados) {
                preparedStatement.setInt(1, producto.getId());
                preparedStatement.setString(2, producto.getNombre());
                preparedStatement.setString(3, producto.getDescripcion());
                preparedStatement.setDouble(4, producto.getPrecio());
                preparedStatement.setDate(5, new java.sql.Date(producto.getFechaAlta().getTime()));

                preparedStatement.execute();
            }


        } catch (Exception e) {
            throw new ProductoException("Hay un error al guardar los datos de los productos en la base de datos");
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {}
            }

        }
    }

    public ArrayList<Producto> recuperarProductosDeLaBaseDeDatos() throws ProductoException {

            DBUtils dbUtils = new DBUtils();
            ArrayList<Producto> productos = new ArrayList<Producto>();
            Producto producto = null;
            Connection connection = null;


            try {
                connection = dbUtils.recuperarConnection();

                String sqlSelect = "SELECT id, nombre, descripcion, precio, fechaAlta  FROM productos;";
                PreparedStatement preparedStatement = connection.prepareStatement(sqlSelect);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next() == true){
                    producto = new Producto();
                    producto.setId(resultSet.getInt("id"));
                    producto.setNombre(resultSet.getString("nombre"));
                    producto.setDescripcion(resultSet.getString("descripcion"));
                    producto.setPrecio(resultSet.getDouble("precio"));
                    producto.setFechaAlta(resultSet.getDate("fechaAlta"));
                    productos.add(producto);
                }

                    preparedStatement.execute();
                }
            catch (Exception e ){
                throw  new ProductoException("Hay un error al recuperar los datos de los productos en la base de datos");
            } finally {
                if (connection != null){
                    try {
                        connection.close();
                    } catch (SQLException e) {}
                }

            }

        return productos;
    }

}
