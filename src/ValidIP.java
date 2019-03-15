import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidIP {
    public List<String> checkIp(List<String> ips){
        List<String> result = new ArrayList<>();
        Pattern ipv4 = Pattern.compile("^(([01]?\\d?\\d|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d?\\d|2[0-4]\\d|25[0-5])$");
        Pattern  ipv6 = Pattern.compile("^([\\da-f]{1,4}:){7}[\\da-f]{1,4}$");
        for(String ip: ips){
            Matcher matcher4 = ipv4.matcher(ip);
            Matcher matcher6 = ipv6.matcher(ip);
            if(matcher4.find()){
                result.add("IPv4");
            }
            else if(matcher6.find()){
                result.add("IPv6");
            }
            else{
                result.add("Neither");
            }
        }
        return result;
    }
}
