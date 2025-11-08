package umg.edu.mantenimiento.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "planes_mantenimiento")
public class PlanMantenimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre_plan;
    private String frecuencia;
    private String Tipo_mantenimiento;
    private String observaciones;

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre_plan() { return nombre_plan; }
    public void setNombre_plan(String nombre_plan) { this.nombre_plan = nombre_plan; }
    public String getFrecuencia() { return frecuencia; }
    public void setFrecuencia(String frecuencia) {  this.frecuencia = frecuencia; }
    public String getTipo_mantenimiento() { return Tipo_mantenimiento; }
    public void setTipo_mantenimiento(String tipo_mantenimiento) {  this.Tipo_mantenimiento = tipo_mantenimiento; }
    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

}