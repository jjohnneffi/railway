CREATE TABLE ticket (
    id SERIAL PRIMARY KEY,
    train_id INTEGER NOT NULL,
    passenger_id INTEGER NOT NULL,
    travel_date DATE NOT NULL,
    seat_number VARCHAR(10),
    booking_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (train_id) REFERENCES train(id),
    FOREIGN KEY (passenger_id) REFERENCES passenger(id)
);