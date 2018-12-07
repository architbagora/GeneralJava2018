package archit;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Main {
	public static void main(String[] args) {
		XmlMapper xmlMapper =new XmlMapper();
		UrlSet urlSetEndecca = xmlMapper.readValue(
			        StringUtils.toEncodedString(Files.readAllBytes(Paths.get(
			            "/Users/abagora/SITE_MAP_GENERATOR/CODEBASE/search-data-load/sitemap-job/src/test/resources/EndecaSiteMap-Appliances.xml")),
			            StandardCharsets.UTF_8),
			        UrlSet.class);


			    UrlSet urlSetSolr = xmlMapper.readValue(
			        StringUtils.toEncodedString(Files.readAllBytes(Paths.get(
			            "/Users/abagora/SITE_MAP_GENERATOR/CODEBASE/search-data-load/sitemap-job/src/test/resources/category"
			                + "-appliances.xml")),
			            StandardCharsets.UTF_8),
			        UrlSet.class);

			    for (Url endeccaUrl : urlSetEndecca.getUrl()){
			      String endecaLocField = endeccaUrl.getLoc();
			      boolean found = false;
			      for(Url solrUrl:urlSetSolr.getUrl()){
			        if(StringUtils.equals( endecaLocField ,solrUrl.getLoc())){
			          found = true;
			        }
			      }
			      if(!found){
			        System.out.println("NOT FOUND "+endeccaUrl);
			      }
			    }
		
		
	}
}
