package som.som.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
@Entity
public class frame {
    @Id
    private int id;
    private String userId;
    private int licenseId;
    private String illustrator;
    private String url;
}
