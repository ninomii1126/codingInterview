import java.util.*;

class FindSmallestNumber {
  public static int kSmallestNumber(List<List<Integer>> lists, int k) {

    PriorityQueue<int[]> smallestNumbers = new PriorityQueue<>((a,b) -> a[0] - b[0]);
    int removedNums = 0;
    int currentNum = 0;

    for(int i=0; i< lists.size(); i++){
      // {number, list Index, number index in the list}
      smallestNumbers.add(new int[] {lists.get(i).get(0), i, 0});
    }

    while(!smallestNumbers.isEmpty()){
      int[] polledNum = smallestNumbers.poll();
      currentNum = polledNum[0];

      removedNums++;

      if(removedNums == k){
        break;
      }

      int listIndex = polledNum[1];
      int numIndex = polledNum[2];

      if(numIndex < lists.get(listIndex).size()-1){
        int nextNum = lists.get(listIndex).get(numIndex+1);
        smallestNumbers.add(new int[] {nextNum, listIndex, numIndex+1});
      }
    }
    
    return currentNum;
  }
}