package com.bridgelabz.ds;

public class CalenderStack {
	public static void calenderStack()
	{
		MyStack weekstk = new MyStack();
		MyStack dayStk = new MyStack();
		for(int i = CalenderProgram. dayOfWeek.length-1;i >= 0;i--)
		{
		   weekstk.push1(CalenderProgram.dayOfWeek[i]);
		}
		//System.out.println(Calender.wholeDays.length);
		for(int i = CalenderProgram.wholeDays.length-1;i >= 0;i--)
		{
			for(int j = CalenderProgram.wholeDays[i].length-1;j >= 0;j--)
			{
				int str = CalenderProgram.wholeDays[i][j];
				if(str < 10)
				{
					dayStk.push1(((str == 0||str == -1) ? " ":str)+"  ");
					
				}
				else {
					dayStk.push1(((str == 0||str == -1) ? " ":str)+" ");
				}
				
				
			}
		dayStk.push1("\n");
		}
		
		while(weekstk.size1() != 0)
		{
			System.out.print(weekstk.pop1()+" ");
		}
		while(dayStk.size1() != 0)
		{
			System.out.print(dayStk.pop1()+" ");
		}
	}
	public static void main(String[] args) 
	{
		CalenderProgram c = new CalenderProgram();
		CalenderProgram.calender(11, 2019);
		calenderStack();
	}
}

