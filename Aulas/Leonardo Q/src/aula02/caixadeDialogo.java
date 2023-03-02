package aula02;

import javax.swing.JOptionPane;

public class caixadeDialogo {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite seu nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));

        JOptionPane.showMessageDialog(null, "Seu nome é: " + nome + "\nVocê tem: " + idade + " anos");
        JOptionPane.showMessageDialog(null, nome + " você é lindo(a)");

    }

}
