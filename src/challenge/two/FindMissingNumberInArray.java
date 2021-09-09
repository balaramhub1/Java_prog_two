package challenge.two;

public class FindMissingNumberInArray
{
    /*Find missing number in array.
     * 
     * Formula to find sum of first n natural numbers : n(n+1)/2
     * Formula to find sum of consecutive numbers : (n/2)*(firstNum+lastNum)
     * 
     * */
    
    public static void main(String[] args)
    {
    
        int arr1[]= {1,2,3,5,6,7};
        int arr2[]= {5,6,7,9,10};
        
        findMissingNumber(arr1);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        findMissingNumber(arr2);       
    }

    private static int findMissingNumber(int[] arr)
    {
        double actSize,expSize;
        int actSum,expSum,missingNum;
        actSize=arr.length;
        expSize=actSize+1;
        
        boolean ifAsc;
        if(arr[0]<arr[(int) (actSize-1)]) {
            ifAsc=true;
        }else {
            ifAsc=false;
        }
        
        actSum=findSumOfArray(arr);
        //expSum=(expSize*(expSize+1))/2;
        
        expSum=(int) ((expSize/2)*(arr[0]+arr[(int) (actSize-1)]));
        missingNum=expSum-actSum;
        System.out.println("Missing Number in Array is : "+missingNum);
        return (int) missingNum;
        
    }
    
    /**
     * Method to return sum of all the elements of the integer array.
     * @param arr
     * @return
     */
    private static int findSumOfArray(int[] arr) {
        int sum=0;
        for(int x:arr) {
            sum+=x;
        }
        return sum;
    }

}
