import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {
        int n[] = {5,7,9,1,3,5,8,2,4,9};
        Arrays.sort(n);
        for(int i=n.length-1;i>=0;i--){
            int a = n[n.length - 1 - i];
            int b = n[i];
            if(i<=5) {
                n[i]=a;
                n[n.length-1-i]=b;
            }
        }
        System.out.println(Arrays.toString(n));
    }
}
