package som.som.Entity;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
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
    @NotNull
    @Column
    private Integer id;

    @Column(name = "factory_id")
    @NotNull
    private Integer factoryId;

    @Column(name = "size_id")
    @NotNull
    private Integer sizeId;
}
