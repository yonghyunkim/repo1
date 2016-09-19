package step09;
//       객체 주입하기
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//<bean class = "패키지명을 포함한 클래스명"></bean>
//
public class Test01 {
  public static void main(String[] args) {
    // Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step09/application-context01.xml");
    
    Book b1 = (Book)iocContainer.getBean("b1");
    Book b2 = (Book)iocContainer.getBean("b2");
    Book b3 = (Book)iocContainer.getBean("b3");
    
    
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    
    if(b1.getPress() ==b2.getPress() && b1.getPress() ==b3.getPress())
      System.out.println("b1,b2,b3모두 같은 Press객체를 주입한다.");
    
   
  }
}
