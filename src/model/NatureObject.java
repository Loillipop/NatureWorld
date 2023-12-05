package model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import model.props.AnimalType;
import templates.LivenesTemplate;
import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public abstract class NatureObject {

    BigDecimal weight;
    public NatureObject(LivenesTemplate livenesTemplate) {
        this(LivenesTemplate.getWeight());
    }
    public abstract AnimalType getAnimalType();
}
