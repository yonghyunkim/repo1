package step06;
//       설정파일을 통해 객체 준비
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//<bean class = "패키지명을 포함한 클래스명"></bean>
//
public class Test12 {
  public static void main(String[] args) {
    // Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step06/application-context07.xml");
    //객체 이름 알아내기
    //id에 지정한것은 이름이 되고,
    //name에 지정한 이름들은 별명이 된다.
    System.out.println("---------------------------");
    String[] names = iocContainer.getBeanDefinitionNames();
    for(String name : names)
      System.out.println(name);
    
    //나머지는 별명이 생성된다.
    System.out.println("---------------------------");
    String[] aliases = iocContainer.getAliases("bx");
    for(String aliase : aliases)
      System.out.println(aliase);
  
    
  }
}
