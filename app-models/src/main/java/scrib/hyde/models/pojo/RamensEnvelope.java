package scrib.hyde.models.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RamensEnvelope {
    String status;
    String _errorMessage;
    List<? extends RamenModelLayer> data;
}
