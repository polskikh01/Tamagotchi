class Logic{
    int hunger = 0;
    int energy = 0;
    int waste = 0;
    int age = 0;

    public static final int HUNGER_CANEAT = 32;
    public static final int HUNGER_NEEDSTOEAT = 128;
    
    public static final int HUNGER_SICKFROMNOTEATING = 256;
    public static final int HUNGER_DEADFROMNOTEATING = 512;

    public static final int ENERGY_CANSLEEP = 150;
    public static final int ENERGY_TIERD = 64;
    public static final int ENERGY_PASSOUT = 8;
    
    public static final int WASTE_EXPUNGE = 256;

    public Logic(){
        doSleep();
    }

    public void doCycle(){
        doRandomEvent();
        hunger++;
        waste++;
        energy--;
        age+=2;
    }

    public void doSleep(){
        energy += 256;
    }

    public void doRandomEvent(){
        switch((int)(Math.random()*32)){
            case 4: hunger++;
            case 7: energy--;
            case 10: energy++;
            case 13: waste++;
            case 16: age++;
            case 19: age--;
            default: break;
        }
    }
}