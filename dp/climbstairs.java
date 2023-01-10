package dp;
// q 70
public class climbstairs {
    public int climbStairs(int n) {
        return fib(1,1,n) ;
     }
     int fib(int n1,int n2,int stair){
         if(stair == 1){
             return 1;
         }
         return n1+ fib(n2,n1+n2,stair - 1);
     } 
}
