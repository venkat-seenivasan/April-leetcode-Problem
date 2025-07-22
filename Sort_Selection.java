public class Sort_Selection {
    public static void main(String[] args) {
        int arr[]={6,5,2,7,3,8};
        int j;
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                        min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            

           
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
