/* 주제: 스프링 애노테이션 다루기 - @Autowired와 그 처리기
 * AutowiredAnnotationBeanPostProcessor클래스는 @Autowired 애노테이션을 처리해주는 클래스이다.
 * 즉, @Autowired애노테이션을 처리하고 싶다면, 이클래스의 객체를 생성해야한다.
 */
package step14.ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step14/ex03/application-context01.xml");

    System.out.println(iocContainer.getBean("book"));
    System.out.println("-------------------------------------------");
    String[] names = iocContainer.getBeanDefinitionNames();
    for(String name : names){
      System.out.println(iocContainer.getBean(name).getClass().getName());
    }
  }

}
