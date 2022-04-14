package javacorn;
import java.util.Scanner;

public class assignGrades {
	
	static int max(int score[], int students)
	{
	    int max = score[0];
	    for (int i = 1; i < students; i++)
	        if (max < score[i])
	            max = score[i];
	    return max;
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the number of students : ");
	    int  students = sc.nextInt();
	    System.out.print("Enter "+students+" scores : ");
	    int [] score= new int [students];
	    for(int i = 0;i<students;i++) {
	    	score[i] = sc.nextInt();
	    }
	   
	     max( score, students);
	     for(int i = 0;i<students;i++) {
		    	System.out.print("Student "+i+" score is "+score[i]+" and grade is ");
		    	if(score[i]>=(max( score, students)-10)) {System.out.println("A");}
		    	else if(score[i]>=(max( score, students)-20)) {System.out.println("B");}
		    	else if(score[i]>=(max( score, students)-30)) {System.out.println("C");}
		    	else if(score[i]>=(max( score, students)-40)) {System.out.println("D");}
		    	else {System.out.println("F");}
		    }
	}	

}
