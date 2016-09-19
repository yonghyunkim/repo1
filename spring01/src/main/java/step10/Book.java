package step10;

import java.util.Arrays;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Book {
  String title;
  Author[] authors;
  int pages;
  boolean local;
  Date releseDate;
  Press press;

  public Book() {
    System.out.println("Book()");
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Author[] getAuthors() {
    return authors;
  }

  public void setAuthors(Author[] authors) {
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
    return "Book [title=" + title + ", authors=" + Arrays.toString(authors) + ", pages=" + pages + ", local=" + local
        + ", releseDate=" + releseDate + ", press=" + press + "]";
  }

  

}
