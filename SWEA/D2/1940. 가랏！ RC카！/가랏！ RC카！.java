import java.util.*;

class Solution {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
		for(int i = 0; i < T; i++)	{
			int n = sc.nextInt();
            int d = 0;
            int v = 0;
           	for (int j = 0; j < n; j++) {
            	int cmd = sc.nextInt();
                switch (cmd) {
                    case 0:
                        d += v;
                        break;
                    case 1:
                        int increase = sc.nextInt();
                        v += increase;
                        d += v;
                        break;
                    case 2:
                        int decrease = sc.nextInt();
                        if (v < decrease) {
                        	v = 0;
                        } else {
                            v -= decrease;
                        	d += v;
                        }
                        break;
                }
            }
            System.out.println("#" + (i + 1) + " " + d);
		}
	}
}