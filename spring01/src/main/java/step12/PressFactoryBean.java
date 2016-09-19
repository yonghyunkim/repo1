package step12;
//객체가 만들어지는거는 Press이다.
import org.springframework.beans.factory.FactoryBean;
//스프링에서 제공하는 FactoryBean인터페이스를 구현할 때는 
//다른 개발자가 알아채기 쉽도록 클래스 이름 뒤에 "FactoryBean"을 붙인다.
public class PressFactoryBean implements FactoryBean<Press>{  //뭐만드는공장인데
String name;
String tel;



//값을 받기만 할것이므로 setter메서드만 만든다.
public void setName(String name) {
  this.name = name;
}

public void setTel(String tel) {
  this.tel = tel;
}

@Override
public Press getObject() throws Exception {
  Press p = new Press(name,tel);
  return p;
}

@Override
public Class<?> getObjectType() {
  // TODO Auto-generated method stub
  return Press.class;
}

@Override
public boolean isSingleton() {
  // TODO Auto-generated method stub
  return true;
}

 
}
