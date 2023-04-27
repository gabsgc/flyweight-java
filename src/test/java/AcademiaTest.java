import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AcademiaTest {
    private List<String> academiaStub() {
        Academia academia = new Academia();
        academia.matricular("Gabi", "Vassouras", "RJ", "24992219801");
        academia.matricular("Mary", "Mendes", "RJ", "21992186201");
        academia.matricular("Peter", "Vassouras", "RJ", "24992100221");
        return academia.getAlunos();
    }

    @Test
    void deveRetornarAlunos() {
        List<String> alunosAcademia = academiaStub();
        List<String> alunos = Arrays.asList(
                "Aluno {nome='Gabi', cidade='Vassouras', uf='RJ', telefone='24992219801'}",
                "Aluno {nome='Mary', cidade='Mendes', uf='RJ', telefone='21992186201'}",
                "Aluno {nome='Peter', cidade='Vassouras', uf='RJ', telefone='24992100221'}");
        assertEquals(alunos, alunosAcademia);
    }

    @Test
    void deveRetornarTotalCidades() {
        List<String> alunosAcademia = academiaStub();
        assertEquals(2, CidadeFactory.getTotalCidades());
    }
}