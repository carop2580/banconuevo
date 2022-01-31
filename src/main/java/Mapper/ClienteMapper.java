
package Mapper;




import DTO.ClienteDTO;
import entity.ClienteEntity;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {
    
  /*  public ClienteEntity ClienteDTO2Entity(ClienteDTO dto){
        
        ClienteEntity cliente = new ClienteEntity();
        cliente.setnombre(dto.getnombre());
        cliente.setapellido(dto.getapellido());
        cliente.setdni(dto.getdni());
        cliente.setfechadenacimiento(dto.getfechadenacimiento());
        cliente.setdireccion(dto.getdireccion());
        cliente.setlocalidad(dto.getlocalidad());
        cliente.setprovincia(dto.getprovincia());
        cliente.settelefono(dto.gettelefono());
        cliente.setemail(dto.getemail());
        cliente.setn_Cuenta(dto.getn_cuenta());
        
       
        return cliente;
    }

    public ClienteDTO ClienteEntityDTO2Entity(ClienteEntity entidad){
    
        ClienteDTO dto = new ClienteDTO();
        dto.setId_cliente(entidad.getid());
        dto.setnombre(entidad.getnombre());
        dto.setapellido(entidad.getapellido());
        dto.setdni(entidad.getdni());
        dto.setfechadenacimiento(entidad.getfechadenacimiento);
        dto.setlocalidad(entidad.getlocalidad());
        dto.setemail(entidad.getemail());
        dto.setprovincia(entidad.getprovincia());
        dto.settelefono(entidad.gettelefono());
        dto.setemail(entidad.getemail());
        dto.setn_cuenta(entidad.getn_Cuenta());
        
        
        return dto;
    
    }
    
    public List <ClienteDTO> ClienteEntityList2DTOList (List<ClienteEntity> entities){
    
        List<ClienteDTO> dtos = new ArrayList<>();
        for (ClienteEntity cliente: entities){
            dtos.add(this.ClienteDTO2Entity(cliente));
        }
        return dtos;
    }*/
}

