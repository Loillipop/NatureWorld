package main.java.config;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import main.java.model.props.AnimalType;
import java.util.Map;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AnimalTemplate {
    Map<AnimalType,LivenesTemplate>  animalsTemplate;
}
