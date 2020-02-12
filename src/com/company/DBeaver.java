package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBeaver {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "123";

    public ArrayList<City> addCity(City city){
        ArrayList<City>result=new ArrayList<City>();
        String SQL="insert into cities1 (name,people_count) values (?,?)";

        try (Connection conn = Connect.connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            //stmt.setInt(1,city.getID());
            stmt.setString(1, city.getName());
            stmt.setInt(2, city.getPeopleCount());
            result.add(city);
            stmt.executeLargeUpdate();
            result.add(city);
            System.out.println("Successfully1");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }
    public ArrayList<City> cityUpdate(City city){
        ArrayList<City>result=new ArrayList<City>();
        String SQL="insert into cities1 (id,name,people_count)values (?,?,?) on conflict (id) do update set name=?,people_count=?";

        try (Connection conn = Connect.connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setInt(1, city.getID());
            stmt.setString(2, city.getName());
            stmt.setInt(3, city.getPeopleCount());
            stmt.setString(4, city.getName());
            stmt.setInt(5, city.getPeopleCount());
            result.add(city);
            stmt.executeLargeUpdate();
            System.out.println("Successfully1");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }
}
