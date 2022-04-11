DROP TABLE IF EXISTS student CASCADE;
DROP TABLE IF EXISTS teacher CASCADE;
DROP TABLE IF EXISTS subject CASCADE;
DROP TABLE IF EXISTS mark CASCADE;
DROP TABLE IF EXISTS teacher_subject CASCADE;

CREATE TABLE student(
	id SERIAL,
	first_name varchar(30) NOT NULL,
	last_name varchar(30) NOT NULL,
	course integer NOT NULL,
	CHECK ( course >=1 AND course <=5),
	PRIMARY KEY ( id )
);

CREATE TABLE teacher(
	id SERIAL,  
	first_name varchar(30) NOT NULL,
	last_name varchar(30) NOT NULL,
	email varchar(30) NOT NULL,
	PRIMARY KEY ( id )
); 

CREATE TABLE subject(
	id SERIAL,
	title varchar(70) NOT NULL,
	duration integer NOT NULL,
	course integer NOT NULL,
	CHECK ( course >=1 AND course <=5),
	PRIMARY KEY ( id )
);
  
CREATE TABLE teacher_subject (
	teacher_id integer NOT NULL,
	subject_id integer NOT NULL,
	FOREIGN KEY ( teacher_id )
		REFERENCES teacher (id ) ON DELETE CASCADE,
	FOREIGN KEY ( subject_id )
		REFERENCES subject (id ) ON DELETE CASCADE,
	PRIMARY KEY (teacher_id, subject_id)
);

CREATE TABLE mark (
	student_id integer NOT NULL,
	subject_id integer NOT NULL,
	grade char NOT NULL,
	CHECK (grade in ('A', 'B', 'C', 'D', 'E', 'F') ),
	FOREIGN KEY ( student_id )
		REFERENCES student (id ) ON DELETE CASCADE,
	FOREIGN KEY ( subject_id )
		REFERENCES subject (id ) ON DELETE CASCADE,
	PRIMARY KEY (student_id, subject_id)
);

INSERT INTO student (first_name, last_name, course) VALUES 
	('Андрей', 'Алексеев', 1),
 	('Иван', 'Андреев', 2),
 	('Вероника', 'Борисова', 1),
 	('Ирина', 'Гурченкова', 3),
 	('Тимофей', 'Демочкин', 2),
 	('Максим', 'Калугин', 4),
 	('Андрей', 'Коротков', 1),
 	('Анастасия', 'Кравчук', 3),
 	('Степан', 'Михальченков', 2),
  	('Максим', 'Остапенко', 5),
  	('Максим', 'Мухин', 4),
 	('Юлия', 'Саврухина', 1),
 	('Ирина', 'Симонова', 2),
  	('Олег', 'Усов', 5),
 	('Данила', 'Черногузов', 3),
	('Дмитрий', 'Исторкин', 3),
	('Вероника', 'Виноградова', 3),
	('Дарья', 'Кондаурова', 1),
 	('Анастасия', 'Коникова', 4),
	('Виталий', 'Лунгу', 2),
 	('Ульяна', 'Орешкова', 2),
	('Дарья', 'Пыркова', 1),
	('Алина', 'Ручьева', 1),
 	('Кирилл', 'Фролов', 5),
 	('Алексей', 'Шпис', 5),
 	('Денис', 'Хомяков', 4),
 	('Карина', 'Хомякова', 5),
 	('Диана', 'Помозова', 2);

 
 INSERT INTO teacher (last_name, first_name, email)	VALUES
	('Бабекин', 'Максим', 'mbabekin@mail.ru'),
	('Бирюков', 'Андрей', 'abirukov@mail.ru'),
	('Глухова', 'София', 'sgluhova@mail.ru'),
	('Каледина', 'Каледина', 'mkaledina@mail.ru'),
	('Кутин', 'Петр', 'pkutin@mail.ru'),
	('Маленков', 'Павел', 'pmalenkov@mail.ru'),
	('Лосева', 'Элона', 'eloseva@mail.ru'),
	('Павлов', 'Михаил', 'mpavlov@mail.ru'),
	('Смирнов', 'Вадим', 'vsmirnov@mail.ru');

INSERT INTO subject (title, duration, course)	VALUES
	('рисунок', 110, 1),
	('живопись', 115, 1),
	('черчение', 95, 1),
	('пропедевтика', 87, 1),
	('пластическая анатомия', 100, 1),
	('философия', 100, 2),
	('начертательная геометрия', 120, 2),
	('фотографика', 80, 2),
	('дизайн и рекламные технологии', 112, 2),
	('история искусств', 115, 2),
	('эстетика', 117, 3),
	('проектирование в ГД', 140, 3),
	('техника графики', 130, 3),
	('компьютерные технологии', 142, 3),
	('история орнамента', 82, 3),
	('рисунок', 102, 4),
	('художественно-техническое редактирование', 112, 4),
	('предпечатная подготовка', 100, 4),
	('авторское право', 95, 4),
	('рекламная фотография', 105, 4),
	('пиар-технологии', 105, 5),
	('организация проектной деятельности', 110, 5),
	('история графического дизайна и рекламы', 132, 5),
	('технология полиграфии', 118, 5),
	('моделирование', 148, 5);
	
INSERT INTO teacher_subject (teacher_id, subject_id) VALUES
	(1, 1);
	
INSERT INTO mark ( student_id, subject_id, grade) VALUES
	(1, 1, 'A');
	



