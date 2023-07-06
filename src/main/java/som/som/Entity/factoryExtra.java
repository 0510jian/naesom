package som.som.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@ToString
@NoArgsConstructor
@Getter
@Table(name = "factory_extra")
public class factoryExtra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(name = "factory_id")
    private int factoryId;

    @Column(name = "extra_id")
    private int extraId;

    @Column
    private int amount;

    @Transient
    private String option; // extra

    public void setOption(String option) {
        this.option = option;
    }
}
