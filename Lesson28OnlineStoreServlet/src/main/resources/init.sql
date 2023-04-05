-- auto-generated definition
create schema "online-store";

create table "online-store".categories
(
    id          integer,
    name        text,
    "imageName" text
);

alter table "online-store".categories
    owner to postgres;



INSERT INTO "online-store".categories (id, name, "imageName")
VALUES (1, 'Mobile phones', 'mobile.jpg');
INSERT INTO "online-store".categories (id, name, "imageName")
VALUES (2, 'Laptops', 'laptop.jpg');
INSERT INTO "online-store".categories (id, name, "imageName")
VALUES (3, 'GPS Navigators', 'jps_nav.jpg');
INSERT INTO "online-store".categories (id, name, "imageName")
VALUES (4, 'Fridges', 'fridge.jpg');
INSERT INTO "online-store".categories (id, name, "imageName")
VALUES (5, 'Cars', 'car.jpg');
INSERT INTO "online-store".categories (id, name, "imageName")
VALUES (6, 'Cameras', 'camera.jpg')