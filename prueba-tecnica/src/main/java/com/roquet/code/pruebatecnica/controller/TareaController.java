package com.roquet.code.pruebatecnica.controller;

import com.roquet.code.pruebatecnica.model.Tarea;
import com.roquet.code.pruebatecnica.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TareaController {

    @Autowired
    private TareaService tareaService;

    @GetMapping("/")
    public String verPaginaInicio(Model model) {
        model.addAttribute("tarea", new Tarea());
        return "index";
    }

    @GetMapping("/nueva-tarea")
    public String mostrarFormularioDeRegistro(Model model) {
        model.addAttribute("tarea", new Tarea());
        return "registrar-tarea";
    }

    @PostMapping("/guardar-tarea")
    public String guardarTarea(@ModelAttribute("tarea") Tarea tarea) {
        tareaService.guardarTarea(tarea);
        return "redirect:/tareas";
    }

    @GetMapping("/tareas")
    public String listarTareas(Model model) {
        List<Tarea> listaTareas = tareaService.listarTareas();
        System.out.println("Número de tareas enviadas a la vista: " + listaTareas.size());
        model.addAttribute("tareas", listaTareas);
        return "lista-tareas";
    }
}
