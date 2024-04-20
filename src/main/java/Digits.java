import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitLists;

	public Digits(int num){
		digitLists = new ArrayList <Integer>();
		if(num == 0){
			digitLists.add(0);
		}
		int n = num;
		while(n>0){
			digitLists.add(0,n%10);
			n = n/10;
		}
	
			
	    
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i =0;i < digitLists.size()-1;i++){
			if(digitLists.get(i+1) <= digitLists.get(i)){
				return false;
			}
			return true;
		}
	}
	
	public String toString()
	{
		return digitLists.toString();
	}
}
