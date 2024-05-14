-- Код міграції для зміни розміру стовпця token на 500 символів
ALTER TABLE tokens
ALTER COLUMN token TYPE VARCHAR(500);
