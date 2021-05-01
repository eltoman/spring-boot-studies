package br.com.alura.forum;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.repository.CursoRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
public class CursoRepositoryTests {

	@Autowired
	private CursoRepository cursoRepository;

	@Autowired
	private TestEntityManager testEntityManager;

	@Test
	public void deveriaBuscarCursoPorNome() {
		createCurso();
		String nomeCurso = "HTML 5";
		Curso curso = cursoRepository.findByNome(nomeCurso);
		Assert.assertNotNull(curso);
		Assert.assertEquals(nomeCurso, curso.getNome());
	}

	@Test
	public void naoDeveriaBuscarCursoPorNomeCasoNaoExista() {
		String nomeCurso = "Curso que nao existe";
		Curso curso = cursoRepository.findByNome(nomeCurso);
		Assert.assertNull(curso);
	}

	public void createCurso(){
		Curso curso = new Curso();
		curso.setNome("HTML 5");
		testEntityManager.persist(curso);
	}
}
