use avisamedelcoche;

-- Antes 30 borrar
select count(*) from estadocomponente ec
join coche on coche.matricula = ec.matricula and kilometraje is null;

-- Antes 100 no borrar
select count(*) from estadocomponente ec
join coche on coche.matricula = ec.matricula and kilometraje is not null;

-- EJECUTAR 1
delete from estadocomponente 
where matricula in (select matricula from coche where kilometraje is null);


-- Antes 2
select count(*) from coche where kilometraje is null;

-- Antes 21
select count(*) from coche where kilometraje is not null;

-- EJECUTAR 2 
delete from coche where kilometraje is null;