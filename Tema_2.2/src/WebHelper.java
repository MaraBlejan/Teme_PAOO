import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
public class WebHelper {
    private static WebHelper instance;
    private String content;
    private final String url="https://ace.ucv.ro/";
    private WebHelper(){}

    public static WebHelper getInstance()
    {
        if(instance==null)
        {
            instance=new WebHelper();

        }
        return instance;
    }
    public String getWebSiteContent() {
        if (content == null) {
            StringBuilder sb = new StringBuilder();
            try {
                URL site = new URL(url);
                BufferedReader in = new BufferedReader(new InputStreamReader(site.openStream()));
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    sb.append(inputLine).append("\n");
                }
                in.close();
                content = sb.toString();
            } catch (Exception e) {
                content = "Eroare la încărcarea conținutului: " + e.getMessage();
            }
        }
        return content;
    }
}
