// Bianca Pereira da Silva - RM: 571077; Maria Eduarda Cavallari Quarelo - RM: 570462
package br.com.fiap.main;

import br.com.fiap.bean.Aluno;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class MainAluno {
    public static void main(String[] args) {

        Aluno aluno1, aluno2, aluno3, aluno4;
        String auxiliar, nome3, nome4, dataEUA3, dataEUA4;
        int rm3, rm4;
        LocalDate dataDeNasc3, dataDeNasc4;

        try {
            LocalDate dataAtual = LocalDate.now();

            aluno1 = new Aluno(571077, "Bianca Pereira da Silva", LocalDate.parse("2000-07-12"));
            aluno2 = new Aluno(570462, "Maria Eduarda Cavallari Quarelo", LocalDate.parse("2005-03-14"));

            aluno3 = new Aluno();
            aluno4 = new Aluno();

            rm3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do 3º aluno:"));
            aluno3.setRegistroMatricula(rm3);

            nome3 = JOptionPane.showInputDialog("Digite o nome do 3º aluno:");
            aluno3.setNomeCompleto(nome3);

            auxiliar = JOptionPane.showInputDialog("Digite a data de nascimento do 3º aluno (dia/mês/ano):");
            String ano3 = auxiliar.substring(6, 10);
            String mes3 = auxiliar.substring(3, 5);
            String dia3 = auxiliar.substring(0, 2);
            dataEUA3 = ano3 + "-" + mes3 + "-" + dia3;
            dataDeNasc3 = LocalDate.parse(dataEUA3);
            aluno3.setDataDeNascimento(dataDeNasc3);

            rm4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do 4º aluno:"));
            aluno4.setRegistroMatricula(rm4);

            nome4 = JOptionPane.showInputDialog("Digite o nome do 4º aluno:");
            aluno4.setNomeCompleto(nome4);

            auxiliar = JOptionPane.showInputDialog("Digite a data de nascimento do 4º aluno (dia/mês/ano):");
            String ano4 = auxiliar.substring(6, 10);
            String mes4 = auxiliar.substring(3, 5);
            String dia4 = auxiliar.substring(0, 2);
            dataEUA4 = ano4 + "-" + mes4 + "-" + dia4;
            dataDeNasc4 = LocalDate.parse(dataEUA4);
            aluno4.setDataDeNascimento(dataDeNasc4);

            DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            JOptionPane.showMessageDialog(null, String.format("Dados do aluno 1%nRM: %d%nNome: %s%nData de nascimento: %s%n%s",
                    aluno1.getRegistroMatricula(), aluno1.getNomeCompleto(), aluno1.getDataDeNascimento().format(dft), aluno1.calcularIdadeCompleta()));

            JOptionPane.showMessageDialog(null, String.format("Dados do aluno 2%nRM: %d%nNome: %s%nData de nascimento: %s%n%s",
                    aluno2.getRegistroMatricula(), aluno2.getNomeCompleto(), aluno2.getDataDeNascimento().format(dft), aluno2.calcularIdadeCompleta()));

            JOptionPane.showMessageDialog(null, String.format("Dados do aluno 3%nRM: %d%nNome: %s%nData de nascimento: %s%n%s",
                    aluno3.getRegistroMatricula(), aluno3.getNomeCompleto(), aluno3.getDataDeNascimento().format(dft), aluno3.calcularIdadeCompleta()));

            JOptionPane.showMessageDialog(null, String.format("Dados do aluno 4%nRM: %d%nNome: %s%nData de nascimento: %s%n%s",
                    aluno4.getRegistroMatricula(), aluno4.getNomeCompleto(), aluno4.getDataDeNascimento().format(dft), aluno4.calcularIdadeCompleta()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dados inválidos!");
        }
    }
}