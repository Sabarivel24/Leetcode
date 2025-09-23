class Solution {
    public String tictactoe(int[][] moves) {
        int games[][]=new int[3][3];
        int g_row,g_col;
        int moves_row;
        for(moves_row=0;moves_row<moves.length;moves_row++){
            g_row=moves[moves_row][0];
            g_col=moves[moves_row][1];
            if(moves_row%2==0){
                games[g_row][g_col]=1;
            }
            else{
                games[g_row][g_col]=2;
            }
        }
        for(int row=0;row<3;row++){
            if(games[row][0]==games[row][1]&& games[row][0]==games[row][2] && games[row][0]!=0){
                if(games[row][0]==1){
                    return "A";
                }
                else{
                    return "B";
                }
            }
            
            
        }
        for(int row=0;row<3;row++){
            if(games[0][row]==games[1][row]&& games[0][row]==games[2][row] && games[0][row]!=0){
                if(games[0][row]==1){
                    return "A";
                }
                else{
                    return "B";
                }
            }
            
            
        }
        
        if(games[0][0]==games[1][1]&& games[0][0]==games[2][2] && games[0][0]!=0){
                if(games[0][0]==1){
                    return "A";
                }
                else{
                    return "B";
                }
            }
        if(games[0][2]==games[1][1]&& games[0][2]==games[2][0] && games[0][2]!=0){
                if(games[0][2]==1){
                    return "A";
                }
                else{
                    return "B";
                }
            }

            return moves.length==9?"Draw":"Pending";
            
    }
}