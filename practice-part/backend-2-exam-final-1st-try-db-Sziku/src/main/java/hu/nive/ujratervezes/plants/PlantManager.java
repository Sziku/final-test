package hu.nive.ujratervezes.plants;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlantManager {

    private final String dbUrl;
    private final String dbUser;
    private final String dbPassword;

    public PlantManager(String dbUrl, String dbUser, String dbPassword) {
        this.dbUrl = dbUrl;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
    }

    public List<String> getPlantsToBeWatered() {
        final String sql = "SELECT DISTINCT plant_name FROM plants p LEFT JOIN watered w ON p.plant_id = w.plant_id AND watered_at >= '2022-01-01' WHERE w.plant_id IS NULL ORDER BY plant_name ASC";

        try(Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)){
            PreparedStatement st = con.prepareStatement(sql);

            ResultSet rs = st.executeQuery();
            List<String> resultList = new ArrayList<>();
            while (rs.next()){
                resultList.add(rs.getString(1));
            }
            System.out.println(resultList);
            return resultList;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
