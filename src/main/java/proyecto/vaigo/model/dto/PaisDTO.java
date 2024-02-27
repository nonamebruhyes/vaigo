package proyecto.vaigo.model.dto;

import lombok.Data;
import proyecto.vaigo.model.entity.PaisEntity;

import java.io.Serializable;

@Data
public class PaisDTO implements Serializable {
    private int id;
    private String pais;

    public static PaisEntity ConvertToEntity(PaisDTO dto) {
        PaisEntity entity = new PaisEntity();
        entity.setId(dto.getId());
        entity.setPais(dto.getPais());
        return entity;
    }
    public static PaisDTO ConvertToDTO(PaisEntity entity) {
        PaisDTO dto = new PaisDTO();
        dto.setId(entity.getId());
        dto.setPais(entity.getPais());
        return dto;
    }
}