package step08;
//       설정파일을 통해 객체 준비
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//<bean class = "패키지명을 포함한 클래스명"></bean>
//
public class Test02 {
  public static void main(String[] args) {
    // Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step08/application-context02.xml");
//    System.out.println(iocContainer.getBean("b1"));
   //객체 이름?
   // => 전체클래스명#인덱스
   //
   //Fully-Qualified Class Name(FQName = QName)
   //=>패키지 이름을 포함한 전체 클래스명.
   
    
  }
}
