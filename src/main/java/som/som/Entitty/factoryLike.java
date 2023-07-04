package som.som.Entitty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
@Entity
public class factoryLike {
    @Id
    private int id;
    private String userId;
    private int factoryId;
}
