import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TESTES {

	// Retorna uma string do maior placar
	@Test
	void T1() {
		GameEntry g1 = new GameEntry("Pedro", 14);
		GameEntry g2 = new GameEntry("Marcao", 13);
		GameEntry g3 = new GameEntry("Joao", 12);
		GameEntry g4 = new GameEntry("Fernando", 11);
		GameEntry g5 = new GameEntry("Diego", 10);

		ScoresBuggedImpl classeTestada = new ScoresBuggedImpl();
		classeTestada.add(g1);
		classeTestada.add(g2);
		classeTestada.add(g3);
		classeTestada.add(g4);
		classeTestada.add(g5);

		System.out.println(classeTestada.toString());
		assertEquals("[(Pedro, 14)(Marcao, 13), (Joao, 12), (Fernando, 11), (Diego, 10)]", classeTestada.toString());

	}

	@Test
	// Tenta adicionar um novo placar que é grande que chega

	// Não é possivel testar, pois o array tem limite de 5 espacoes e nada é feito
	// para tratar isso.
	void T2_1() {

		GameEntry g1 = new GameEntry("Pedro", 14);
		GameEntry g2 = new GameEntry("Marcao", 13);
		GameEntry g3 = new GameEntry("Joao", 12);
		GameEntry g4 = new GameEntry("Fernando", 11);
		GameEntry g5 = new GameEntry("Diego", 10);

		ScoresBuggedImpl classeTestada2 = new ScoresBuggedImpl();
		classeTestada2.add(g1);
		classeTestada2.add(g2);
		classeTestada2.add(g3);
		classeTestada2.add(g4);
		classeTestada2.add(g5);

		GameEntry g7 = new GameEntry("Felipe", 15);
		
		classeTestada2.add(g7);

		System.out.println(classeTestada2.toString());

		assertEquals("[(Felipe, 15), (Pedro, 14), (Marcao, 13), (Joao, 12), (Fernando, 11)]",
				classeTestada2.toString());

	}

	@Test
	// Tenta adicionar um novo placar inferior ao menor da lista
	// Não é possivel testar, pois o array tem limite de 5 espacoes e nada é feito
		// para tratar isso.
	void T2_2() {
		// System.out.println(TESTES.teste());
		// assertEquals(
		// "[(Pedro, 14), (Marcao, 13), (Joao, 12), (Fernando, 11), (Diego, 10)]"
		// ,
		// ScoresBuggedImpl.toString(TESTES.teste()));

	}
	@Test
	void T3_1() {
		GameEntry g1 = new GameEntry("Pedro", 14);
		GameEntry g2 = new GameEntry("Marcao", 13);
		GameEntry g3 = new GameEntry("Joao", 12);
		GameEntry g4 = new GameEntry("Fernando", 11);
		GameEntry g5 = new GameEntry("Diego", 10);

		ScoresBuggedImpl classeTestada3 = new ScoresBuggedImpl();
		classeTestada3.add(g1);
		classeTestada3.add(g2);
		classeTestada3.add(g3);
		classeTestada3.add(g4);
		classeTestada3.add(g5);
		System.out.println(classeTestada3.remove(0));
		
	}
}
