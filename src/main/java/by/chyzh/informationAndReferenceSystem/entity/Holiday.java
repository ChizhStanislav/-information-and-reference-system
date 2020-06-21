package by.chyzh.informationAndReferenceSystem.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Builder
@Setter
@Getter
@ToString(exclude = "")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "holiday", schema = "public")
public class Holiday extends BaseEntity<Long> {

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "position")
    private String position;

    @Column(name = "birth_day", nullable = false)
    private String birthDay;

}
