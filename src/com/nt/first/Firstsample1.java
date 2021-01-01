package com.nt.first;

public class Firstsample1 {
        public static int getLargest(int[] a){
            int temp;
            for(int i=0;i<a.length;i++){
                for(int j=i+1;j<a.length;j++){
                    if(a[i]>a[j]){
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
            return a[a.length-1];
        }



    public static void main(String[] args) {
        int a[]={30,20,50,25,21,24};
        System.out.println("Largest no:"+getLargest(a));
    }
}

