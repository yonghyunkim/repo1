package framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
  public static void main(String[] args) {
//    BitMotor motor = new BitMotor();
//    Car c = new Car();
//    c.setMotor(motor);
//    c.run();
    
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "framework/application-context01.xml");
    
    Car car = (Car)iocContainer.getBean("car");
    car.run();
  }
}
