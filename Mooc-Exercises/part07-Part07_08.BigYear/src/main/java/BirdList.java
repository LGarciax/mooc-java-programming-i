import java.util.ArrayList;

public class BirdList {
    private ArrayList<Bird> birdList;
    private int observations;

    public BirdList() {
        this.birdList = new ArrayList<>();
        this.observations = 0;
    }

    public void addBird(Bird bird) {
        this.birdList.add(bird);
    }

    public void addObservation(String name) {
        for (Bird bird : birdList) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                this.observations++;
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public void printBird(String name) {
        for (Bird bird : birdList) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public void printBirdList() {
        for (Bird bird : birdList) {
            System.out.println(bird);
        }
    }

    


}
