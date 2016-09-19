package step05;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//스프링 IoC 컨테이너를 위한 설정 정보를 갖고 있는 객체
//=> 애노테이션으로 설정정보를 지정한다.
@Configuration
// 객체 생성이 복잡하지 않은 경우는 이렇게 @Component 애노테이션이 붙은
// 클래스를 찾아서 객체를 생성하면 된다.
@ComponentScan("step05")
public class AppConfig {
  // 그런데 SqlSessionFactory 처럼 객체 생성과정이 복잡한 경우에는
  @Bean
  SqlSessionFactory createSqlSessionFactory() throws Exception {
    return new SqlSessionFactoryBuilder()
        .build(org.apache.ibatis.io.Resources.getResourceAsStream("step05/mybatis-config.xml"));
  }

}
