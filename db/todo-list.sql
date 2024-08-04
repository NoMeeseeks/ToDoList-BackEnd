create table usuarios(
 	id_usuario serial primary key,
 	nombre varchar(100) not null,
  	apellido varchar(100) null,
   	correo varchar(150) not null,
   	es_activo varchar(1) not null
);

create table tarea(
	id_tarea serial primary key,
	id_prioridad int not null,
 	titulo varchar(250) not null,
  	descripcion varchar(500) null,
   	fecha date  null,
   	es_activo varchar(1) not null,
   	usuario_creacion varchar(100) not null,
	fecha_creacion date not null,
	usuario_modificacion varchar(100) null,
	fecha_modificacion date null
)

create table prioridades(
	id_prioridad serial primary key,
	nombre varchar(100) not null,
	descripcion varchar(250) null,
	es_activo varchar(1) not null,
	usuario_creacion varchar(100) not null,
	fecha_creacion date not null,
	usuario_modificacion varchar(100) null,
	fecha_modificacion date null
  )
  
ALTER TABLE usuarios ADD COLUMN contrasena varchar(100);


select *
from usuarios u ;

select *
from tarea;

select *
from prioridades;