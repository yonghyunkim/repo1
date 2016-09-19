package step02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//스프링 IoC 컨테이너를 위한 설정 정보를 갖고 있는 객체
//=> 애노테이션으로 설정정보를 지정한다.
@Configuration
public class AppConfig {
  
  @Bean //이 메서드는 자바 객체를 리턴하는 메서드임을 선언한다. application-context가호출한다.
  Book createBook() {
    System.out.println("createBook()");
    Book b = new Book();
    b.setTitle("자바프로그래밍");
    b.setAuthor("홍길동");
    return b;
  }
  //팩토리메서드
  @Bean //이 메서드는 자바 객체를 리턴하는 메서드임을 선언한다.  
  Press generatePress() {
    System.out.println("generatePress()");
    Press p = new Press();
    p.setName("비트출판사");
    p.setTel("1111-1111");
    return p;
  }
  
}
