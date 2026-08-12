class Solution {
    public boolean isSameAfterReversals(int num) {
        int reverse1=reverseNum(num);
        int reverse2=reverseNum(reverse1);
        return reverse2==num;
    }
        static int reverseNum(int num)
     {
        int reverse=0;
           while(num > 0)
          {
            int ld= num % 10;
            reverse = reverse *10 +ld;
            num = num/10;
          }
        return reverse;
    }
       // return num == 0 || num % 10 !=0;
}