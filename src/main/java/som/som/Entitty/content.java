package som.som.Entitty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@NoArgsConstructor
@Getter
@ToString
@Entity
public class content {
    @Id
    private int id;
    private String text;
    private boolean anonymity;
    private Date dateCreate;
    private Date dateUpdate;
    private int viewCount;
    private String userId;
    private int factoryId;
}
