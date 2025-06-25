package com.example.controller;
import com.example.entity.Arbol;
import com.example.repository.ArbolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/arboles")
public class ArbolController {
    @Autowired
    private ArbolRepository repo;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("lista", repo.findAll());
        return "arbol/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("arbol", new Arbol());
        return "arbol/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Arbol arbol) {
        repo.save(arbol);
        return "redirect:/arboles";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model) {
        model.addAttribute("arbol", repo.findById(id).orElse(null));
        return "arbol/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id) {
        repo.deleteById(id);
        return "redirect:/arboles";
    }
}