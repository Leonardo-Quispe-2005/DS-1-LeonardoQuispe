package aula02;

import javax.swing.JOptionPane;

public class caixadeDialogo2 {

    public static void main(String[] args) {

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        JOptionPane.showMessageDialog(null, "Sua idade é: " + idade);
        
    }
}
