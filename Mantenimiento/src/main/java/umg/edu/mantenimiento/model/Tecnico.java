package umg.edu.mantenimiento.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tecnicos")
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String puesto;
    private String contacto;
    private String correo;

    @OneToMany(mappedBy = "tecnico", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrdenTrabajo> ordenes;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getPuesto() { return puesto; }
    public void setPuesto(String especialidad) { this.puesto = especialidad; }
    public List<OrdenTrabajo> getOrdenes() { return ordenes; }
    public void setOrdenes(List<OrdenTrabajo> ordenes) { this.ordenes = ordenes; }
    public String getContacto() { return contacto; }
    public void setContacto(String contacto) { this.contacto = contacto; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
}