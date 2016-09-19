package step02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test05 {
  public static void main(String[] args) {
    //에노테이션을 이용하여 객체 준비하기
    AnnotationConfigApplicationContext iocContainer 
    = new AnnotationConfigApplicationContext(AppConfig2.class); 
  //AppConfig 클래스는 설정 정보를 애노테이션의 값으로 가지고있다.
    
    Book b = (Book)iocContainer.getBean(Book.class);  //Book 객체를 만들어주세요
    Press p = (Press)iocContainer.getBean(Press.class);
    
    System.out.println(b);
    System.out.println(p);
  }
}
