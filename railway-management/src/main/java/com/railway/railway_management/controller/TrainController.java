package com.railway.railway_management.controller;

import com.railway.railway_management.dao.TrainDAO;
import com.railway.railway_management.model.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/train")
public class TrainController {

    @Autowired
    private TrainDAO trainDAO;

    @GetMapping("/add")
    public String showAddTrainForm(Model model) {
        model.addAttribute("train", new Train());
        return "add-train";
    }

    @PostMapping("/add")
    public String addTrain(@ModelAttribute Train train) {
        trainDAO.addTrain(train);
        return "redirect:/train/list";
    }

    @GetMapping("/list")
    public String viewAllTrains(Model model) {
        List<Train> trains = trainDAO.getAllTrains();
        model.addAttribute("trains", trains);
        return "train-list";
    }
}
