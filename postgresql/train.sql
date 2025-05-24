CREATE TABLE train (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    type VARCHAR(50),
    capacity INTEGER NOT NULL,
    route_id INTEGER,
    FOREIGN KEY (route_id) REFERENCES route(id)
);
