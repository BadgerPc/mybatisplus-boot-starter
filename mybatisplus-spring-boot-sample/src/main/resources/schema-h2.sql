
DROP TABLE IF EXISTS account;

CREATE TABLE customers
(
  id          INTEGER PRIMARY KEY,
  login       VARCHAR(255) NOT NULL,
  password    VARCHAR(255) NOT NULL,
  balance     INTEGER      NOT NULL,
  first_name  VARCHAR(255) NOT NULL,
  last_name   VARCHAR(255) NOT NULL,
  middle_name VARCHAR(255) NOT NULL
);
