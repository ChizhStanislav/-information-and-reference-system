package by.chyzh.informationAndReferenceSystem.entity;


import by.chyzh.informationAndReferenceSystem.dictonary.ServiceTyp;
import lombok.*;

import javax.persistence.*;

@Builder
@Setter
@Getter
@ToString(exclude = "")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "service", schema = "public")
public class Service extends BaseEntity<Long> {

    @Column(name = "text", nullable = false, unique = true)
    private String text;

    @Column(name = "link", nullable = false, unique = true)
    private String link;

    @Column(name = "image")
    private String image;

    @Enumerated(EnumType.STRING)
    private ServiceTyp typ;

}
