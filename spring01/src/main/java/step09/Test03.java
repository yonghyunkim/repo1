package step09;
//       객체 주입하기
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//<bean class = "패키지명을 포함한 클래스명"></bean>
//
public class Test03 {
  public static void main(String[] args) {
    // Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step09/application-context03.xml");
    
    Book b1 = (Book)iocContainer.getBean("b1");
    Book b2 = (Book)iocContainer.getBean("b2");
    
    System.out.println(b1);
    System.out.println(b2);
    
    if(b1.getPress() != b2.getPress())
      System.out.println("b1의 Press와 b2의 Press가 다르다");
    
    System.out.println(b1.getPress());
    System.out.println(b2.getPress());
   
  }
}
