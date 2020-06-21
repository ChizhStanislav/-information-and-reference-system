package by.chyzh.informationAndReferenceSystem.service;

import by.chyzh.informationAndReferenceSystem.dictonary.ServiceTyp;
import by.chyzh.informationAndReferenceSystem.dto.ServiceDto;
import by.chyzh.informationAndReferenceSystem.entity.Service;
import by.chyzh.informationAndReferenceSystem.exception.NotFound;
import by.chyzh.informationAndReferenceSystem.repository.ServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.List;

@org.springframework.stereotype.Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ServiceImplService implements ServiceService {

    private final ServiceRepository serviceRepository;

    @Override
    @Transactional
    public Service save(ServiceDto serviceDto) {
        return null;
    }

    @Override
    @Transactional
    public void update(ServiceDto serviceDto) {

    }

    @Override
    @Transactional
    public void delete(Long id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public Service findById(Long id) {
        Service service = serviceRepository.findById(id).orElseThrow(() -> new NotFound(""));
        File file = new File("src\\main\\resources\\static\\services", service.getImage());
        return null;
    }

    @Override
    public List<Service> findAllByTyp(String typ) {
        return serviceRepository.findAllByTyp(ServiceTyp.valueOf(typ));
    }
}
