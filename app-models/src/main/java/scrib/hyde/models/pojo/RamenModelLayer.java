package scrib.hyde.models.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RamenModelLayer {
    String review;
    String brand;
    String variety;
    String style;
    String country;
    String stars;
    Double starsDoubleVal;
    String topTen;
}
