package entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-07-25 21:38
 * @description
 **/
@Getter
@Setter
@ToString
public class Student {
	private Integer id;
	private String name;
	private List<String> dream;
	private Map<String, Integer> score;
	private boolean graduation;

	public Student(Integer id, String name, List<String> dream, Map<String, Integer> score, boolean graduation) {
		this.id = id;
		this.name = name;
		this.dream = dream;
		this.score = score;
		this.graduation = graduation;
	}

	public void doHomeWork(){
		System.out.println(this.name+"正在做作业"+this);
	}
}
