package by.chyzh.informationAndReferenceSystem.repository;

import by.chyzh.informationAndReferenceSystem.dictonary.ServiceTyp;
import by.chyzh.informationAndReferenceSystem.entity.Service;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends CrudRepository<Service, Long> {

    List<Service> findAllByTyp(ServiceTyp typ);
}
