CREATE TABLE product
(
  id           BIGSERIAL    NOT NULL
    CONSTRAINT product_pkey
    PRIMARY KEY,
  name         VARCHAR(255) NOT NULL,
  model        VARCHAR(255) NOT NULL,
  description  VARCHAR(255) NOT NULL,
  color        VARCHAR(20)  NOT NULL,
  product_code VARCHAR(255) NOT NULL,
  rating       INTEGER,
  price        INTEGER
);

