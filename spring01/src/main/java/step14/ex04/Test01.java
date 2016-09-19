/* 주제: @Autowired와  requierd속성
 * @Autowired로 주입해야 할 의존 객체를 지정하면, 
 * 이 의존 객체 주입은 기본으로 필수 항목이 된다.
 * 만약 주입할 의존 객체가 없으면 실행 예외가 발생한다.
 * 해결책?
 * required 속성의 값을 flase로 설정하라
 */
package step14.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step14/ex04/application-context01.xml");

    System.out.println(iocContainer.getBean("book"));
    System.out.println("-------------------------------------------");
    String[] names = iocContainer.getBeanDefinitionNames();
    for(String name : names){
      System.out.println(iocContainer.getBean(name).getClass().getName());
    }
  }

}
