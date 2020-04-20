import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClient {

    public String getContent(URL url) {
        // https://httpbin.org/xml
        try {
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.connect();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

            final StringBuffer response = new StringBuffer();
            in.lines().forEach(line-> response.append(line));
            return response.toString();
        } catch (Exception e) {
            System.out.println("Something goes wrong when connecting to the address");
        }
        return null;
    }
}
