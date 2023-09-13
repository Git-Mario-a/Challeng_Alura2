package Principal;

import javax.swing.JOptionPane;
import ConversorMonedas.Function;
import ConversorTemperatura.FunctionTemperatura;

public class Principal {
    public static void main(String[] args) {
        while (true) {
            OpcionMenu opcion = mostrarMenu();

            if (opcion == OpcionMenu.SALIR) {
                JOptionPane.showMessageDialog(null, "Programa terminado");
                break;
            }

            double valor = obtenerValorEntrada();

            switch (opcion) {
                case CONVERSOR_MONEDA:
                    Function functionMoneda = new Function();
                    functionMoneda.ConvertirMonedas(valor);
                    break;
                case CONVERSOR_TEMPERATURA:
                    FunctionTemperatura functionTemperatura = new FunctionTemperatura();
                    functionTemperatura.ConvertirTemperatura(valor);
                    break;
            }

            if (!continuarPrograma()) {
                JOptionPane.showMessageDialog(null, "Programa terminado");
                break;
            }
        }
    }


    private static OpcionMenu mostrarMenu() {
        Object[] opciones = {OpcionMenu.CONVERSOR_MONEDA, OpcionMenu.CONVERSOR_TEMPERATURA, OpcionMenu.SALIR};
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción de conversión", "Menu",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        return OpcionMenu.values()[seleccion];
    }

    private static double obtenerValorEntrada() {
        String input = JOptionPane.showInputDialog("Ingrese el valor a convertir: ");
        while (!ValidarNumero(input)) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Ingrese nuevamente.");
            input = JOptionPane.showInputDialog("Ingrese el valor a convertir: ");
        }
        return Double.parseDouble(input);
    }

    private static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean continuarPrograma() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?", "Confirmar",
                JOptionPane.YES_NO_OPTION);
        return respuesta == JOptionPane.YES_OPTION;
    }
}

enum OpcionMenu {
    CONVERSOR_MONEDA("Conversor de Moneda"),
    CONVERSOR_TEMPERATURA("Conversor de Temperatura"),
    SALIR("Salir");

    private final String descripcion;

    OpcionMenu(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
