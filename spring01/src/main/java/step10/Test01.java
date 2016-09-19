package step10;
//       객체 주입하기
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//<bean class = "패키지명을 포함한 클래스명"></bean>
//
public class Test01 {
  public static void main(String[] args) {
    // Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step10/application-context01.xml");
    
    Book b1 = (Book)iocContainer.getBean("b1");
    System.out.println(b1);
    System.out.println(iocContainer.getBean("b2"));
    
   
  }
}
