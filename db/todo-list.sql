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
ALTER TABLE tarea ADD COLUMN id_usuario int;

ALTER TABLE tarea add constraint llaveForaneaPrioridades foreign key (id_prioridad) references prioridades(id_prioridad);
ALTER TABLE tarea add constraint llaveForaneaUsuario foreign key (id_usuario) references usuarios(id_usuario);

select *
from usuarios u ;

select *
from tarea;

select *
from prioridades;

select t.id_tarea,t.titulo ,t.descripcion ,t.id_usuario, u.nombre , t.id_prioridad , p.nombre 
from tarea t, usuarios u, prioridades p
where t.id_usuario = u.id_usuario 
and t.id_prioridad  = p.id_prioridad 