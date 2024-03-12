package dao;

import model.Currency;
import datasource.MDBConnection;
import java.util.*;
import java.sql.*;

public class CurrencyDao {
    public List<Currency> getAllCurrencies() {
        // Get everything ready before connecting to the database
        List<Currency> currencies = new ArrayList<>();
        Connection connection = MDBConnection.getConnection();
        String sql = "SELECT abbr, name, rate FROM currencies";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String abbr = resultSet.getString("abbr");
                String name = resultSet.getString("name");
                double rate = resultSet.getDouble("rate");
                Currency curr = new Currency(name, rate, abbr);
                currencies.add(curr);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return currencies;
    }
}
