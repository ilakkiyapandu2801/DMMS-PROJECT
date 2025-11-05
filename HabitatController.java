package src.controller;

import src.model.Habitat;
import src.utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HabitatController {

    public List<Habitat> getHabitats() {
        List<Habitat> habitats = new ArrayList<>();
        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM habitats");
            while (rs.next()) {
                Habitat h = new Habitat();
                h.setHabitatId(rs.getInt("habitat_id"));
                h.setName(rs.getString("name"));
                h.setLocation(rs.getString("location"));
                h.setDescription(rs.getString("description"));
                habitats.add(h);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return habitats;
    }

    public boolean addHabitat(String name, String location, String description) {
        try {
            Connection conn = DBConnection.getConnection();
            String sql = "INSERT INTO habitats (name, location, description) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, location);
            ps.setString(3, description);
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
