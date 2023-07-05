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
public class license {
    @Id
    private int id;
    private boolean reprint;
    private boolean commision;
    private boolean grouporder;
    private boolean personal;
    private boolean credit;
}
