import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
class Bucket_Sort {
     static void bucketsort(float[] arr){
    int n = arr.length;

         ArrayList<Float>[] bucket = new ArrayList[n];
         for(int i=0;i<n;i++){
             bucket[i] = new ArrayList<Float>();
         }
         for(int i=0;i<n;i++){
             int bucketidx = (int) (arr[i] * n);
             bucket[bucketidx].add(arr[i]);
         }
         for(int i=0;i<bucket.length;i++){
             Collections.sort((bucket[i]));
         }
    int idx = 0;
         for(int i=0;i< bucket.length;i++){
             ArrayList<Float> currbucket = bucket[i];
             for(int j=0 ; j<currbucket.size();j++){
                 arr[idx++] = currbucket.get(j);
             }
         }


 }

 public static void main(String[] args) {
         float[] arr = {0.5f,0.4f,0.3f,0.2f,0.1f};
         bucketsort(arr);
         for(float i:arr){
             System.out.print(i+" ");
         }

 }
}
