/* 주제: @Autowired와 의존 객체 중복
 * => @Autowired로 선언된 프로퍼티에 주입할 객체가
 * 여러개 있을 경우, 어떤 객체를 주입할지 결정할 수 없기 때문에
 * 오류 발생!
 * @Qualifier 애노테이션을 사용하여 어떤 객체를 주입할 지 지정하라!
 * 예) @Qualifier
 */
package step14.ex07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step14/ex07/application-context01.xml");

    System.out.println(iocContainer.getBean(Book.class));
    
    
//    System.out.println(iocContainer.getBean("press1"));
//    System.out.println(iocContainer.getBean("press2"));
    System.out.println("-------------------------------------------");
    String[] names = iocContainer.getBeanDefinitionNames();
    for(String name : names){
      System.out.println(iocContainer.getBean(name).getClass().getName());
    }
  }

}
