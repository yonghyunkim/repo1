/* 주제: 커스텀 에디터 사용법 - String ---> java.util.Date 바꾸기
 */
package step13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step13/application-context04.xml");
    
    String[] names = iocContainer.getBeanDefinitionNames();
    for(String name:names){
      System.out.println(name);
    }
      
    
    System.out.println(iocContainer.getBean("b1"));
  }

}
