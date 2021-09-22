import java.util.*;
public class SplittedFibonnacci {

    public static int callme(int l)
    {

            if (l == 0)
                return 0;
            else if (l == 1)
                return 1;
            else {
                return callme(l - 1) + callme(l - 2);
            }


    }
    public static int callme2(int l)
    {

            if (l == 0)
                return 0;
            else if (l == 1)
                return 1;
            else {
                return callme(l - 1) + callme(l - 2);
            }


    }

        public static void main(String[] args)
        {
            for(int i=0;i<5;i++)
            {

                if(i%2==0)
                    System.out.print(callme(i)+",");
                else
                    System.out.print(callme2(i)+",");

            }

        }
    }
