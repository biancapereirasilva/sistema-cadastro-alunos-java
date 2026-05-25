// Bianca Pereira da Silva - RM: 571077; Maria Eduarda Cavallari Quarelo - RM: 570462
package br.com.fiap.bean;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public class Aluno {

    private int registroMatricula;
    private String nomeCompleto;
    private LocalDate dataDeNascimento;

    public Aluno() {
    }

    public Aluno(int registroMatricula, String nomeCompleto, LocalDate dataDeNascimento) {
        setRegistroMatricula(registroMatricula);
        setNomeCompleto(nomeCompleto);
        setDataDeNascimento(dataDeNascimento);
    }

    public int getRegistroMatricula() {
        return registroMatricula;
    }

    public void setRegistroMatricula(int registroMatricula) {
        try {
            if (registroMatricula >= 80000 && registroMatricula <= 599999) {
                this.registroMatricula = registroMatricula;
            } else {
                throw new Exception("Número inválido! O registro de matrícula deve estar entre 80000 e 599999.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        try {
            LocalDate inicio = LocalDate.parse("1959-12-31");
            LocalDate fim = LocalDate.now();

            if (dataDeNascimento.isAfter(inicio) && !dataDeNascimento.isAfter(fim)) {
                this.dataDeNascimento = dataDeNascimento;
            } else {
                throw new Exception("Data inválida! A data de nascimento deve ser entre 01/01/1960 e a data atual.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
    }

    public String calcularIdadeCompleta() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(this.dataDeNascimento, dataAtual);
        return String.format("Atualmente o aluno tem %d anos, %d meses e %d dias", periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }
}
