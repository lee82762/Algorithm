package 리틀코드.canplaceflowers;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==1 && n!=0 &&flowerbed[0]==1){
            return false;
        }
        else if(flowerbed.length==1 && n==0){
            return true;
        }
        else if(flowerbed.length==1 && flowerbed[0]==0 &&n==1){
            return true;
        }

        if(flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            n-=1;
        }
        if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
            flowerbed[flowerbed.length-1]=1;
            n-=1;
        }
        for(int i=1; i<flowerbed.length-1; i++){
            if(n==0){
                break;
            }
            if(flowerbed[i]==1){
                continue;
            }
            else{
                if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    n-=1;
                }
            }
        }

        if(n<=0){
            return true;
        }
        else{
            return false;
        }

    }
}
