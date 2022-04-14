package javacorn;

public class eightQueens {


	/***************************************************************************
	    * Return true if queen placement q[n] does not conflict with
	    * other queens q[0] through q[n-1]
	    ***************************************************************************/
	    public static boolean isConsistent(int[] q, int n) {
	        for (int i = 0; i < n; i++) {
	            if (q[i] == q[n])             return false;   // same column
	            if ((q[i] - q[n]) == (n - i)) return false;   // same major diagonal
	            if ((q[n] - q[i]) == (n - i)) return false;   // same minor diagonal
	        }
	        return true;
	    }

	   /***************************************************************************
	    * Prints n-by-n placement of queens from permutation q in ASCII.
	    ***************************************************************************/
	    public static void printQueens(int[] q) {
	        int n = q.length;
	        eightQueens StdOut;
			for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (q[i] == j) {
	                	eightQueens.print("Q ");
	                }
	                else {
	                	eightQueens.print("* ");
	                }
	            }
	            eightQueens.println();
	        }  
	        eightQueens.println();
	    }


	   private static void println() {
		// TODO Auto-generated method stub
		
	}

	private static void print(String string) {
		// TODO Auto-generated method stub
		
	}

	/***************************************************************************
	    *  Try all permutations using backtracking
	    ***************************************************************************/
	    public static void enumerate(int n) {
	        int[] a = new int[n];
	        enumerate(a, 0);
	    }

	    public static void enumerate(int[] q, int k) {
	        int n = q.length;
	        if (k == n) printQueens(q);
	        else {
	            for (int i = 0; i < n; i++) {
	                q[k] = i;
	                if (isConsistent(q, k)) enumerate(q, k+1);
	            }
	        }
	    }  
	    public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n = Integer.parseInt(args[0]);
	        enumerate(n);
		}
}
