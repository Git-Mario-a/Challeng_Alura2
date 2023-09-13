package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasaMX {
    public void ConvertirDolaresAPesos(double valor) {
        double monedaPesos = valor * 17.12; 
        monedaPesos = (double) Math.round(monedaPesos * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesos + " Pesos Mexicanos");
    }

    public void ConvertirEurosAPesos(double valor) {
        double monedaPesos = valor * 18.77; 
        monedaPesos = (double) Math.round(monedaPesos * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesos + " Pesos Mexicanos");
    }

    public void ConvertirLibrasAPesos(double valor) {
        double monedaPesos = valor * 21.58; 
        monedaPesos = (double) Math.round(monedaPesos * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesos + " Pesos Mexicanos");
    }

    public void ConvertirYenAPesos(double valor) {
        double monedaPesos = valor * 0.12; 
        monedaPesos = (double) Math.round(monedaPesos * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesos + " Pesos Mexicanos");
    }

    public void ConvertirWonAPesos(double valor) {
        double monedaPesos = valor * 0.013;
        monedaPesos = (double) Math.round(monedaPesos * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesos + " Pesos Mexicanos");
    }
}
