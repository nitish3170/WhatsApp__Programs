import java.util.Scanner;

public class Sorting {
    public static void MergeSort(int[] Array,int l,int h){
        if (l>=h){
            return;
        }
        int mid=(l+h)/2;
        MergeSort(Array,l,mid);
        MergeSort(Array,mid+1,h);
        Merge(Array,l,mid,h);
    }

    public static void Merge (int[]Array, int l,int mid,int h) {
        int l1=mid-l+1;
        int l2=h-mid;
        int [] a1=new int[l1];
        int [] a2=new int[l2];
        for (int i=0;i<l1;i++){
            a1[i]=Array[l+i];
        }
        for (int i=0;i<l2;i++){
            a2[i]=Array[mid+1+i];
        }
        int i=0,j=0,k=l;
        while (i<l1 && j<l2){
            if (a1[i]<a2[j]){
                Array[k]=a1[i];
                i++;
            }
            else{
                Array[k]=a2[j];
                j++;
            }
            k++;
        }
        while (i<l1){
            Array[k]=a1[i];
            i++;k++;
        }
        while (j<l2){
            Array[k]=a2[j];
            j++;
            k++;
        }

    }

    public static void ArrayPrint(int [] Array) {
        for(int i=0; i<Array.length;i++) {
            System.out.println(Array[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n= sc.nextInt();
        int[] Array=new int[n];
        for(int i=0; i<n;i++) {
            Array[i] = sc.nextInt();
        }
        MergeSort(Array,0,n-1);
        ArrayPrint(Array);

    }
}
