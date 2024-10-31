




public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array){
        int smallest = array[0];
        for(int i : array){
            if(smallest > i){ 
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array){ 
        int smallest = smallest(array);
        
        for (int i = 0; i < array.length; i++){ 
            if(array[i] == smallest){ 
                return i;
            }
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex){ 
        int small = table[startIndex];
        int index = startIndex;;
        for(int i = startIndex; i < table.length; i++){ 
            if(small > table[i]){
                small = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2){ 
        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;

    }

    public static void sort(int[] array){ 
        for(int i = 0; i < array.length-1; i++){ 
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
        }
    }


}
