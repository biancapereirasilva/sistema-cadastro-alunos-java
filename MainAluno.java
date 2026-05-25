package br.com.fiap.main;
import br.com.fiap.bean.Aluno;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno1, aluno2, aluno3, aluno4;
        String auxiliar, nome2, nome3, nome4, dataEUA2, dataEUA3, dataEUA4;
        int rm2, rm3, rm4;
        LocalDate dataDeNasc2, dataDeNasc3, dataDeNasc4;

        try {
            aluno1 = new Aluno(571077, "Bianca Pereira da Silva", LocalDate.parse("2000-07-12"));

            aluno2 = new Aluno();
            aluno3 = new Aluno();
            aluno4 = new Aluno();

            rm2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do 2º aluno:"));
            aluno2.setRegistroMatricula(rm2);
            nome2 = JOptionPane.showInputDialog("Digite o nome do 2º aluno:");
            aluno2.setNomeCompleto(nome2);
            auxiliar = JOptionPane.showInputDialog("Digite a data de nascimento do 2º aluno (dia/mês/ano):");
            String ano2 = auxiliar.substring(6, 10);
            String mes2 = auxiliar.substring(3, 5);
            String dia2 = auxiliar.substring(0, 2);
            dataEUA2 = ano2 + "-" + mes2 + "-" + dia2;
            dataDeNasc2 = LocalDate.parse(dataEUA2);
            aluno2.setDataDeNascimento(dataDeNasc2);

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
