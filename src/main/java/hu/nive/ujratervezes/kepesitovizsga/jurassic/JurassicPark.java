package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class JurassicPark {

    DataSource dataSource;

    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> checkOverpopulation() {
        List<String> result = new ArrayList<>();
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select breed from dinosaur where actual>expected");

            while (resultSet.next()) {
                String name = resultSet.getString("breed");
                result.add(name);
            }
            return result;
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Database is inaccesible");
        }
    }
}
