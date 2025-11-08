package umg.edu.mantenimiento.controller;

import org.springframework.web.bind.annotation.*;
import umg.edu.mantenimiento.model.Equipo;
import umg.edu.mantenimiento.service.EquipoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/equipos")
@CrossOrigin(origins = "*")
public class EquipoController {

    private final EquipoService equipoService;

    public EquipoController(EquipoService equipoService) {
        this.equipoService = equipoService;
    }

    @GetMapping
    public List<Equipo> listar() {
        return equipoService.listar();
    }

    @GetMapping("/{id}")
    public Optional<Equipo> buscarPorId(@PathVariable Long id) {
        return equipoService.buscarPorId(id);
    }

    @PostMapping
    public Equipo guardar(@RequestBody Equipo equipo) {
        return equipoService.guardar(equipo);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        equipoService.eliminar(id);
    }

}