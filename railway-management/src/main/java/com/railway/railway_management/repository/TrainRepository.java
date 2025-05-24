package com.railway.railway_management.repository;

import com.railway.railway_management.model.Train;
import java.util.List;

public interface TrainRepository {
    List<Train> findAll();
    void save(Train train);
    Train findById(int id);
    void update(Train train);
    void delete(int id);
}
