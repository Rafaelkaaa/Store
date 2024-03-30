CREATE TABLE IF NOT EXISTS users
(
    dtype VARCHAR(255) NOT NULL,
    id SERIAL PRIMARY KEY,
    login VARCHAR(100) NOT NULL,
    password VARCHAR(255) NOT NULL,
    account_non_expired BOOLEAN NOT NULL,
    account_non_locked BOOLEAN NOT NULL,
    credentials_non_expired BOOLEAN NOT NULL,
    enabled BOOLEAN NOT NULL,
    role_type VARCHAR(50) NOT NULL
);
