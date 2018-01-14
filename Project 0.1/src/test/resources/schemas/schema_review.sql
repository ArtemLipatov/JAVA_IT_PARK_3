CREATE TABLE review
(
  id         BIGSERIAL    NOT NULL,
  text       VARCHAR(255) NOT NULL,
  date       VARCHAR(20)  NOT NULL,
  rating     INTEGER      NOT NULL
    CONSTRAINT review_rating_pk
    PRIMARY KEY,
  users_id   INTEGER      NOT NULL
    CONSTRAINT review_users_id_fkey
    REFERENCES users,
  product_id INTEGER
    CONSTRAINT review_product_id_fk
    REFERENCES product
);

CREATE UNIQUE INDEX review_id_uindex
  ON review (id);

