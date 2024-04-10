CREATE TABLE IF NOT EXISTS product_images
(
    id          SERIAL PRIMARY KEY,
    imageUrl      VARCHAR(500) NOT NULL,
    product_id BIGINT,
    FOREIGN KEY (product_id) REFERENCES products (id)
);
