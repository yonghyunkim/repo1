package step07;
//     원시타입 (primartive type)
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//<bean class = "패키지명을 포함한 클래스명"></bean>
//
public class Test03 {
  public static void main(String[] args) {
    // Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step07/application-context03.xml");
    
    //프로퍼티 값 설정 규칙
    //=> XML에 작성한 값은 String 이다.
    //=> String --> 원시타입(byte,short,int,float,long,double,boolean,char)으로 자동으로 변환된다.
    //그밖에는 변환 오류 발생!
    //해결책? String을 틀정한 타입으로 바꺼주는 변환기를 설치해야 한다.
    System.out.println(iocContainer.getBean("b1"));
   
  }
}
