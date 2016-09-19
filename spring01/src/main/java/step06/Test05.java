package step06;
//       설정파일을 통해 객체 준비
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//<bean class = "패키지명을 포함한 클래스명"></bean>
//
public class Test05 {
  public static void main(String[] args) {
    // Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step06/application-context02.xml");
    
//    //객체이름으로 객체꺼내기 객체(Bean)
//    System.out.println(iocContainer.getBean("step06.Book#0"));
//    System.out.println(iocContainer.getBean("step06.Press#0"));
    
    //특정객체의 별명을 알아내기
    String[] names = iocContainer.getBeanDefinitionNames();
    for(String name: names)
      System.out.println(name);
    
    System.out.println("------------------------");
    
   
  }
}
