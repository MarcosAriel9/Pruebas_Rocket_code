package com.roquet.code.pruebatecnica.service;

import com.roquet.code.pruebatecnica.model.Tarea;
import com.roquet.code.pruebatecnica.repository.TareaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {

    @Autowired
    private TareaMapper tareaMapper;

    public void guardarTarea(Tarea tarea) {
        tareaMapper.insertarTarea(tarea);
    }

    public List<Tarea> listarTareas() {
        List<Tarea> tareas = tareaMapper.listarTareas();
        for (Tarea tarea : tareas) {
            System.out.println("Fecha de inicio: " + tarea.getFechaInicio());
        }
        return tareas;
    }
    
}
