package templates;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import model.props.AnimalType;
import java.util.Map;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AnimalTemplate {
    Map<AnimalType,LivenesTemplate>  animalsTemplate;
}
