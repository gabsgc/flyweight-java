public class Aluno {
    private String nome;
    private Cidade cidade;
    private String telefone;

    public Aluno(String nome, Cidade cidade, String telefone) {
        this.nome = nome;
        this.cidade = cidade;
        this.telefone = telefone;
    }

    public String obterAluno() {
        return "Aluno {" +
                "nome='" + this.nome + '\'' +
                ", cidade='" + cidade.getNome() + '\'' +
                ", uf='" + cidade.getUf() + '\'' +
                ", telefone='" + this.telefone + '\'' +
                '}';
    }
}
