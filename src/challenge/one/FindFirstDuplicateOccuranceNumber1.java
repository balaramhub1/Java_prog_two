package challenge.one;

public class FindFirstDuplicateOccuranceNumber1
{

    public static void main(String[] args)
    {

        /* Program to find the fist duplicate number in a integer array. */

        int a[] = { 1, 0, 3, 4, 3, 6, 8, 9, 2, 3 };

        // using normal for loop
        checkDuplicate1(a);

        // using LinkedList
        // checkDuplicate2(a);

        // using List
        // checkDuplicate3(a);
    }

    private static void checkDuplicate1(int[] a)
    {

        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] == a[j])
                {
                    System.out.println("First duplicate number is : " + a[i]);
                    return;
                }

            }
        }
    }
}