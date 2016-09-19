package step06;
//       설정파일을 통해 객체 준비
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//<bean class = "패키지명을 포함한 클래스명"></bean>
//
public class Test10 {
  public static void main(String[] args) {
    // Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step06/application-context05.xml");
    //객체 이름 알아내기
    //name 속성만 있으면 그값을 이름으로 사용한다.
    //첫번째 이름은 객체의 이름으로 사용하고,
    //나머지 이름은 별명으로 사용한다.
    System.out.println("---------------------------");
    String[] names = iocContainer.getBeanDefinitionNames();
    for(String name : names)
      System.out.println(name);
    
    //나머지는 별명이 생성된다.
    System.out.println("---------------------------");
    String[] aliases = iocContainer.getAliases("b2");
    for(String aliase : aliases)
      System.out.println(aliase);
   
    //중요!
    //별명이든 이름이든 객체를 찾을 때는 같다.
    Book r1 = (Book)iocContainer.getBean("bx");
    Book r2 = (Book)iocContainer.getBean("by");
    Book r3 = (Book)iocContainer.getBean("bz");
    Book r4 = (Book)iocContainer.getBean("b1");
    
    if(r1 == r2 && r1==r3 && r1 ==r4)
      System.out.println("같다");
    
  }
}
