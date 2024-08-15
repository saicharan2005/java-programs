
import  java.util.*;

class MergeSort{

    void merge(int arr[],int l,int m,int r){
            int n1=m-l+1;
            int n2=r-m;

            int le[]=new int[n1];
            int re[]=new int [n2];


            for(int i=0;i<n1;++i){
                le[i]=arr[l+i];
            }
            System.out.println(Arrays.toString(le));

            for(int j=0;j<n2;++j){
                re[j]=arr[m+1+j];
            }
            System.out.println(Arrays.toString(re));

            int i=0,j=0,k=l;
            while(i<n1 && j<n2){
                if(le[i]<re[j]){
                    arr[k]=le[i];
                i++;
                }
                else{
                    arr[k]=re[j];
                j++;
                }
                k++;
            }

            while(i<n1){
                arr[k]=le[i];
                i++;
                k++;
            }

            while(j<n2){
                arr[k]=re[j];
                j++;
                k++;

            }

    }

    void sorti(int arr[],int l,int r){
        if(l<r){
            int m =l+(r-l)/2;
            sorti(arr,l,m);
            sorti(arr,m+1,r);
            merge(arr,l,m,r);
        }

    }
    public static void main(String[] args) {
        int arr[]={7,5,2,4,1,6,3,0};

        System.out.print("before"+Arrays.toString(arr));

        MergeSort ms=new MergeSort();
        ms.sorti(arr,0, (arr.length -1));
        System.out.println("after" + Arrays.toString(arr));

    }
}