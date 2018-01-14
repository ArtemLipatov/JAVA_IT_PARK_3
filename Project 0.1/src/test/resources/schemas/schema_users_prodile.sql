CREATE TABLE users_profile
(
  firstname    VARCHAR(255),
  lastname     VARCHAR(255),
  organization VARCHAR(255),
  phonenumber  VARCHAR(20),
  users_id     INTEGER
    CONSTRAINT users_profile_users_id_fkey
    REFERENCES users
);

