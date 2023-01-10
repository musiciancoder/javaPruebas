package mylombok;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor //crea un constructor con cada uno de las variables de campo de clase
@Data //reune @Setter @Getter @EqualsAndHashcode y @ToString en una sola anotación
public class Cat {

    private String name;
    private float weight;
    private int age;
}
