//given a route conatining 4 directions (E,W,N,S) finr the shortest path to reach destination

package Strings;

import java.util.Scanner; 

public class Compuse {
    public static void main(String srg[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(getShotestPath(str));
    }
    public static float getShotestPath(String path) {
        int x=0,y=0;

        for(int i=0;i<path.length();i++) {
            char dir = path.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2+Y2);
    }
}
