package step10;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Book3 {
  String title;
  Map<String,Author> authorMap;
  int pages;
  boolean local;
  Date releseDate;
  Press press;

  public Book3() {
    System.out.println("Book3()");
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Map<String, Author> getAuthorMap() {
    return authorMap;
  }

  public void setAuthorMap(Map<String, Author> authorMap) {
    this.authorMap = authorMap;
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

  public Date getReleseDate() {
    return releseDate;
  }

  public void setReleseDate(Date releseDate) {
    this.releseDate = releseDate;
  }

  public Press getPress() {
    return press;
  }

  public void setPress(Press press) {
    this.press = press;
  }

  @Override
  public String toString() {
    return "Book3 [title=" + title + ", authorMap=" + authorMap + ", pages=" + pages + ", local=" + local
        + ", releseDate=" + releseDate + ", press=" + press + "]";
  }

  
  

}
