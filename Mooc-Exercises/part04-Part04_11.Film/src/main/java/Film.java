public class Film {

    private String filmName;
    private int ageRating;

    public Film(String name, int age){
        this.filmName = name;
        this.ageRating = age;
    }

    public String name(){
        return filmName;
    }

    public int ageRating(){ 
        return ageRating;
    }
    
}
