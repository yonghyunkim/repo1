package step05;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {
  public static void main(String[] args) {
    //에노테이션을 이용하여 객체 준비하기
    AnnotationConfigApplicationContext iocContainer 
    = new AnnotationConfigApplicationContext(AppConfig.class); 
    
    System.out.println(iocContainer.getBean(Book.class));
    System.out.println(iocContainer.getBean(Press.class));
    System.out.println(iocContainer.getBean(SqlSessionFactory.class));
 
  }
}
