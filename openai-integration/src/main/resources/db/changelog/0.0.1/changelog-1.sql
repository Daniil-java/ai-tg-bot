--liquibase formatted sql

--changeset DanielK:1
CREATE TABLE IF NOT EXISTS open_ai_keys
(
    key_id      serial not null primary key,
    tg_id       int not null,
    title       text,
    key         text,
    updated     timestamp DEFAULT current_timestamp,
    created     timestamp DEFAULT current_timestamp
);

