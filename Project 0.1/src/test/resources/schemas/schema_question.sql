CREATE TABLE question
(
  id        BIGSERIAL    NOT NULL
    CONSTRAINT question_pkey
    PRIMARY KEY,
  text      VARCHAR(255) NOT NULL,
  date      VARCHAR(20)  NOT NULL,
  users_id  INTEGER      NOT NULL
    CONSTRAINT question_users_id_fkey
    REFERENCES users,
  user_name VARCHAR(20)  NOT NULL
    CONSTRAINT question_username_fkey
    REFERENCES users (name)
);
