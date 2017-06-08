CREATE TABLE country (
  id           BIGINT NOT NULL AUTO_INCREMENT,
  country_name VARCHAR(255),
  PRIMARY KEY (id)
);
CREATE TABLE user (
  id            BIGINT NOT NULL AUTO_INCREMENT,
  address       VARCHAR(255),
  city_name     VARCHAR(255),
  date_of_birth DATETIME,
  first_name    VARCHAR(255),
  gender        VARCHAR(255),
  last_name     VARCHAR(255),
  country_id    BIGINT,
  user_id       BIGINT,
  PRIMARY KEY (id)
);
CREATE TABLE user_type (
  id          BIGINT NOT NULL AUTO_INCREMENT,
  description VARCHAR(255),
  user_type   VARCHAR(255),
  PRIMARY KEY (id)
);
ALTER TABLE user
  ADD CONSTRAINT FK_COUNTRY_ID FOREIGN KEY (country_id) REFERENCES country (id);
ALTER TABLE user
  ADD CONSTRAINT FK_USER_ID FOREIGN KEY (user_id) REFERENCES user_type (id);