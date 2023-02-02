

-La tabla se llama Persona y tiene las columnas id,nombre,apellidos,fechaNacimiento,fechaCaptura
-La tabla se llama Carros y tiene las columnas id,marca,fechaCaptura,fechaEmision
select * from Persona
select * from Carros;

create table Carros(id PRIMARY KEY AUTOINCREMENT, marca TEXT,fechaCaptura TEXT fechaEmision TEXT);

drop table Carros;

insert into Carros(marca,fechaCaptura,fechaEmision) ('Chevrolett',date('now'),date('now'));

update Carros set marca = 'Nissan' where id = 1;
