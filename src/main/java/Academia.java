import java.util.ArrayList;
import java.util.List;

public class Academia {
    private List<Aluno> alunos = new ArrayList<>();

    public void matricular(String nome, String nomeCidade, String uf, String telefone) {
        Cidade cidade = CidadeFactory.getCidade(nomeCidade, uf);
        Aluno aluno = new Aluno(nome, cidade, telefone);
        alunos.add(aluno);
    }

    public List<String> getAlunos() {
        List<String> output = new ArrayList<>();
        for (Aluno aluno: this.alunos) {
            output.add(aluno.obterAluno());
        }
        return output;
    }
}
