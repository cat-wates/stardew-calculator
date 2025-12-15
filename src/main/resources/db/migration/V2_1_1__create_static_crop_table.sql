CREATE TABLE crop (

    crop                   VARCHAR(255)                 NOT NULL,
    cost_per_seed_pierre   INTEGER                      NOT NULL,
    cost_per_seed_jojo     INTEGER                      NOT NULL,
    basic_selling_price    INTEGER                      NOT NULL,
    silver_selling_price   INTEGER                      NOT NULL,
    gold_selling_price     INTEGER                      NOT NULL,
    iridium_selling_price  INTEGER                      NOT NULL,
    time_to_maturity       INTEGER                      NOT NULL,
    time_to_regrow         INTEGER,
    CONSTRAINT pk_crop PRIMARY KEY (crop)
);

INSERT INTO crop
VALUES
('Blue Jazz',    30, 37,   50,  62,  75, 100,  7,  NULL),
('Carrot',        0,  0,   35,  43,  52,  70,  3,  NULL),
('Cauliflower',  80,100,  175, 218, 262, 350, 12,  NULL),
('Coffee Bean',2500,2500,  15,  18,  22,  30, 10,     2),
('Garlic',       40, 40,   60,  75,  90, 120,  4,  NULL),
('Green Bean',   60, 75,   40,  50,  60,  80, 10,     3),
('Kale',         70, 87,  110, 137, 165, 220,  6,  NULL),
('Parsnip',      20, 25,   35,  43,  52,  70,  4,  NULL),
('Potato',       50, 62,   80, 100, 120, 160,  6,  NULL),
('Rhubarb',     100,125,  220, 275, 330, 440, 13,  NULL),
('Strawberry',  100,125,  120, 150, 180, 240,  8,     4),
('Tulip',        20, 25,   30,  37,  45,  60,  6,  NULL),
('Unmilled Rice',40, 40,   30,  37,  45,  60,  3,     6),

('Blueberry',     80, 100,  50,  62,  75,  100, 13,    4),
('Corn',         150, 187,  50,  62,  75,  100, 14,    4),
('Hops',          60,  75,  25,  31,  37,  50,  11,    1),
('Hot Pepper',    40,  50,  40,  50,  60,  80,   5,    3),
('Melon',         80, 100, 250, 312, 375, 500,  12, NULL),
('Poppy',        100, 125, 140, 175, 210, 280,   7, NULL),
('Radish',        40,  50,  90, 112, 135, 180,   6, NULL),
('Red Cabbage',  100,   0, 260, 325, 390, 520,   9, NULL),
('Starfruit',    400,   0, 750, 937,1125,1500,  13, NULL),
('Summer Spangle',50,  62,  90, 112, 135, 180,   8, NULL),
('Sunflower',    200, 125,  80, 100, 120, 160,   8, NULL),
('Tomato',        50,  62,  60,  75,  90, 120,  11,    4),
('Wheat',         10,  12,  25,  31,  37,  50,   4, NULL),

('Amaranth',        70,  87, 150, 187, 225, 300,  7,  NULL),
('Artichoke',       30,  37, 160, 200, 240, 320,  8,  NULL),
('Beet',            20,  20, 100, 125, 150, 200,  6,  NULL),
('Bok Choy',        50,  62,  80, 100, 120, 160,  4,  NULL),
('Broccoli',         0,   0,  70,  87, 105, 140,  8,     4),
('Cranberries',    240, 300,  75,  93, 112, 150,  7,     5),
('Eggplant',        20,  25,  60,  75,  90, 120,  5,     5),
('Fairy Rose',     200, 250, 290, 362, 435, 580, 12,  NULL),
('Grape',           60,  75,  80, 100, 120, 160, 10,     3),
('Pumpkin',        100, 125, 320, 400, 480, 640, 13,  NULL),
('Sweet Gem Berry',1000,  0,3000,3750,4500,6000,24,  NULL),
('Yam',             60,  75, 160, 200, 240, 320, 10,  NULL),

('Powdermelon',      0,   0,  60,  75,  90, 120,  7,  NULL);