package br.com.gerenciamento.Enums;

public enum Curso {

    ADMINISTRACAO("Administração"),
    INFORMATICA("Informática"),
    CONTABILIDADE("Contabilidade"),
    ENFERMAGEM("Enfermagem"),
    BIOMEDICINA("Biomedicina"),
    DIREITO("Direito");

    private String curso;

    private Curso(String curso) {
        this.curso = curso;
    }

}
