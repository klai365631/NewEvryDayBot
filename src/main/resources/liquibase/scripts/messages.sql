--liquibase formatted sql
-- changeSet aklimov:6
CREATE TABLE notification_task(
                                  id bigint,
                                  id_chat bigint,
                                  notifications varchar,
                                  date timestamp
);