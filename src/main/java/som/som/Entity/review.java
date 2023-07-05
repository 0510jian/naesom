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
public class review {
    @Id
    private int id;
    private String title;
    private int periodRate;
    private int qualityRate;
    private int communicationRate;
    private int likeCount;
    private int contentId;
}
