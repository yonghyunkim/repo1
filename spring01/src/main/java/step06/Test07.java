package step06;
//       설정파일을 통해 객체 준비
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//<bean class = "패키지명을 포함한 클래스명"></bean>
//
public class Test07 {
  public static void main(String[] args) {
    // Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step06/application-context02.xml");
    
    System.out.println(iocContainer.getBean("step06.Book#0"));
    System.out.println(iocContainer.getBean("step06.Book"));
   
    if(iocContainer.getBean("step06.Book#0")==iocContainer.getBean("step06.Book"))
      System.out.println("같은객체이다");
    
    //타입으로 찾아서 꺼내기
    // 예외 발생
    //이유? 한개를 초과할 경우 예외가 발생한다.
    System.out.println(iocContainer.getBean(Book.class));
  }
}
