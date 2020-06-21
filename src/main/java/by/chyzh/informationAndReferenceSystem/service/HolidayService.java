package by.chyzh.informationAndReferenceSystem.service;

import by.chyzh.informationAndReferenceSystem.dto.HolidayDto;
import by.chyzh.informationAndReferenceSystem.entity.Holiday;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface HolidayService {

    Holiday save(HolidayDto holidayDto);

    void update(HolidayDto holidayDto);

    void delete(Long id);

    Holiday findById(Long id);

    Page<Holiday> findAll(int page, int size);
}
