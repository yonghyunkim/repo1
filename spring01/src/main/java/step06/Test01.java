package step06;
//       설정파일을 통해 객체 준비
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//<bean class = "패키지명을 포함한 클래스명"></bean>
//
public class Test01 {
  public static void main(String[] args) {
    // Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step06/application-context01.xml");
    System.out.printf("객체 개수 : %d\n", iocContainer.getBeanDefinitionCount());
   String[] names = iocContainer.getBeanDefinitionNames();
   for(String name : names)
     System.out.println(name);
    
   //객체 이름?
   // => 전체클래스명#인덱스
   //
   //Fully-Qualified Class Name(FQName = QName)
   //=>패키지 이름을 포함한 전체 클래스명.
   
  }
}
