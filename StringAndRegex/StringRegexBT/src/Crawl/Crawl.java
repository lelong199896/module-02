package Crawl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawl {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String title = scanner.next();
            scanner.close();
            Pattern pattern = Pattern.compile("<h3 class=\"article-title\"><a href=\"(.*?)\">(.*?)</a></h3>");
            Matcher matcher = pattern.matcher(title);
            while (matcher.find()) {
                System.out.println(matcher.group(2));
//                System.out.println(matcher.group(1));
                System.out.println("===================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
