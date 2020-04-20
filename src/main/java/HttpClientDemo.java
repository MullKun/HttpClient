import java.net.URL;

public class HttpClientDemo {
    public static void main(String[] args) {
        HttpClient httpClient = new HttpClient();
        String expression = "/slideshow/slide/title";
        try {
            URL ulr = new URL("https://httpbin.org/xml");
            String result = httpClient.getContent(ulr);
            String xmlContent = XMLProcessor.findNodeByXPath(result, expression);
            System.out.println(xmlContent);
        } catch (Exception e) {
            System.out.println("Something goes wrong");
        }

    }
}
