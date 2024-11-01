public class Book {
    
    private String title;
    private int pages;
    private int publicationYear;

    public Book(String newTitle, int newPages, int newPublicationYear){
        this.title = newTitle;
        this.pages = newPages;
        this.publicationYear = newPublicationYear; 

    }
    
    
    public String getEveryInfo(){
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }

    public String getTitle(){
        return this.title;
    }

    



}
