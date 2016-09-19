/* 주제: @Autowired + @Qualifier = @Resource
 * @Resource 애노테이션?
 *  스프링에서 제공하는태그가 아니다.
 *  자바(JSR-250)에서 제공하는 태그이다.
 */
package step14.ex05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step14/ex06/application-context01.xml");

    System.out.println(iocContainer.getBean("book"));
//    System.out.println(iocContainer.getBean("press1"));
//    System.out.println(iocContainer.getBean("press2"));
    System.out.println("-------------------------------------------");
    String[] names = iocContainer.getBeanDefinitionNames();
    for(String name : names){
      System.out.println(iocContainer.getBean(name).getClass().getName());
    }
  }

}
