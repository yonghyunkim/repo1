package step01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test03 {
  public static void main(String[] args) {
    //에노테이션을 이용하여 객체 관리
    //객체를 생성할때 애노테이션 정보를 이용한다.
    //1) 직접 생성할 객체의 타입을 등록하는 방법.
    //2) 외부 설정 정보를 다루는 객체를 이용하는 방법
    ApplicationContext iocContainer = new AnnotationConfigApplicationContext();
  }
}
