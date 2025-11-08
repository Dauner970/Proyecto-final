package umg.edu.mantenimiento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umg.edu.mantenimiento.model.Equipo;

public interface PlanMantenimientoRepository extends JpaRepository<Equipo, Long> {}
