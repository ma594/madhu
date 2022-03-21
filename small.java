Public class SmallestElement-array
{
    Public Static Void Main(String args[])
    {
        int[]arr=new int();
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println("smallest element present in given array:"+min);
    }
}