package main.java.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import main.java.model.props.AnimalType;
import main.java.config.LivenesTemplate;
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
