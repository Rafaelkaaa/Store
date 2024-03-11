CREATE TABLE IF NOT EXISTS product_images
(
    product_id BIGINT,
    image      VARCHAR(500) NOT NULL,
    PRIMARY KEY (product_id, image),
    FOREIGN KEY (product_id) REFERENCES product (id)
);