
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

public class JavaScraper {

    	public static void main(String[] args) throws MalformedURLException, IOException, IllegalArgumentException
	{
			final String SYM = "KO";
			URL url = new URL("https://finance.yahoo.com/quote/SONC?p=SONC");
			
			int MAXNUMBER = 1;

			try{

				URLConnection urlConn = url.openConnection();
				InputStreamReader inStream = new InputStreamReader(urlConn.getInputStream());
				BufferedReader buff = new BufferedReader(inStream);

				String line = buff.readLine();
				int lineNumber = 0;
				while(lineNumber <= MAXNUMBER){
				//while(line != null){
					System.out.println(line);
				} 
			}catch (Exception e) {
				throw e;
			}	


			
	}   
}
