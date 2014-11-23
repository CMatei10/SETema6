package meteo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by CristiaN1 on 11/23/2014.
 */
public class MeteoController {
    private MeteoModel theModel;
    private MeteoView theView;

    public MeteoController(MeteoModel theModel, MeteoView theView) {
        this.theModel = theModel;
        this.theView = theView;

        this.theView.addListener(new MeteoListener());
    }

     class MeteoListener implements ActionListener{

         @Override
         public void actionPerformed(ActionEvent e) {
             theModel.seteazaTemperatura();
             theModel.seteazaVitezaVant();

             theView.seteazaTemperatura(theModel.afisTemperatura());
             theView.seteazaVitezaVant(theModel.afisVitezaVant());
             theView.seteazaOras(theModel.afisOras());
         }
     }
}
