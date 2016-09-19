package step09;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Book {
  String title;
  String author;
  int pages;
  boolean local;
  Date releseDate;
  Press press;

  public Book() {
    System.out.println("Book()");
  }

  


  public Book(String title, String author, Press press) {
    System.out.println("Book(String,String)");
    this.title = title;
    this.author = author;
    this.press=press;

  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    System.out.println("setTitle()");
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    System.out.println("setAuthor()");
    this.author = author;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    System.out.println("setPages()");
    this.pages = pages;
  }

  public boolean isLocal() {
    return local;
  }

  public void setLocal(boolean local) {
    System.out.println("setLocal()");
    this.local = local;
  }

  public Date getReleseDate() {
    return releseDate;
  }

  public void setReleseDate(Date releseDate) {
    System.out.println("setReleseDate()");
    this.releseDate = releseDate;
  }

  public Press getPress() {
    return press;
  }

  public void setPress(Press press) {
    System.out.println("setPress()");
    this.press = press;
  }

  @Override
  public String toString() {
    return "Book [title=" + title + ", author=" + author + ", pages=" + pages + ", local=" + local + ", releseDate="
        + releseDate + ", press=" + press + "]";
  }

}
