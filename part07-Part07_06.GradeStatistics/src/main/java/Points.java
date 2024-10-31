
import java.util.ArrayList;

public class Points {
    
    ArrayList<Integer> points;
    ArrayList<Integer> passingPoints;
    
    public Points() {
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
    } 

    public void addPoints(int point) {
        if(point >= 0 && point <= 100) {
            this.points.add(point);
            if (point >= 50 && point <= 100) {
                this.passingPoints.add(point);
            }
        }
    }

    public void printPoints() {
        System.out.println("Point average (all): " + this.average(this.points));
        if (this.passingPoints.isEmpty()) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + this.average(this.passingPoints));
        }
        System.out.println("Pass percentage: " + this.passPercentage());
        System.out.println("Grade distribution:");
        this.gradeDistribution();
    }
    
    public double average(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int point : list) {
            sum += point;
        }
        return 1.0 * sum / list.size();
    }

    public double passPercentage() {
        if (this.points.isEmpty()) {
            return 0;
        }
        return 100.0 * this.passingPoints.size() / this.points.size();
    }

    public void gradeDistribution() {
        int[] grades = new int[6];
        for (int point : this.points) {
            if (point < 50) {
                grades[0]++;
            } else if (point < 60) {
                grades[1]++;
            } else if (point < 70) {
                grades[2]++;
            } else if (point < 80) {
                grades[3]++;
            } else if (point < 90) {
                grades[4]++;
            } else {
                grades[5]++;
            }
        }
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
}
