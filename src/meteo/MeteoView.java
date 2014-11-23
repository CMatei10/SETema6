package meteo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by CristiaN1 on 11/23/2014.
 */
public class MeteoView extends JFrame {
    JButton actualizareButton = new JButton("Actualizare");
    JLabel tempLabel = new JLabel("Temperatura:");
    JLabel vantLabel = new JLabel("Viteza Vant:");
    JTextField tempTF = new JTextField("");
    JTextField vantTF = new JTextField("");
    JLabel orasLabel = new JLabel("Pitesti");
    JLabel gradeL = new JLabel();
    JLabel ms = new JLabel("");

    Font labelFont = new Font("Courier New", Font.BOLD, 15);
    Font TFFont = new Font("Courier New", Font.BOLD, 15);

    public MeteoView() {
        JPanel meteoPanel = new JPanel();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(400, 100, 225, 275);
        meteoPanel.setLayout(null);

        gradeL.setText("\u00b0" + "C");
        ms.setText("m/s");

        orasLabel.setBounds(55, 1, 120, 20);
        orasLabel.setFont(new Font("Courier New", Font.BOLD, 25));
        tempLabel.setBounds(5, 45, 150, 20);
        tempLabel.setFont(labelFont);
        vantLabel.setBounds(5, 75, 150, 20);
        vantLabel.setFont(labelFont);
        tempTF.setBounds(115, 45, 50, 25);
        tempTF.setFont(TFFont);
        vantTF.setBounds(115, 75, 50, 25);
        vantTF.setFont(TFFont);
        actualizareButton.setBounds(55, 175, 100, 30);
        gradeL.setBounds(165,45,50,20);
        gradeL.setFont(labelFont);
        ms.setBounds(167,75,50,20);
        ms.setFont(labelFont);

        meteoPanel.setBounds(800, 800, 200, 200);

        meteoPanel.add(tempLabel);
        meteoPanel.add(vantLabel);
        meteoPanel.add(tempTF);
        meteoPanel.add(vantTF);
        meteoPanel.add(orasLabel);
        meteoPanel.add(actualizareButton);
        meteoPanel.add(gradeL);
        meteoPanel.add(ms);

        this.add(meteoPanel);
    }

    public void seteazaTemperatura(double temp) {
        String format = "%.2f";
        String text = String.format(format, Double.valueOf(temp));
        tempTF.setText(text+"");
    }

    public void seteazaVitezaVant(double vv) {
        String format = "%.2f";
        String text = String.format(format, Double.valueOf(vv));
        vantTF.setText(text+"");
    }

    public void seteazaOras(String oras){
        orasLabel.setText(oras);
    }

    public void addListener(ActionListener listenactualizareButton){
        actualizareButton.addActionListener(listenactualizareButton);
    }

}
