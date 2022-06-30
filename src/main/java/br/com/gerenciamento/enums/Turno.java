package br.com.gerenciamento.enums;

public enum Turno {

    MATUTINO("Matutino"),
    NOTURNO("Noturno");

    private String turno;

    private Turno(String turno) {
        this.turno = turno;
    }
}
