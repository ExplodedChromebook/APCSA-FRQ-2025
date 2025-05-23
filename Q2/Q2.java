public class SignedText{
private String first;
private String last;
  public SignedText(String first,String last){
  this.first = first;
  this.last = last;
}
  //Part A
  public String getSignature(){
    if(first.length()==0){
      return last;
    }else{
      return (first.substring(0,1)+"-"+last;
    }
  }
  //Part B
  public String addSignature(String str){
    if(str.indexOf(getSignature())==-1){
      return (str+getSignature());
    }else if(str.indexOf(getSignature())==((getSignature().length())-str.length)){
      return str;
    }else if(str.indexOf(getSignature())==0){
      return (str.substring((getSignature()).length())+getSignature());
    }
  }
}
