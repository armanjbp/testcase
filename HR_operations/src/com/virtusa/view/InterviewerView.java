package com.virtusa.view;




import java.util.Scanner;

import com.virtusa.model.InterviewerModel;
public class InterviewerView
{
public void Menu()
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("1->Conduct Interview");
	System.out.println("2-> Result update");
	System.out.print("please Enter option:");
	int value=scanner.nextInt();
	InterviewerModel interviewerModel=new InterviewerModel();
	if(value==1)
	{
		
		interviewerModel.Conduct_interview();
	}
	if(value==2)
	{
		interviewerModel.ResultUpdate();
	}
	

}
public static void main(String args[])
{
	InterviewerView interviewerView=new InterviewerView();
	interviewerView.Menu();
}

	
}
