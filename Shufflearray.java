package com.package3;


	

	public class Shufflearray {
	    public static void main(String[] args) {
	    	int a[]= new int[] {1,2,3,4,5,6,7};
			int x,y,rotations=4,temp;
			for(y=rotations;y>0;y--) {
				temp=a[a.length-1];
				for(x=a.length-1;x>0;x--) {
					a[x]=a[x-1];
					
				}
				a[x]=temp;
			}
			for(int temp1 :a)
				System.out.print(temp1+" ");

	        
	        }
	    }
	
	









	
