import entity.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-07-25 21:42
 * @description
 **/
public class Main01_1 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext(
						"bean.xml");
		Student student = context.getBean(Student.class);
		student.doHomeWork();
		context.close();
	}
}
