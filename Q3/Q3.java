Class Round{
  //Part A
  private String name;
  private int rank;
  public Round(String[] list){
    int rank = 1;
    for(int x:name){
      competitorList.add(competitor(x,rank));
      rank++;
    }
  }
  //Part B
  public Array<Match> buildMatch(){
    ArrayList<Match> matches = ArrayList<Match>();
    int index = 0;
    if(CompetitorList.size()%2==1){
      index = 1;
    }
    int x =0;
    while(x<((CompetitorList.size()-index)/2)){
      matches.add( Match(competitorList.get(x),competitorList.get(competitorList.size()-1-(x-index))));
      x++;
    }
    return matches;
  }
}
