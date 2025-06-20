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
    season                 VARCHAR(255)
    CONSTRAINT pk_crop PRIMARY KEY (crop)
)

INSERT INTO crop (crop, cost_per_seed_pierre, cost_per_seed_jojo, basic_selling_price,
                  silver_selling_price, gold_selling_price, iridium_selling_price,
                  time_to_maturity, time_to_regrow, season) VALUES
('Blue Jazz',    30, 37,   50,  62,  75, 100,  7,  NULL, 'Spring'),
('Carrot',        0,  0,   35,  43,  52,  70,  3,  NULL, 'Spring');
('Cauliflower',  80,100,  175, 218, 262, 350, 12,  NULL, 'Spring'),
('Coffee Bean',2500,2500,  15,  18,  22,  30, 10,     2, 'Spring'),
('Garlic',       40, 40,   60,  75,  90, 120,  4,  NULL, 'Spring'),
('Green Bean',   60, 75,   40,  50,  60,  80, 10,     3, 'Spring'),
('Kale',         70, 87,  110, 137, 165, 220,  6,  NULL, 'Spring'),
('Parsnip',      20, 25,   35,  43,  52,  70,  4,  NULL, 'Spring'),
('Potato',       50, 62,   80, 100, 120, 160,  6,  NULL, 'Spring'),
('Rhubarb',     100,125,  220, 275, 330, 440, 13,  NULL, 'Spring'),
('Strawberry',  100,125,  120, 150, 180, 240,  8,     4, 'Spring'),
('Tulip',        20, 25,   30,  37,  45,  60,  6,  NULL, 'Spring'),
('Unmilled Rice',40, 40,   30,  37,  45,  60,  3,     6, 'Spring'),

('Blueberry',     80, 100,  50,  62,  75,  100, 13,    4, 'Summer'),
('Corn',         150, 187,  50,  62,  75,  100, 14,    4, 'Summer'),
('Hops',          60,  75,  25,  31,  37,  50,  11,    1, 'Summer'),
('Hot Pepper',    40,  50,  40,  50,  60,  80,   5,    3, 'Summer'),
('Melon',         80, 100, 250, 312, 375, 500,  12, NULL, 'Summer'),
('Poppy',        100, 125, 140, 175, 210, 280,   7, NULL, 'Summer'),
('Radish',        40,  50,  90, 112, 135, 180,   6, NULL, 'Summer'),
('Red Cabbage',  100,   0, 260, 325, 390, 520,   9, NULL, 'Summer'),
('Starfruit',    400,   0, 750, 937,1125,1500,  13, NULL, 'Summer'),
('Summer Spangle',50,  62,  90, 112, 135, 180,   8, NULL, 'Summer'),
('Sunflower',    200, 125,  80, 100, 120, 160,   8, NULL, 'Summer'),
('Tomato',        50,  62,  60,  75,  90, 120,  11,    4, 'Summer'),
('Wheat',         10,  12,  25,  31,  37,  50,   4, NULL, 'Summer'),

('Amaranth',        70,  87, 150, 187, 225, 300,  7,  NULL, 'Fall'),
('Artichoke',       30,  37, 160, 200, 240, 320,  8,  NULL, 'Fall'),
('Beet',            20,  20, 100, 125, 150, 200,  6,  NULL, 'Fall'),
('Bok Choy',        50,  62,  80, 100, 120, 160,  4,  NULL, 'Fall'),
('Broccoli',         0,   0,  70,  87, 105, 140,  8,     4, 'Fall'),
('Corn',           150, 187,  50,  62,  75, 100, 14,     4, 'Fall'),
('Cranberries',    240, 300,  75,  93, 112, 150,  7,     5, 'Fall'),
('Eggplant',        20,  25,  60,  75,  90, 120,  5,     5, 'Fall'),
('Fairy Rose',     200, 250, 290, 362, 435, 580, 12,  NULL, 'Fall'),
('Grape',           60,  75,  80, 100, 120, 160, 10,     3, 'Fall'),
('Pumpkin',        100, 125, 320, 400, 480, 640, 13,  NULL, 'Fall'),
('Sunflower',      200, 250,  80, 100, 120, 160,  8,  NULL, 'Fall'),
('Sweet Gem Berry',1000,NULL,3000,3750,4500,6000,24,  NULL, 'Fall'),
('Wheat',           10,  12,  25,  31,  37,  50,  4,  NULL, 'Fall'),
('Yam',             60,  75, 160, 200, 240, 320, 10,  NULL, 'Fall'),

('Powdermelon',      0,   0,  60,  75,  90, 120,  7,  NULL, 'Winter');







