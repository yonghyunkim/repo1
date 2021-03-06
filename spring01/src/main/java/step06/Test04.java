package step06;
//       설정파일을 통해 객체 준비
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//<bean class = "패키지명을 포함한 클래스명"></bean>
//
public class Test04 {
  public static void main(String[] args) {
    // Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step06/application-context01.xml");
    
//    //객체이름으로 객체꺼내기 객체(Bean)
//    System.out.println(iocContainer.getBean("step06.Book#0"));
//    System.out.println(iocContainer.getBean("step06.Press#0"));
    
    //특정객체의 별명을 알아내기
    String[] aliases = iocContainer.getAliases("step06.Book#0");
    for(String aliase: aliases)
      System.out.println(aliase);
    
    System.out.println("------------------------");
    
    String[] aliases2 = iocContainer.getAliases("step06.Press#0");
    for(String aliase2: aliases2)
      System.out.println(aliase2);
//    //존재하지않는 이름의 객체를 꺼내려한다면 예외 발생
//    System.out.println(iocContainer.getBean("step06.Book2#0"));
  }
}
