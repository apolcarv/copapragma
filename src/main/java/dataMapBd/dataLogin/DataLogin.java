package dataMapBd.dataLogin;

import models.login.LoginData;
import utils.conexionBD.ConexionBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataLogin {
    public List<LoginData> list = new ArrayList<>();
    private ConexionBD conexionBD = new ConexionBD();

    public DataLogin(){
        try{
            String query = "";
            Statement statement = conexionBD.connection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                LoginData credentials = new LoginData();
                credentials.setUser(resultSet.getString(2));
                credentials.setPassword(resultSet.getString(3));
                list.add(credentials);
            }
            System.out.println();
            System.out.println("lista: "+list);
        }catch (SQLException e) {
            System.err.println(e);
        }
    }
}
