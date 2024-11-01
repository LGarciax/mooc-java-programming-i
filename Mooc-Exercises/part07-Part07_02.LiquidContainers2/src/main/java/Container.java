
public class Container {

    private int content;

    public Container() {
    }

    public int contains() {
        return content;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.content += amount;
        }

        if (this.content > 100) {
            this.content = 100;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.content -= amount;
        }
        if (this.content < 0) {
            content = 0;
        }
    }

    public String toString () {
        return this.content + "/100";
    }
}