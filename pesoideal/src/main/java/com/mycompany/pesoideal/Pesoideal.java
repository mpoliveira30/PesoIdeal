package com.mycompany.pesoideal;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Pesoideal {

    public static void main(String[] args) {
        
        float h, ph1;
        
        
        h = Float.parseFloat
            (JOptionPane.showInputDialog("Digite sua altura:"));
        
        
        float ph = (float) (72.7*h) - 58;
        float pm = (float) ((62.1*h) - 44.7);
        
        
        ph1 = Float.parseFloat
            (JOptionPane.showInputDialog("Digite seu peso:"));
        
        float pm1 = ph1;
        
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        
        int sexo = JOptionPane.showConfirmDialog(null, "Você é do sexo masculino?");
        
        if (sexo == JOptionPane.YES_OPTION && ph1==ph)
            JOptionPane.showMessageDialog(null, "Você está no peso ideal");
        else if (sexo == JOptionPane.NO_OPTION && pm1==pm)
            JOptionPane.showMessageDialog(null, "Você está no peso ideal");
        else if (sexo == JOptionPane.YES_OPTION && ph1!=ph)
            JOptionPane.showMessageDialog(null, "Você está fora do peso");
        else if (sexo == JOptionPane.NO_OPTION && pm1!=pm)
            JOptionPane.showMessageDialog(null, "Você está fora do peso");
            

        
        
        
        
      
    }
}
