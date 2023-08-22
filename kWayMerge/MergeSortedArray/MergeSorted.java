public class MergeSorted{
  
   public static int[] mergeSorted(int[] nums1, int m, int[] nums2, int n) {
      
      // Replace this placeholder return statement with your code
      
      int[] list = new int[]{};

      int p1 = m-1;
      int p2 = n-1;
      int p = nums1.length-1;

      while(p2>=0){
         if(p1>=0 && nums1[p1] > nums2[p2]){
            nums1[p] = nums1[p1];
            p1--;
            p--;
         }else{
            nums1[p] = nums2[p2];
            p2--;
            p--;
         }
      }


      return nums1;
   }
}