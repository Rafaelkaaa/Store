CREATE TABLE IF NOT EXISTS products
(
    id          BIGSERIAL PRIMARY KEY,
    title       VARCHAR(100)     NOT NULL,
    price       DOUBLE PRECISION NOT NULL,
    description VARCHAR(255)     NOT NULL
);
