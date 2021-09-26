package 리틀코드.distancebetweenbusstops;

class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if(start>destination){
            int temp=start;
            start=destination;
            destination=temp;
        }
        int temp=0; int total=0;
        for(int i=0; i<distance.length; i++){
            if(start<=i&&i<destination){
                temp+=distance[i];
            }
            total+=distance[i];
        }
        return Math.min(temp,total-temp);

    }
}
