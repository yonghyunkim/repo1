/* 주제: @Component 애노테이션
 * 이 애노테이션이 붙은 클래스에 대해 자동으로 객체를 생성한다.
 * 단 이 애노테이션을 처리할 스프링 플러그인(객체) 장착(생성)한다.
 * <context:component-scan base-package=""/> 
 * 개발자는 객체를 생성하기 위해 스프링 설정 파일에 
 * <bean>태그를 선언할 필요는 없다.
 */
package step14.ex06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step14/ex05/application-context01.xml");

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
