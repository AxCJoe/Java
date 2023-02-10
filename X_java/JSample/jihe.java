package JSample;

public class jihe {

	public static void main(String[] args) {

		        int a[]={1,3,8,2,16,42,31,45};
		        int position=0;
		        for(int i=0;i<a.length;i++){

		            int j=i+1;
		            position=i;
		            int temp=a[i];
		            for(;j<a.length;j++){
		            if(a[j]<temp){
		                temp=a[j];
		                position=j;
		            }
		            }
		            a[position]=a[i];
		            a[i]=temp;
		        }
		        for(int i=0;i<a.length;i++)
		            System.out.println(a[i]);
		    }

}
