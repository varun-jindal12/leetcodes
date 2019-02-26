import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class JavaUrl {
    public String[] getDataFromURL(String url) throws IOException{
        URL myUrl = new URL(url);
        String []data = null;
        // Get the input stream through URL Connection
        URLConnection con = myUrl.openConnection();
        InputStream is =con.getInputStream();
        BufferedReader br = new BufferedReader( new InputStreamReader(is));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    return data;
    }
}
