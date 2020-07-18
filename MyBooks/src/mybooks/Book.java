/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybooks;

/**
 *
 * @author Dell
 */
public class Book {
     private String name;
    private String ISBN;
     private String author;
      private String publisher;
      
      
       public Book( String n, String isbn, String a, String p){
          
          this.name=n;
          this.ISBN=isbn;
          this.author=a;
          this.publisher=p;
      }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
   
      public String getBookInfo(){
          
          return this.name+" "+this.ISBN+" "+this.author+" "+this.publisher;
      }
     
 }
