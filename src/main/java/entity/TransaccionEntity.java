
package entity;

import java.io.Serializable;
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

@Entity
@Getter
@Setter
@Table (name="Transacciones")
public class TransaccionEntity implements Serializable {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "Sucursal_id", insertable = false, updatable = false )
    private SucursalEntity sucursal;
    
    @Column (name= "Sucursal_id", nullable = false)
    private Long sucursalId;
    
     @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "Cliente_id", insertable = false, updatable = false )
    private ClienteEntity cliente;
    
    @Column (name= "Cliente_id", nullable = false)
    private Long clienteId;
    
     @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "Producto_id", insertable = false, updatable = false )
    private ProductoEntity producto;
    
    @Column (name= "Producto_id", nullable = false)
    private Long productoId;
    
    private double interes;
    
    private double monto;
}
