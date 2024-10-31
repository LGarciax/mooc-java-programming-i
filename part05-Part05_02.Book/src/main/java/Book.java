public class Book {
    
    private String author;
    private String title;
    private int pageCount;

    public Book(String author, String title, int pages){ 
        this.author = author;
        this.title = title;
        this.pageCount = pages;
    }

    public String getAuthor(){ 
        return this.author;
    }

    public String getName(){
        return this.title;
    }

    public int getPages(){
        return pageCount;
    }

    public String toString(){
        return this.author + ", " + this.title + ", " + this.pageCount + " pages";
    }



}
