package step07;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Book {
  String title;
  String author;
  int pages;
  boolean local;
  Date releseDate;
  
  public Book() {
   System.out.println("Book()");
  }
  
  
  
  



  public String getTitle() {
    return title;
  }







  public void setTitle(String title) {
    this.title = title;
  }







  public String getAuthor() {
    return author;
  }







  public void setAuthor(String author) {
    this.author = author;
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







  @Override
  public String toString() {
    return "Book [title=" + title + ", author=" + author + ", pageCount=" + pages + ", local=" + local
        + ", releseDate=" + releseDate + "]";
  }
  
  
  
  
}
