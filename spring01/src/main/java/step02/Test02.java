package step02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test02 {
  public static void main(String[] args) {
    
    //설정 파일을 경로를 지정할 때 파일 시스템 경로를 지정해야 한다.
    //파일 시스템 경로?
    // 절대경로 예)c:\test\okok\aaa.xml
    //    상대경로 예)aaa.xml
    //이클립스에서 자바 어플리케이션을 실행할 경우 상대 경로의 기준은
    //프로젝트 디렉토리이다.
    ApplicationContext iocContainer = new FileSystemXmlApplicationContext(
        "src/main/java/step02/application-context.xml");
    
    Book b = (Book)iocContainer.getBean("b1");
    Press p = (Press)iocContainer.getBean(Press.class);
    
    System.out.println(b);
    System.out.println(p);
    
  }
}
