import java.util.*;
public class TwoQuery {
    public  static List<Integer> rangeSum(int numOfCustomer, int numOfQueries, List<List<Integer>> queries) {
 
        int[] number=new int[numOfCustomer+1];
        ArrayList result=new ArrayList();
        int res=0;
        for(List item:queries){
            int type=(Integer)item.get(0);
            if(type==1){
                number[(Integer)item.get(1)]= number[(Integer)item.get(1)]+(Integer) item.get(2);
            }else{
                for(int i=(Integer)item.get(1);i<=(Integer) item.get(2);i++){
                   res+=number[i];
                }
                result.add(res);
            }
        }
 
        return result;
    }
 
 
    public static void main(String[] args) {
        int numOfCustomer=4;
        int numOfQueries=5;
        List<List<Integer>> queries=new ArrayList<>();
 
        List arr1=new ArrayList();
        arr1.add(1);
        arr1.add(3);
        arr1.add(12);
 
 
        List arr2=new ArrayList();
        arr2.add(2);
        arr2.add(0);
        arr2.add(2);
 
        List arr3=new ArrayList();
        arr3.add(1);
        arr3.add(1);
        arr3.add(4);
 
        List arr4=new ArrayList();
        arr4.add(1);
        arr4.add(3);
        arr4.add(2);
 
        List arr5=new ArrayList();
        arr5.add(2);
        arr5.add(1);
        arr5.add(3);
 
        queries.add(arr1);
        queries.add(arr2);
        queries.add(arr3);
        queries.add(arr4);
        queries.add(arr5);
 
       List list=rangeSum(numOfCustomer,numOfQueries,queries);
        System.out.println(list.get(0)+" "+list.get(1));
    }
}
