
package entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Getter
@Setter
@Table(name= "Empleado")
public class EmpleadoEntity implements Serializable {
    
   
	
	@Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    @Column (name = "Fecha_de_nac")
    @DateTimeFormat(pattern = "yyyy/MM7dd")
    private LocalDate fechadenacimiento;
    private String direccion;
    private String localidad;
    private String provincia;
    private String telefono;
    private String email;
    private String puesto;   
    private double Salario;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "Sucursal_id", insertable = false, updatable = false )
    private SucursalEntity sucursal;
    
    @Column (name= "Sucursal_id", nullable = false)
    private Long sucursalId;

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}
}
