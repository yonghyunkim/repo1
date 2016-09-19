package step06;
//       설정파일을 통해 객체 준비
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//<bean class = "패키지명을 포함한 클래스명"></bean>
//
public class Test09 {
  public static void main(String[] args) {
    // Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step06/application-context04.xml");
    //객체 이름 알아내기
    //name 속성만 있으면 그값을 이름으로 사용한다.
    
    System.out.println("---------------------------");
    String[] names = iocContainer.getBeanDefinitionNames();
    for(String name : names)
      System.out.println(name);
    
    //이름이 한 개일때, 별명은 자동으로 설정되지않는다.
    System.out.println("---------------------------");
    String[] aliases = iocContainer.getAliases("b1");
    for(String aliase : aliases)
      System.out.println(aliase);
   
    
  }
}
