package som.som.Entity;

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
public class event {
    @Id
    private int id;
    private String title;
    private int contentId;
    private Date dateStart;
    private Date dateEnd;
}
