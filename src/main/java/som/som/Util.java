package som.som;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import java.util.HashMap;

public class Util {

    // metadata 추출 from url
    public static HashMap<String, String> getMetadataFromUrl(String url) {
        Document document;
        HashMap<String, String> metadata = new HashMap<String, String>();
        try {
            document = Jsoup.connect(url).get();
            metadata.put("title", document.select("meta[property=og:title]").get(0).attr("content"));
            metadata.put("description", document.select("meta[name=description]").get(0).attr("content"));
            metadata.put("image", document.select("meta[property=og:image]").get(0).attr("content"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return metadata;
    }
}
