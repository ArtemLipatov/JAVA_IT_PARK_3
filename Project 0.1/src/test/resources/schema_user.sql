DROP TABLE users IF EXISTS;
CREATE TABLE user (
  id IDENTITY PRIMARY KEY,
  name VARCHAR(20),
  email VARCHAR(20),
  password VARCHAR(20)
);