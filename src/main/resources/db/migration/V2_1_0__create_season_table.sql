CREATE TABLE season
(
    id               VARCHAR(255)                            NOT NULL,
    name      VARCHAR(255)                            NOT NULL,
    CONSTRAINT pk_season PRIMARY KEY (id)
);

INSERT INTO season
VALUES
('spring_id', 'SPRING'),
('summer_id', 'SUMMER'),
('fall_id',   'FALL'),
('winter_id', 'WINTER');