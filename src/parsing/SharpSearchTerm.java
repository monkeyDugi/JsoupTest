package parsing;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SharpSearchTerm {

	public static void main(String[] args) throws IOException {
		
		String url = "https://search.naver.com/search.naver?where=nexearch&query=%EC%9D%B4%EC%8A%B9%EC%B2%A0&sm=top_lve&ie=utf8";
		Document doc = Jsoup.connect(url).get();
			
		Elements trs = doc.select("ol._rolling_chart>li>.rank_roll>._next>.bx_item>._link");		
		
		System.out.println("네이버 실시간 검색어 순위\n");
		
		for(Element td : trs) {
			
			System.out.println(td.text());
		}
	}
}
