package step14.ex01;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;


public class Book {
  String title;
  String[] authors;
  int pages;
  boolean local;
  Date releaseDate;
  Press press;
  
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String[] getAuthors() {
    return authors;
  }
  public void setAuthors(String[] authors) {
    this.authors = authors;
  }
  public int getPages() {
    return pages;
  }
  public void setPages(int pages) {
    this.pages = pages;
  }
  public boolean isLocal() {
    return local;
  }
  public void setLocal(boolean local) {
    this.local = local;
  }
  public Date getReleaseDate() {
    return releaseDate;
  }
  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }
  public Press getPress() {
    return press;
  }
  @Autowired //이 프로퍼티의 타입과 일치하는 객체가 있다면 셋터를 호출하여 자동으로 꼽아라
  public void setPress(Press press) {
    this.press = press;
  }
  
  @Override
  public String toString() {
    return "Book [title=" + title + ", authors=" + Arrays.toString(authors) + ", pages=" + pages + ", local=" + local
        + ", releaseDate=" + releaseDate + ", press=" + press + "]";
  }
  


  
}
