import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TESTES {
    //String
	// Retorna uma string do maior placar
	@Test
	void T1_1() {
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

		
		assertEquals("[(Pedro, 14)(Marcao, 13), (Joao, 12), (Fernando, 11), (Diego, 10)]", classeTestada.toString());

	}
	//Add
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
	//Remove
	@Test
	// Testa se ele retorna o elemento desejado enviando 0 como entrada com o remove
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

		assertEquals("(Pedro, 14)", classeTestada3.remove(0).toString());

	}

	@Test
	// Testa se ele retorna o elemento desejado enviando 4 como entrada com o remove
	void T3_2() {
		GameEntry g1 = new GameEntry("Pedro", 14);
		GameEntry g2 = new GameEntry("Marcao", 13);
		GameEntry g3 = new GameEntry("Joao", 12);
		GameEntry g4 = new GameEntry("Fernando", 11);
		GameEntry g5 = new GameEntry("Diego", 10);

		ScoresBuggedImpl classeTestada3_2 = new ScoresBuggedImpl();
		classeTestada3_2.add(g1);
		classeTestada3_2.add(g2);
		classeTestada3_2.add(g3);
		classeTestada3_2.add(g4);
		classeTestada3_2.add(g5);

		assertEquals("(Diego, 10)", classeTestada3_2.remove(4).toString());

	}

	@Test
	// Testa se ele retorna o elemento desejado enviando -1 como entrada com o
	// remove
	void T3_3() {
		GameEntry g1 = new GameEntry("Pedro", 14);
		GameEntry g2 = new GameEntry("Marcao", 13);
		GameEntry g3 = new GameEntry("Joao", 12);
		GameEntry g4 = new GameEntry("Fernando", 11);
		GameEntry g5 = new GameEntry("Diego", 10);

		ScoresBuggedImpl classeTestada3_3 = new ScoresBuggedImpl();
		classeTestada3_3.add(g1);
		classeTestada3_3.add(g2);
		classeTestada3_3.add(g3);
		classeTestada3_3.add(g4);
		classeTestada3_3.add(g5);

		try {
			classeTestada3_3.remove(-1);
		} catch (IndexOutOfBoundsException ex) {

			assertEquals("java.lang.IndexOutOfBoundsException: Invalid index: -1", ex.toString());
		}
	}

	@Test
	// Lista vazia i=1
	void T3_4() {
		ScoresBuggedImpl classeTestada3_4 = new ScoresBuggedImpl();
		try {
			classeTestada3_4.remove(1);
		} catch (IndexOutOfBoundsException ex) {
			
			assertEquals("java.lang.IndexOutOfBoundsException: Invalid index: 1", ex.toString());
		}

	}
	@Test
	// Lista com 2 maiores scores i=3
	void T3_5() {
		GameEntry g1 = new GameEntry("Pedro", 14);
		GameEntry g2 = new GameEntry("Marcao", 13);
		ScoresBuggedImpl classeTestada3_5 = new ScoresBuggedImpl();
		classeTestada3_5.add(g1);
		classeTestada3_5.add(g2);

		try {
			classeTestada3_5.remove(3);
		} catch (IndexOutOfBoundsException ex) {
			
			assertEquals("java.lang.IndexOutOfBoundsException: Invalid index: 3", ex.toString());
		}

	}
	@Test
	// Qualquer estado i=5
	void T3_6() {
		GameEntry g1 = new GameEntry("Pedro", 14);
		GameEntry g2 = new GameEntry("Marcao", 13);
		GameEntry g3 = new GameEntry("Joao", 12);
		GameEntry g4 = new GameEntry("Fernando", 11);
		GameEntry g5 = new GameEntry("Diego", 10);

		ScoresBuggedImpl classeTestada3_6 = new ScoresBuggedImpl();
		classeTestada3_6.add(g1);
		classeTestada3_6.add(g2);
		classeTestada3_6.add(g3);
		classeTestada3_6.add(g4);
		classeTestada3_6.add(g5);
		try {
			classeTestada3_6.remove(5);
		} catch (IndexOutOfBoundsException ex) {
	
			assertEquals("java.lang.ArrayIndexOutOfBoundsException: 5", ex.toString());
		}

	}
	//getCapacity
	@Test
	// Chama o método
	//ERRO: retorna 10 em vez de 5!
	void T4_1() {
		GameEntry g1 = new GameEntry("Pedro", 14);
		GameEntry g2 = new GameEntry("Marcao", 13);
		GameEntry g3 = new GameEntry("Joao", 12);
		GameEntry g4 = new GameEntry("Fernando", 11);
		GameEntry g5 = new GameEntry("Diego", 10);

		ScoresBuggedImpl classeTestada4 = new ScoresBuggedImpl();
		classeTestada4.add(g1);
		classeTestada4.add(g2);
		classeTestada4.add(g3);
		classeTestada4.add(g4);
		classeTestada4.add(g5);		
		
		assertEquals(5,classeTestada4.getCapacity());
	}
	//getNumElements
		@Test
		// Chama o método Lista com 5 scores
		//ERRO: retorna 4 em vez de 5!
		void T5_1() {
			GameEntry g1 = new GameEntry("Pedro", 14);
			GameEntry g2 = new GameEntry("Marcao", 13);
			GameEntry g3 = new GameEntry("Joao", 12);
			GameEntry g4 = new GameEntry("Fernando", 11);
			GameEntry g5 = new GameEntry("Diego", 10);

			ScoresBuggedImpl classeTestada5 = new ScoresBuggedImpl();
			classeTestada5.add(g1);
			classeTestada5.add(g2);
			classeTestada5.add(g3);
			classeTestada5.add(g4);
			classeTestada5.add(g5);
			
			
			assertEquals(5,classeTestada5.getNumElements());
		}
		@Test
		// Chama o método Lista com 0 scores
		//ERRO: retorna -1 em vez de 0!
		void T5_2() {

			ScoresBuggedImpl classeTestada5 = new ScoresBuggedImpl();
			
			
			assertEquals(0,classeTestada5.getNumElements());
		}
		@Test
		// Chama o método Lista com 3 scores
		//ERRO: retorna 2 em vez de 3!
		void T5_3() {
			GameEntry g1 = new GameEntry("Pedro", 14);
			GameEntry g2 = new GameEntry("Marcao", 13);
			GameEntry g3 = new GameEntry("Joao", 12);

			ScoresBuggedImpl classeTestada5 = new ScoresBuggedImpl();
			classeTestada5.add(g1);
			classeTestada5.add(g2);
			classeTestada5.add(g3);
			
			
			assertEquals(3,classeTestada5.getNumElements());
		}
		//Contructor
		@Test
		// Entrada :(“Joao”, 18)
		
		void T6_1() {
			GameEntry g1 = new GameEntry("Joao", 18);

			ScoresBuggedImpl classeTestada6 = new ScoresBuggedImpl();
			classeTestada6.add(g1);
			
				assertEquals("[(Joao, 18)]", classeTestada6.toString());
			
		}
		@Test
		// Entrada :(“Joao”, -18)
		
		void T6_2() {
			GameEntry g1 = new GameEntry("Joao", -18);

			ScoresBuggedImpl classeTestada6 = new ScoresBuggedImpl();
			classeTestada6.add(g1);
		
			
				assertEquals("[]", classeTestada6.toString());
			
		}
		//getScore
		@Test
		// Entrada :(“Joao”, 18)
		//Erro: retorno deveria ser 18 e esta retornando 1
		
		void T7_1() {
			GameEntry g1 = new GameEntry("Joao", 18);

			ScoresBuggedImpl classeTestada6 = new ScoresBuggedImpl();
			
			assertEquals(18,g1.getScore());
		
			
		}
	

}
