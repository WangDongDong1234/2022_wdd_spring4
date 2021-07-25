import autoConfig.CDPlayerConfig;
import autoConfig.cd.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-07-26 00:22
 * @description
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:bean.xml")
public class Main02_2 {
	@Autowired
	private CompactDisc compactDisc;

	@Test
	public void play() {
		compactDisc.play();
		System.out.println("1. @Component+xml :    Main02_2");
	}
}
