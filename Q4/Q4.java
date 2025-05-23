public class sumOrSameGame{
  private int [][] puzzle;
  public sumOrSameGame(int rows,int cols){
    puzzle = new int[rows][ccols];
    for(int x = 0; x<puzzle.length;x++){
      for(int y = 0; y<puzzle[0].length;y++;)
      puzzle[x][y]=(int)(Math.random()*9-1+1)+1;
    }
  }
  public boolean clearPair(int rows, int cols){
    for(int x=rows; x<puzzle.length; x++){
        for(int y = 0; y<puzzles[0].length; y++){
            if(x != rows || y != cols){
                if(puzzle[rows][cols] == puzzle[x][y] || puzzle[rows][cols] + puzzle[x][y] == 10){
                    puzzle[rows][cols] = 0;
                    puzzle[x][y] = 0;
                    return true;
                }
            }
        }
    }
    return false;
  }
}
