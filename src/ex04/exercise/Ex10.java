package ex04.exercise;
class Movie{
    private String title, director, actors;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }
}
public class Ex10 {
    public static void main(String[] args) {
        Movie m1= new Movie();
        m1.setTitle("Transformer");
        System.out.println(m1.getTitle());
    }

}
