package by.chyzh.informationAndReferenceSystem.service;

import by.chyzh.informationAndReferenceSystem.dto.ServiceDto;
import by.chyzh.informationAndReferenceSystem.entity.Service;

import java.util.List;

@org.springframework.stereotype.Service
public interface ServiceService {


    Service save(ServiceDto serviceDto);

    void update(ServiceDto serviceDto);

    void delete(Long id);

    Service findById(Long id);

    List<Service> findAllByTyp(String typ);
}
