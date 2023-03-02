package Procedimento;

import javax.swing.JOptionPane;

public class Operador {

    void soma() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B: "));
        int soma = a + b;
        JOptionPane.showMessageDialog(null, "O valor da soma é: " + soma);
    }
    void subtracao(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B: "));
        int sub = a - b;
        JOptionPane.showMessageDialog(null, "O valor da subtração é: " + sub);
    }
    
    void multiplicacao(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B: "));
        int mult = a * b;
        JOptionPane.showMessageDialog(null, "O valor da multiplicação é: " + mult);
    }
    
    void divisao(){
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B: "));
        double divis = a / b;
        JOptionPane.showMessageDialog(null, "O valor da divisão é: " + divis);

    }
}
