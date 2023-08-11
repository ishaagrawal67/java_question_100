public class printfourcombinatoniftheirsumisequaltogivenvalue43 {
    public static void main(String[] args) {
        int[] arr={10, 20, 30, 40, 1, 2};
        int n=arr.length;
        int l=53;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int m=k+1;m<n;m++){
                        int s=arr[i]+arr[j]+arr[k]+arr[m];
                        if(s==53){
                            System.out.println("combinations are"+ arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[m]);
                        }
                    }
                }
            }
        }
    }
}
