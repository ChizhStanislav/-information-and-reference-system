package by.chyzh.informationAndReferenceSystem.controller;

import by.chyzh.informationAndReferenceSystem.dto.ServiceDto;
import by.chyzh.informationAndReferenceSystem.entity.Service;
import by.chyzh.informationAndReferenceSystem.service.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/service")
@RequiredArgsConstructor
public class ServiceRestController {

    private final ServiceService serviceService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ServiceDto> getServices(@RequestParam("typ") String typ) {

        List<ServiceDto> collect = serviceService.findAllByTyp(typ).stream()
                .map(service -> {

                    File file = new File("src\\main\\resources\\static\\services", service.getImage());
                    BufferedImage image = null;
                    try {
                        image = ImageIO.read(file);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return ServiceDto.builder()
                        .id(service.getId())
                        .link(service.getLink())
                        .text(service.getText())
                        .image(image)
                        .build();})
                .collect(Collectors.toList());

        return collect;
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ServiceDto getService(@PathVariable("id") Long id) {
        Service service = serviceService.findById(id);
        return null;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ServiceDto saveService(@RequestBody ServiceDto serviceDto) {
        return null;
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateService(@RequestBody ServiceDto serviceDto) {

    }

    @DeleteMapping(value = "/{id}")
    public void deleteService(@PathVariable("id") Long id) {
        serviceService.delete(id);
    }
}
