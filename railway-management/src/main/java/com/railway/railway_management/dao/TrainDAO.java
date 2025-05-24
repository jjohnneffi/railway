package com.railway.railway_management.dao;

import com.railway.railway_management.model.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TrainDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addTrain(Train train) {
        String sql = "INSERT INTO trains (name, source, destination, seats) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, train.getName(), train.getSource(), train.getDestination(), train.getSeats());
    }

    public List<Train> getAllTrains() {
        String sql = "SELECT * FROM trains";
        return jdbcTemplate.query(sql, new RowMapper<Train>() {
            @Override
            public Train mapRow(ResultSet rs, int rowNum) throws SQLException {
                Train train = new Train();
                train.setId(rs.getInt("id"));
                train.setName(rs.getString("name"));
                train.setSource(rs.getString("source"));
                train.setDestination(rs.getString("destination"));
                train.setSeats(rs.getInt("seats"));
                return train;
            }
        });
    }
}
