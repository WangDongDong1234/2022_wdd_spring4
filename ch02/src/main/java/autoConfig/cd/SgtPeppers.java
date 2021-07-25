package autoConfig.cd;

import autoConfig.cd.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-07-26 00:02
 * @description
 **/
@Component
public class SgtPeppers implements CompactDisc {
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}
}
