CREATE TABLE IF NOT EXISTS tokens
(
    id SERIAL PRIMARY KEY,
    token VARCHAR(255) NOT NULL,
    expired BOOLEAN NOT NULL,
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES users (id)
);
