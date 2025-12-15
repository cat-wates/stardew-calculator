CREATE TABLE crop_season_ids
(
    crop                  VARCHAR(255)                            NOT NULL,
    season_id             VARCHAR(255)                            NOT NULL,
    CONSTRAINT pk_crop_season_ids PRIMARY KEY (crop, season_id), FOREIGN KEY (season_id) REFERENCES seasonName (id), FOREIGN KEY (crop) REFERENCES crop (crop)
);

INSERT INTO crop_season_ids
VALUES
('Blue Jazz', 'spring_id'),
('Carrot', 'spring_id'),
('Cauliflower', 'spring_id'),
('Coffee Bean', 'spring_id'),
('Garlic', 'spring_id'),
('Green Bean', 'spring_id'),
 ('Kale', 'spring_id'),
 ('Parsnip', 'spring_id'),
 ('Potato', 'spring_id'),
 ('Rhubarb', 'spring_id'),
('Strawberry', 'spring_id'),
('Tulip', 'spring_id'),
 ('Unmilled Rice', 'spring_id'),

('Blueberry', 'summer_id'),
('Corn', 'summer_id'),
('Hops', 'summer_id'),
('Hot Pepper', 'summer_id'),
('Melon', 'summer_id'),
('Poppy', 'summer_id'),
('Radish', 'summer_id'),
('Red Cabbage', 'summer_id'),
('Starfruit', 'summer_id'),
('Summer Spangle', 'summer_id'),
('Sunflower', 'summer_id'),
('Tomato', 'summer_id'),
('Wheat', 'summer_id'),

('Amaranth', 'fall_id'),
('Artichoke', 'fall_id'),
('Beet', 'fall_id'),
('Bok Choy', 'fall_id'),
('Broccoli', 'fall_id'),
('Corn', 'fall_id'),
('Cranberries', 'fall_id'),
('Eggplant', 'fall_id'),
('Fairy Rose', 'fall_id'),
('Grape', 'fall_id'),
('Pumpkin', 'fall_id'),
('Sunflower', 'fall_id'),
('Sweet Gem Berry', 'fall_id'),
('Wheat', 'fall_id'),
('Yam', 'fall_id'),

('Powdermelon', 'winter_id');



