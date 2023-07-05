package som.som.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
@Entity
@Table(name="factory_size")
public class factorySize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name = "factory_id")
    private Integer factoryId;

    @Column(name = "size_id")
    private Integer sizeId;
}
