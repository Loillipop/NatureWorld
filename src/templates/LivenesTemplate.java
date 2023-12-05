package templates;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LivenesTemplate {

    BigDecimal weight;
    Integer neighborhoods;
    Integer speed;
    BigDecimal saturation;
    Integer count;
}
