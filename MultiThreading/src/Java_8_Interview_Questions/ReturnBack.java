package Java_8_Interview_Questions;

public class ReturnBack {
    public static void main(String[] args){
        String moves="LL";
        boolean ans = moves(moves);
        System.out.println(ans);
    }
    public static boolean moves(String moves){
        int y=0,x=0;
        for(int move:moves.toCharArray()){
            if(move == 'U') x++;
            else if(move =='D') x--;
            else if(move == 'L') y++;
            else if(move == 'R') y--;
        }
        return x==0 & y==0;
    }
}
