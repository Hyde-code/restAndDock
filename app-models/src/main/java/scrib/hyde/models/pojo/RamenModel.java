package scrib.hyde.models.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RamenModel {
    String review;
    String brand;
    String variety;
    String style;
    String country;
    Double stars;
    String topTen;
}
