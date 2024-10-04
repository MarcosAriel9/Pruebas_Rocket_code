package com.roquet.code.pruebatecnica.repository;

import com.roquet.code.pruebatecnica.model.Tarea;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TareaMapper {

    @Insert("INSERT INTO tareas(nombre, descripcion, fecha_inicio) VALUES (#{nombre}, #{descripcion}, #{fechaInicio})")
    void insertarTarea(Tarea tarea);

    @Select("SELECT id, nombre, descripcion, fecha_inicio AS fechaInicio FROM tareas")    
    List<Tarea> listarTareas();
}
