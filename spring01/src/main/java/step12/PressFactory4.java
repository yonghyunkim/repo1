package step12;

import org.springframework.beans.factory.FactoryBean;

public class PressFactory4 implements FactoryBean<Press>{  //뭐만드는공장인데
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
