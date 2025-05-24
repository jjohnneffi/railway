package com.railway.railway_management.controller;

import com.railway.railway_management.dao.TicketDAO;
import com.railway.railway_management.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketDAO ticketDAO;

    @GetMapping("/book")
    public String showBookTicketForm(Model model) {
        model.addAttribute("ticket", new Ticket());
        return "book-ticket";
    }

    @PostMapping("/book")
    public String bookTicket(@ModelAttribute Ticket ticket) {
        ticketDAO.bookTicket(ticket);
        return "redirect:/ticket/list";
    }

    @GetMapping("/list")
    public String viewAllTickets(Model model) {
        List<Ticket> tickets = ticketDAO.getAllTickets();
        model.addAttribute("tickets", tickets);
        return "ticket-list";
    }

    @GetMapping("/cancel/{id}")
    public String cancelTicket(@PathVariable int id) {
        ticketDAO.cancelTicket(id);
        return "redirect:/ticket/list";
    }
}
