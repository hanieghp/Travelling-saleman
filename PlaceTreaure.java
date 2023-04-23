package TSM;

import java.util.Random;

public class PlaceTreaure {
    public void placeTreasure(){
        Random rand = new Random();
        for(int i=0; i<8 ; i++){
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);
        }
    }
}
