import java.util.Stack;

public class satackNextGrater {
    public static void main(String[] args) {
        int arr[]= {1,3,2,1,8,6,3,4};
        int res[]={};
        Stack<Integer> st =new Stack<>();

        for(int i =arr.length-2 ;i>=0;i--)
        
        {
        while (st.peek()<arr[i]&&st.size()>0) {
          st.pop();
        }
        
        
          if(st.size()==0){
            res[i]=-1;
            // st.p ush(arr[i]);
          }   
         else{
          res[i]=st.peek();}
          st.push(arr[i]);

          
        System.out.println(res.length);
        System.out.println("check");

        
    }
    }

    
}
