package com.railway.railway_management.service;

import com.railway.railway_management.model.Train;
import com.railway.railway_management.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainServiceImpl implements TrainService {

    @Autowired
    private TrainRepository trainRepository;

    @Override
    public List<Train> getAllTrains() {
        return trainRepository.findAll();
    }

    @Override
    public void saveTrain(Train train) {
        trainRepository.save(train);
    }

    @Override
    public Train getTrainById(int id) {
        return trainRepository.findById(id);
    }

    @Override
    public void updateTrain(Train train) {
        trainRepository.update(train);
    }

    @Override
    public void deleteTrain(int id) {
        trainRepository.delete(id);
    }
}
