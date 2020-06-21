package by.chyzh.informationAndReferenceSystem.repository;


import by.chyzh.informationAndReferenceSystem.entity.Holiday;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HolidayRepository extends PagingAndSortingRepository<Holiday, Long> {


}
