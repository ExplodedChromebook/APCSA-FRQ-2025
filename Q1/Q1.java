class DogWalkCompany{
    //Part A
    public int walkDogs(int hour){
        int numDogs = numAvailableDogs(hour);
        int max = maxDogs;
        if(max<numDogs){
            company.updateDogs(hour, max);
            return max;
        }
        company.updateDogs(hour, numDogs);
        return numDogs;

    }
    //Part B
    public int dogWalkedShift(int startHour,int endHours){
        int cash = 0;
        int x = startHour;
        while(x<=endHours){
            int y = walkDogs(x);
            dogWalked+=y
            if((x>=9 && x<=17)||(y==maxDogs)){
                cash+=3;
            }else{
                cash+=(dogWalked*5);
            }
            x++;
        }
        return cash;
    }
}
