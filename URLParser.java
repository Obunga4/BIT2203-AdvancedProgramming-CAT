import java.net.URL;

public class URLParser {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://api.techstore.com:8443/products/category/electronics?sort=price&limit=20#reviews");

        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Path: " + url.getPath());

        System.out.println("Query parameters:");
        String query = url.getQuery();
        for (String parameter : query.split("&")) {
            String[] parts = parameter.split("=", 2);
            System.out.println(parts[0] + " = " + parts[1]);
        }

        System.out.println("Fragment: " + url.getRef());
    }
}