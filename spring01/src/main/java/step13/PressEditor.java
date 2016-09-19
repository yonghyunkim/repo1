package step13;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PressEditor extends PropertyEditorSupport {

  @Override
  public void setAsText(String text) throws IllegalArgumentException {
    // 이 메서드는 문자열을 입력 받았을때 변환하기 위해 스프링 IOc 컨테이너가 호출할 것이다.
    try {
      String[] values = text.split(",");
      Press p = new Press();
      p.setName(values[0]);
      p.setTel(values[1]);
      this.setValue(p);
    } catch (Exception e) {
      throw new IllegalArgumentException(e);
    }
  }

}
