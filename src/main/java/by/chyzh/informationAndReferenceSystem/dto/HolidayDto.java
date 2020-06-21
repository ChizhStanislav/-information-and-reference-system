package by.chyzh.informationAndReferenceSystem.dto;

import by.chyzh.informationAndReferenceSystem.entity.Holiday;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class HolidayDto {

    private Long id;
    private String fullName;
    private String position;
    private String birthDay;


    public HolidayDto() {

    }

    public HolidayDto(Holiday holiday) {
        if (holiday == null) {
            return;
        }
        this.id = holiday.getId();
        this.fullName = holiday.getFullName();
        this.position = holiday.getPosition();
        this.birthDay = holiday.getBirthDay();
    }
}
