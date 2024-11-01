
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        int i = array.length -1;
        for(int x = 0; x < array.length; x++){
            
            System.out.print(array[x]);
            if(x != i){
                System.out.print(",");
            }


        }
    }
}
