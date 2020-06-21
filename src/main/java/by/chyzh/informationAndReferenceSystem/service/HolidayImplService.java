package by.chyzh.informationAndReferenceSystem.service;

import by.chyzh.informationAndReferenceSystem.dto.HolidayDto;
import by.chyzh.informationAndReferenceSystem.entity.Holiday;
import by.chyzh.informationAndReferenceSystem.exception.NotFound;
import by.chyzh.informationAndReferenceSystem.repository.HolidayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class HolidayImplService implements HolidayService {

    private final HolidayRepository holidayRepository;

    @Override
    @Transactional
    public Holiday save(HolidayDto holidayDto) {
        return null;
    }

    @Override
    @Transactional
    public void update(HolidayDto holidayDto) {

    }

    @Override
    @Transactional
    public void delete(Long id) {
        holidayRepository.deleteById(id);
    }

    @Override
    public Holiday findById(Long id) {
        return holidayRepository.findById(id).orElseThrow(() -> new NotFound("Holiday with id=" + id + " not found"));
    }

    @Override
    public Page<Holiday> findAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return holidayRepository.findAll(pageable);
    }
}
