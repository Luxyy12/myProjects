public class Main {
    public static void main(String[] args) {
        int[] arrayToSort = new int[] {
                100, 25, 2, 102, 35, 50, 8, 36, 3, 1, 99
        };
        int[] arrayToSort2 = new int[] {
                100, 25, 2, 102, 35, 50, 8, 36, 3, 1, 99
        };

        for(int i = 0; i < arrayToSort.length; i++){
            int helpingVariable = 0;
            for(int j = 0, k = j + 1; j < arrayToSort.length - 1 - i; j++, k++){
                if(arrayToSort[j] > arrayToSort[k]){
                    helpingVariable = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[k];
                    arrayToSort[k] = helpingVariable;
                }
            }
        }

        System.out.print("Vzostupne: ");
        for(int i : arrayToSort){
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i = 0; i < arrayToSort2.length; i++){
            int helpingVariable = 0;
            for(int j = 0, k = j + 1; j < arrayToSort2.length - 1 - i; j++, k++){
                if(arrayToSort2[j] < arrayToSort2[k]){
                    helpingVariable = arrayToSort2[j];
                    arrayToSort2[j] = arrayToSort2[k];
                    arrayToSort2[k] = helpingVariable;
                }
            }
        }

        System.out.print("Zostupne: ");
        for(int i : arrayToSort2){
            System.out.print(i + " ");
        }
    }
}