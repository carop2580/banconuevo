
package DTO;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDTO {
    
    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private Date fechadenacimiento;    
    private String direccion;    
    private String provincia;     
    private String telefono;
    private String localidad; 
    private String email;
    private String n_cuenta;
    
}
