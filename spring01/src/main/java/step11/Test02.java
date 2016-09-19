package step11;
//   Spring IoC 컨테이너는 기본으로 한개만생성한다.
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//<bean class = "패키지명을 포함한 클래스명"></bean>
//
public class Test02 {
  public static void main(String[] args) {
    // Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step11/application-context02.xml");
    Press r1 = (Press)iocContainer.getBean("p2");
    Press r2 = (Press)iocContainer.getBean("p2");
    Press r3 = (Press)iocContainer.getBean("p2");
    if(r1==r2 && r1==r3){
      System.out.println("같다");
    }
    
    
    Press r4 = (Press)iocContainer.getBean("p1");
    Press r5 = (Press)iocContainer.getBean("p1");
    Press r6 = (Press)iocContainer.getBean("p1");
    if(r4!=r5 && r4!=r6){
      System.out.println("같지않다");
    }
   /*
    Press r1 = (Press)iocContainer.getBean("p1");
    Press r2 = (Press)iocContainer.getBean("p1");
    Press r3 = (Press)iocContainer.getBean("p1");
    
    if(r1==r2 && r1==r3){
      System.out.println("같다");
    }
   */
    
    
  }
}
