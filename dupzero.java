public class dupzero {
    public static void duplicateZeros(int[] arr) {
        int c = 0;
        for (int i : arr) {
            if(i == 0) c++;
        }
        int[] res = new int[arr.length+c];
        c = 0;
        for (int i : arr) {
            if(i == 0) {
                res[c]=0;
                res[c+1]=0;
                c+=2;
            }
            else res[c++]=i;
        }
        c=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=res[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
    }
}
// arr = [1,0,2,3,0,4,5,0]
// res = [1,0,0,2,3,0,0,4]