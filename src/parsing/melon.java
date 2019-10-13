package parsing;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class melon {

	public static void main(String[] args) throws IOException { 
		
		String url = "https://www.melon.com/chart/day/index.htm";
		Document doc = Jsoup.connect(url).get();
		//Elements tags = doc.select("div.wrap_tabmenu_sub>dl>dd>ul>li");
		Elements songs = doc.select("div.service_list_song>table>tbody>tr");
						
		for(Element tag : songs) {
			
			System.out.print(tag.attr("data-song-no") + " / " + tag.select("span.rank").text() + "À§ : " + 
						tag.select("div.wrap_song_info>div.rank01>span>a").text() + " / " + tag.select("div.wrap_song_info>div.rank02>span>a").text() + "\n");
						
			
		}
		
	}

}