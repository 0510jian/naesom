package som.som.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class factoryDTO {
    private int id;
    private String name;
    private String koName;
    private String weibo;
    private String wechat;
    private boolean koCsr;
    private int startPrice;
    private int copyPrice;
    private int fasterPrice;
    private int etcPrice;
    private String url;
    private boolean certification;
}
