package by.chyzh.informationAndReferenceSystem.controller;

import by.chyzh.informationAndReferenceSystem.dto.HolidayDto;
import by.chyzh.informationAndReferenceSystem.entity.Holiday;
import by.chyzh.informationAndReferenceSystem.service.HolidayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/holiday")
@RequiredArgsConstructor
public class HolidayRestController {

    private final HolidayService holidayService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Holiday> getHolidays() {
        return holidayService.findAll(6,2).getContent();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public HolidayDto getHoliday(@PathVariable("id") Long id) {
        Holiday holiday = holidayService.findById(id);
        return new HolidayDto(holiday);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public HolidayDto saveHoliday(@RequestBody HolidayDto holidayDto) {
        return  null;
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateHoliday(@RequestBody HolidayDto holidayDto) {

    }

    @DeleteMapping(value = "/{id}")
    public void deleteHoliday(@PathVariable("id") Long id) {
        holidayService.delete(id);
    }
}
