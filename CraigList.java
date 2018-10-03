
/**
 * Scrapes Yahoo Finance
 *
 * @author Elizabeth Rosso
 * @version 1.0
 */
//package YahooStockReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class CraigsList {

    	public static void main(String[] args) throws MalformedURLException, IOException, IllegalArgumentException
	{
		String searchQuery = "Iphone 6s" ;

		WebClient client = new WebClient();  
		client.getOptions().setCssEnabled(false);  
		client.getOptions().setJavaScriptEnabled(false);  
		try {  
  			String searchUrl = "https://newyork.craigslist.org/search/sss?sort=rel&query=" + URLEncoder.encode(searchQuery, "UTF-8");
  			HtmlPage page = client.getPage(searchUrl);
		} catch(Exception e) {
  			e.printStackTrace();
		}
	}
   
}
