package step02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test03 {
  public static void main(String[] args) {
    //에노테이션을 이용하여 객체 준비하기
    AnnotationConfigApplicationContext iocContainer = new AnnotationConfigApplicationContext();
    iocContainer.register(Book.class,Press.class); //생성할 객체의 타입등록하기
    iocContainer.refresh();//등록된 타입의 객체를 생성하기
    
    //컨테이너에서 객체를 꺼낼 때 이름 또는 타입을 지정할 수 있다.
    //다음은 타입을 지정한 예이다ㅏ.
    Book b = (Book)iocContainer.getBean(Book.class);  //Book 객체를 만들어주세요
    Press p = (Press)iocContainer.getBean(Press.class);
    
    System.out.println(b);
    System.out.println(p);
  }
}
