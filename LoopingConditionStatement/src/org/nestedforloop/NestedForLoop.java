package org.nestedforloop;

public class NestedForLoop {
	
	public static void main(String[] args) {
		for(int i = 0 ; i<2 ; i++)
		{
			for(int j=1; j<3; j++)
			{
				System.out.println(j);
			}
			System.out.println(i);
		}
	}
}

//i=0	0<2						
//			j=1		1<3		1		1+1=2
//			j=2		2<3		2		2+1=3
//			j=3		3<3	--------terminate

//							0		0+1=1
//i=1	1<2						
//			j=1		1<3		1		1+1=2
//			j=2		2<3		2		2+1=3
//			j=3		3<3	--------terminate
//							1		1+1=2
//i=2	2<2------------terminate