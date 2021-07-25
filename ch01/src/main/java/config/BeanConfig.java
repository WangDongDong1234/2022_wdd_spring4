package config;

import entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-07-25 23:44
 * @description
 **/
@Configuration
public class BeanConfig {

	@Bean(name = "wangdongdong2")
	public Student getStudent(){
		List<String> dream = new ArrayList<String>();
		dream.add("睡觉");
		dream.add("吃饭");
		Map<String, Integer> score = new HashMap<String, Integer>();
		score.put("math",90);
		score.put("english",100);

		return new Student(2,"wangdongdong2",dream,score,false);
	}
}
