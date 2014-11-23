import meteo.MeteoController;
import meteo.MeteoModel;
import meteo.MeteoView;

/**
 * Created by CristiaN1 on 11/23/2014.
 */
public class main {
    public static  void main(String[] args){
        MeteoView theView = new MeteoView();
        MeteoModel theModel = new MeteoModel();

        MeteoController theController = new MeteoController(theModel,theView);
        theView.setVisible(true);
    }

}
