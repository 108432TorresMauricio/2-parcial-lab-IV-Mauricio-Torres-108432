
package Gestor;

import Modelo.Actividad;
import Modelo.CuotasPagadas;
import Modelo.Socio;
import Modelo.Sexo;
import Modelo.SocioActividades;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;


public class GestorBD {
     private Connection con;
     

    private void abrirConexion() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(CONN_STR, USER, PASS);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        
    }
    
    private void cerrarConexion() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static final String CONN_STR = "jdbc:sqlserver://MAURICIO-PC:1433;databaseName=Club";
    private String USER = "sa";
    private String PASS = "123456";

        public void agregarSocio(Socio nuevoSocio) {

        try {
            abrirConexion();

            PreparedStatement st = con.prepareStatement("Insert Into Socio (Nombre,Apellido,Edad,Telefono,IdSexo) values (?,?,?,?,?)");
            
            
            
            st.setString(1, nuevoSocio.getNombre());
            st.setString(2, nuevoSocio.getApellido());
            st.setInt(3, nuevoSocio.getEdad());
            st.setInt(4, nuevoSocio.getTelefono());
            st.setInt(5, nuevoSocio.getSexo().getIdSexo());
          
            st.executeUpdate();
            st.close();

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            cerrarConexion();
        }
    }
        
         public ArrayList<Socio> obtenerSocio() {
        ArrayList<Socio> listaSocio = new ArrayList<Socio>();

        try {
            abrirConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select Socio.* , Sexo.Nombre as tipoSexo\n" +
                                            "from Socio\n" +
                                            "join Sexo on Socio.IdSexo = Sexo.IdSexo");

            while (rs.next()) {
                int idSocio = rs.getInt("IdSocio");
                String Nombre = rs.getString("Nombre");
                String Apellido = rs.getString("Apellido");
                int Edad = rs.getInt("Edad");
                int Telefono = rs.getInt("Telefono");
               
                int IdSexo = rs.getInt("IdSexo");
                String TipoSexo = rs.getString("tipoSexo");
                Sexo sex = new Sexo(IdSexo,TipoSexo);

                Socio socio = new Socio(idSocio, Nombre, Apellido, Edad,Telefono,sex);
                listaSocio.add(socio);
            }
            st.close();

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            cerrarConexion();
        }
        return listaSocio;
         }
         
          public ArrayList<Actividad> obtenerActividades() {
        ArrayList<Actividad> listaActi = new ArrayList<Actividad>();

        try {
            abrirConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Actividad");

            while (rs.next()) {
                int IdActividad = rs.getInt("IdActividad");
                String Descripcion = rs.getString("Descripcion");
         
            listaActi.add(new Actividad(IdActividad, Descripcion));
                
            }
            st.close();

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            cerrarConexion();
        }
        return listaActi;
         }
         
         
         
          public ArrayList<Sexo> ComboBoxSexo() {
        ArrayList<Sexo> listaSexo = new ArrayList<Sexo>();

        try {
            abrirConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Sexo");

            while (rs.next()) {
                
                int IdSexo = rs.getInt("IdSexo");
                String Nombre = rs.getString("Nombre");
               
                Sexo sex = new Sexo(IdSexo,Nombre);
                listaSexo.add(sex);
            }
            st.close();

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            cerrarConexion();
        }
        return listaSexo;
         }
  
          
             public void EliminarSocio(int id) {
        

        try {
            abrirConexion();
            String sql = "delete from Socio where IdSocio = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();


        } catch (SQLException exc) {
            exc.printStackTrace();
          
        } finally {
            cerrarConexion();
        }
            
             }
            public void EliminarActividad(int id) {
        

        try {
            abrirConexion();
            String sql = "delete from Actividad where IdActividad = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();


        } catch (SQLException exc) {
            exc.printStackTrace();
          
        } finally {
            cerrarConexion();
        }
        
             }

           public void agregarActividad(Actividad nuevaActividad) {

        try {
            abrirConexion();

            PreparedStatement st = con.prepareStatement("Insert Into Actividad (Descripcion) values (?)");
            
            
            st.setString(1, nuevaActividad.getDescpricion());
          
            st.executeUpdate();
            st.close();

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            cerrarConexion();
        }
    }
           
           public ArrayList<SocioActividades> getAgregarSocioActividades() {
           ArrayList<SocioActividades> lista = new ArrayList<>();    
        try {
            abrirConexion();
            String sql = "select Socio.IdSocio , Actividad.IdActividad , SocioActividades.Habilitado \n" +
            "from Socio join SocioActividades on Socio.IdSocio = SocioActividades.IdSocio\n" +
            "join Actividad on Actividad.IdActividad = SocioActividades.IdActividad";
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
            int IdSocio     =  rs.getInt("IdSocio");
            int IdActividad =  rs.getInt("IdActividad");
            int habilitado  =  rs.getInt("habilitado");
            
            lista.add(new SocioActividades( IdSocio, IdActividad, habilitado));
            
            }
           
            st.close();

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            cerrarConexion();
        }
         return lista;
    }
          
            public ArrayList<CuotasPagadas> getObtenerCuotasPagadas() {
           ArrayList<CuotasPagadas> listaCuotas = new ArrayList<>();    
        try {
            abrirConexion();
            String sql = "select * from CuotasPagadas";
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
            int IdCoutasPagadas = rs.getInt("IdCoutasPagadas");
            int Mes =  rs.getInt("Mes");
            int Año =  rs.getInt("Año");
            int IdSocio = rs.getInt("IdSocio");
            double Precio = rs.getDouble("Precio");
            
            listaCuotas.add(new CuotasPagadas(IdCoutasPagadas, Mes, Año,IdSocio,Precio));
            
            }
           
            st.close();

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            cerrarConexion();
        }
         return listaCuotas;
    }
          
}
