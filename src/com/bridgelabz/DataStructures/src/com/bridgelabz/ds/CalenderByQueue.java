package com.bridgelabz.ds;

public class CalenderByQueue 
{
public static void calenderQue()
{
	MyQueue<Object> weekQ = new MyQueue<>();
	MyQueue<Object>  daysQue = new MyQueue<>();
	for(int i = 0 ;i < CalenderProgram.dayOfWeek.length;i++)
	{
	   weekQ.enque(CalenderProgram.dayOfWeek[i]);
	}
	weekQ.enque("\n");
	for(int i = 0;i < CalenderProgram.wholeDays.length;i++)
	{
		for(int j = 0 ;j < CalenderProgram.wholeDays[i].length;j++)
		{
			int str = CalenderProgram.wholeDays[i][j];
			if(str < 10)
			{
				daysQue.enque(((str == 0||str == -1) ? " ":str)+"  ");
				
			}
			else {
				daysQue.enque(((str == 0||str == -1) ? "  ":str)+" ");
			}
			
			
		}
		daysQue.enque("\n");
	}
	while( weekQ.size1() != 0)
	{
		System.out.print( weekQ.deque()+" ");
	}
	while(daysQue.size1() != 0)
	{
		System.out.print(daysQue.deque()+" ");
	}
}
public static void main(String[] args) 
{
	CalenderProgram c = new CalenderProgram();
	CalenderProgram.calender(19, 2019);
	calenderQue();
}
}