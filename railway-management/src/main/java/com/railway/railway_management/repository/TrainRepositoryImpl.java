package com.railway.railway_management.repository;

import com.railway.railway_management.model.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TrainRepositoryImpl implements TrainRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final RowMapper<Train> trainRowMapper = new RowMapper<>() {
        @Override
        public Train mapRow(ResultSet rs, int rowNum) throws SQLException {
            Train train = new Train();
            train.setId(rs.getInt("id"));
            train.setName(rs.getString("name"));
            train.setSource(rs.getString("source"));
            train.setDestination(rs.getString("destination"));
            return train;
        }
    };

    @Override
    public List<Train> findAll() {
        String sql = "SELECT * FROM trains";
        return jdbcTemplate.query(sql, trainRowMapper);
    }

    @Override
    public void save(Train train) {
        String sql = "INSERT INTO trains (name, source, destination) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, train.getName(), train.getSource(), train.getDestination());
    }

    @Override
    public Train findById(int id) {
        String sql = "SELECT * FROM trains WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, trainRowMapper, id);
    }

    @Override
    public void update(Train train) {
        String sql = "UPDATE trains SET name = ?, source = ?, destination = ? WHERE id = ?";
        jdbcTemplate.update(sql, train.getName(), train.getSource(), train.getDestination(), train.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM trains WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
