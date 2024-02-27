package proyecto.vaigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import proyecto.vaigo.model.entity.ItinerarioExcursionesEntity;

import java.util.List;

public interface ItinerarioExcursionRepository extends JpaRepository<    ItinerarioExcursionesEntity, Integer>{
    @Query(value = "SELECT ie.*\n" +
            "FROM itinerario_excursiones ie\n" +
            "JOIN excursion e ON ie.id_excursion = e.id\n" +
            "WHERE e.id_ciudad = :idc",
            nativeQuery = true)
    public List<ItinerarioExcursionesEntity> todosItiEx(@Param("idc") String ciudad);
    @Query(value = "SELECT *\n" + "FROM itinerario_excursiones\n" + "WHERE Id_itinerario = :idc2", nativeQuery = true)
    public List<ItinerarioExcursionesEntity> TodosItiId(@Param("idc2") String ciudad);
}
