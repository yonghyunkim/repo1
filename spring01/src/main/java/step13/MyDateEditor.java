package step13;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateEditor extends PropertyEditorSupport {
/*
 * Spring을 특정 객체로 변환시키는 클래스를 프로퍼티 에디터라 부른다.
 */
  SimpleDateFormat dateFoarmat = new SimpleDateFormat("yyyy-MM-dd");
 @Override
public void setAsText(String text) throws IllegalArgumentException {
   //이 메서드는 문자열을 입력 받았을때 변환하기 위해 스프링 IOc 컨테이너가 호출할 것이다.
   try{
   Date dateValue = dateFoarmat.parse(text);
   this.setValue(dateValue);
   }catch(Exception e){
     throw new IllegalArgumentException(e);
   }
}

}
