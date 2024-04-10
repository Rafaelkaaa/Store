CREATE TABLE IF NOT EXISTS products
(
    id          SERIAL PRIMARY KEY,
    title       VARCHAR(100)     NOT NULL,
    price       DOUBLE PRECISION NOT NULL,
    description VARCHAR(255)     NOT NULL
);
CREATE TABLE IF NOT EXISTS product_images
(
    id          SERIAL PRIMARY KEY,
    imageUrl      VARCHAR(500) NOT NULL,
    product_id BIGINT,
    FOREIGN KEY (product_id) REFERENCES products (id)
);
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
CREATE TABLE IF NOT EXISTS tokens
(
    id SERIAL PRIMARY KEY,
    token VARCHAR(255) NOT NULL,
    expired BOOLEAN NOT NULL,
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES users (id)
);
