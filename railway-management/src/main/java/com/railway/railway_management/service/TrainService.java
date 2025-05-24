package com.railway.railway_management.service;

import com.railway.railway_management.model.Train;
import java.util.List;

public interface TrainService {
    List<Train> getAllTrains();
    void saveTrain(Train train);
    Train getTrainById(int id);
    void updateTrain(Train train);
    void deleteTrain(int id);
}
