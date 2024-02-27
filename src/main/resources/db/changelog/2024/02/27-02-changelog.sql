-- liquibase formatted sql

-- changeset Acer:1709062465667-1
CREATE TABLE credential
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    file       LONGTEXT              NOT NULL,
    wallet_id  BIGINT                NULL,
    type       VARCHAR(255)          NULL,
    issuer     VARCHAR(255)          NULL,
    valid_from datetime              NULL,
    context    VARCHAR(255)          NULL,
    claim_id   VARCHAR(255)          NULL,
    claim      VARCHAR(255)          NULL,
    CONSTRAINT pk_credential PRIMARY KEY (id)
);

-- changeset Acer:1709062465667-2
CREATE TABLE pid
(
    id                   BIGINT AUTO_INCREMENT NOT NULL,
    first_name           VARCHAR(255)          NOT NULL,
    family_name          VARCHAR(255)          NOT NULL,
    date_of_birth        datetime              NOT NULL,
    family_name_at_birth VARCHAR(255)          NULL,
    first_name_at_birth  VARCHAR(255)          NULL,
    place_of_birth       VARCHAR(255)          NULL,
    current_address      VARCHAR(255)          NULL,
    gender               VARCHAR(255)          NULL,
    nationality          VARCHAR(255)          NULL,
    ssn                  BIGINT                NULL,
    CONSTRAINT pk_pid PRIMARY KEY (id)
);

-- changeset Acer:1709062465667-3
CREATE TABLE wallet
(
    id BIGINT AUTO_INCREMENT NOT NULL,
    CONSTRAINT pk_wallet PRIMARY KEY (id)
);

-- changeset Acer:1709062465667-4
ALTER TABLE credential
    ADD CONSTRAINT FK_CREDENTIAL_ON_WALLET FOREIGN KEY (wallet_id) REFERENCES wallet (id);

-- changeset Acer:1709062465667-5
ALTER TABLE wallet
    ADD CONSTRAINT FK_WALLET_ON_ID FOREIGN KEY (id) REFERENCES pid (id);