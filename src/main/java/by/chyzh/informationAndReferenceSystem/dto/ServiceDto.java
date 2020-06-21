package by.chyzh.informationAndReferenceSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.awt.image.BufferedImage;


@Builder
@AllArgsConstructor
@Getter
@Setter
public class ServiceDto {

    private Long id;
    private String text;
    private String link;
    private BufferedImage image;
    private String typ;


//    public ServiceDto() {
//
//    }
//
//    public ServiceDto(Service service) {
//        if (service == null) {
//            return;
//        }
//        this.id = service.getId();
//        this.text = service.getText();
//        this.link = service.getLink();
////        this.image = service.getImage();
//        this.typ = service.getTyp().toString();
//    }
}
