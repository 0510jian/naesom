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
public class comment {
    @Id
    private int id;

    private String userId;
    private int reviewId;
    private String text;
    private Date dateCreate;
    private Date dateUpdate;
}
