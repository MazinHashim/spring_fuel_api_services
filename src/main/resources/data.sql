
insert into user values(1, 'maz.hash03@gmail.com',false,'654321', 'Mazin Hashim', true);
insert into user values(2, 'musaab@gmail.com',false,'123456', 'Musaab Shaib', true);

insert into company values(1, 'Oil Energy','oilenergy@gmail.com','oil123', 'link', true);
insert into company values(2, 'Nile Petrol','nile@gmail.com','nile456', 'link', true);

insert into station values(1, 'Khartoum1', 20, 60, true, 32.15662, 15.11932,'nile1231','Nile Station1',10, true,1);
insert into station values(2, 'Khartoum2', 80, 56, true, 32.17562, 15.12652,'nile1232','Nile Station2',5, true,1);
insert into station values(3, 'Khartoum3', 60, 40, true, 32.48136, 15.15822,'oil1232','Oil Station',15, true,2);

insert into service values(1, 'clean the car', 200.0, 'cleaning1', 1);
insert into service values(2, 'clean the car', 300.0, 'cleaning2', 2);

insert into feedback values(1, 'this is a good service', 'good', 2, 1);

insert into station_users values(1, 1);
insert into station_users values(1, 2);

insert into alien values(111,'Manal','Java');
insert into alien values(222,'Noha','Android');
insert into alien values(333,'Osman','IOS');
insert into alien values(444,'Sara','Spring Boot');
insert into alien values(555,'Mazin','Spring Boot');