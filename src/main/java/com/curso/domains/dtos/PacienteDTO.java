package com.curso.domains.dtos;


import com.curso.domains.Paciente;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PacienteDTO {

    private long idPaciente;

    @NotNull(message = "O campo nome não pode ser nulo")
    @NotBlank(message = "O campo nome não pode ser vazio")
    private String nome;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento = LocalDate.now();

    @NotNull(message = "O campo internação não pode ser nulo")
    @Digits(integer = 15, fraction = 2)
    private BigDecimal custoInternacao;

    public PacienteDTO() {
    }

    public PacienteDTO(Paciente paciente) {
        this.idPaciente = paciente.getIdPaciente();
        this.nome = paciente.getNome();
        this.dataNascimento = paciente.getDataNascimento();
        this.custoInternacao = paciente.getCustoInternacao();
    }


    public  long getIdPaciente(){
        return idPaciente;
    }

    public void setIdPaciente(long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public @NotNull(message = "O campo nome não pode ser nulo")@NotBlank(message = "O campo nome não pode ser vazio") String getNomeP(){
        return nome;
    }

    public void setNomeP (@NotNull(message = "O campo não pode ser nulo")@NotBlank(message = "O campo não pode ser vazio")String getNomeP){
        this.nome = nome;
    }


    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public @NotNull(message = "O campo custoInternacao não pode ser nulo")@Digits(integer = 15, fraction = 2)BigDecimal getInternacao(){
        return custoInternacao;
    }

    public void setInternacao(@NotNull(message = "O campo custoInternacao não pode ser nulo") @Digits(integer = 15, fraction = 2) BigDecimal custoInternacao) {
        this.custoInternacao = custoInternacao;
    }



}
