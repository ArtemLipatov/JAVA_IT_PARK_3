INSERT INTO owner
(id, email, hash_password, state, role)
  SELECT
    1,
    'admin@admin.com',
    '$2a$10$FjkmLRPsJ24FoiJ1L.Rxg.mqvoOlJ3gi4myItAk8HcKtgEeiHpNvW',
    'CONFIRMED',
    'ADMIN'
  WHERE
    NOT EXISTS(
        SELECT id
        FROM owner
        WHERE id = 1
    );

CREATE TABLE IF NOT EXISTS persistent_logins(
  username VARCHAR(64) NOT NULL,
  series VARCHAR(64) PRIMARY KEY NOT NULL,
  token VARCHAR(64) NOT NULL,
  last_used TIMESTAMP NOT NULL
)