package com.railway.railway_management.dao;

import com.railway.railway_management.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TicketDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void bookTicket(Ticket ticket) {
        String sql = "INSERT INTO tickets (passenger_name, train_id, seat_number) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, ticket.getPassengerName(), ticket.getTrainId(), ticket.getSeatNumber());
    }

    public List<Ticket> getAllTickets() {
        String sql = "SELECT * FROM tickets";
        return jdbcTemplate.query(sql, new RowMapper<Ticket>() {
            @Override
            public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
                Ticket ticket = new Ticket();
                ticket.setId(rs.getInt("id"));
                ticket.setPassengerName(rs.getString("passenger_name"));
                ticket.setTrainId(rs.getInt("train_id"));
                ticket.setSeatNumber(rs.getInt("seat_number"));
                return ticket;
            }
        });
    }

    public void cancelTicket(int id) {
        String sql = "DELETE FROM tickets WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
