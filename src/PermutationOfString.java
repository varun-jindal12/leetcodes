public class PermutationOfString {
    static void printAllKLength(char[] set, int k){
        int n = set.length;
        printAllKLengthRec(set, "", n, k);
    }

    static void printAllKLengthRec(char[] set, String prefix, int n, int k){
        if(k == 0) System.out.println(prefix);
        else{
            for(int i = 0;i<n;++i){
                String newPrefix = prefix+set[i];
                printAllKLengthRec(set, newPrefix,n,k-1);
            }
        }
    }
    public void driver(){
        System.out.println("First Test");
        char[] set1 = {'a', 'b'};
        int k = 3;
        printAllKLength(set1, k);

        System.out.println("\nSecond Test");
        char[] set2 = {'a', 'b', 'c', 'd'};
        k = 2;
        printAllKLength(set2, k);
    }
}
