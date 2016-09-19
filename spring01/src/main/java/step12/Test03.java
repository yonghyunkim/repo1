package step12;
//   Spring IoC 컨테이너는 기본으로 한개만생성한다.
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//<bean class = "패키지명을 포함한 클래스명"></bean>
//
public class Test03 {
  public static void main(String[] args) {
    // Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step12/application-context03.xml");
    System.out.println(iocContainer.getBean("p1").getClass().getName());
    System.out.println(iocContainer.getBean("p1"));
  }
}
