
import java.io.*;

public class CalculateAngleBetweenTwoHands{

	static int CalcAngle(int h,int m){

	if(h>12||h<0||m>60||m<0)
		{
			System.out.println("wrong input!!!");
		}

	

	if(h==12)
		{
			h=0;
		}

	if(m==60)
		{
			m=0;
			h++;
		}

		int angle_minute=(int)(6*m);

		int angle_hour=(int)(0.5*(h*60+m));

		int angle=Math.abs(angle_hour-angle_minute);

		return angle;

		
	}
	public static void main(String[] args) {
		
        {

		System.out.println("angle between them is "+CalcAngle(9,60)+" degree");

		}

	}

}
