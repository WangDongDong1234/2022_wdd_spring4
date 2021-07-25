import config.BeanConfig;
import entity.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-07-25 23:48
 * @description
 **/
public class Main01_2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(
						BeanConfig.class);
		Student student = context.getBean(Student.class);
		student.doHomeWork();
		context.close();
	}
}
