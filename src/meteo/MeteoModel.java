package meteo;

import java.util.Random;

/**
 * Created by CristiaN1 on 11/23/2014.
 */
public class MeteoModel {
    private double temperatura;
    private double vitezaVant;
    private final double tmin = -25;
    private final double tmax = 42.5;

    public double random(){
        Random rand = new Random();
        double rndNumber;
        rndNumber = rand.nextDouble()*(tmax-tmin) + tmin;

        return rndNumber;
    }

    public double random2(){
        Random rand = new Random();
        double rndNumber2;
        rndNumber2 = rand.nextDouble()*(tmax) + tmin;
        while (rndNumber2 <= 0){
            rndNumber2 = rand.nextDouble()*(tmax) + tmin;
        }


        return rndNumber2;
    }

    public void seteazaTemperatura(){
        temperatura=random();
    }

    public void seteazaVitezaVant(){
        vitezaVant=random2();
    }

    public double afisTemperatura(){
        return temperatura;
    }

    public double afisVitezaVant(){
        return vitezaVant;
    }

    public String afisOras(){
        return "Pitesti";
    }
}
