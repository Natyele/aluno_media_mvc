package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.AlunoMediaModel;
import mvc.view.AlunoMediaView;

public class AlunoMediaController {
	
		// Objetos das classes View e Model
		private AlunoMediaView view;
		private AlunoMediaModel model;

		// Construtor
		public AlunoMediaController(AlunoMediaView view, AlunoMediaModel model) {
			this.view = view;
			this.model = model;

			// Implementar um ouvinte para o botão da view
			this.view.AlunoMediaListener(new AlunoMediaListener());
		}

		// Classe ouvinte (Listener), para o botão da view
		class AlunoMediaListener implements ActionListener {

			public void actionPerformed(ActionEvent e) {

				// Variáveis locais
				int nota1, nota2, nota3, nota4 = 0;

				// Tentativa
				try {
					nota1 = view.getNota1();
					nota2 = view.getNota2();
					nota3 = view.getNota3();
					nota4 = view.getNota4();
					model.somar(nota1, nota2, nota3, nota4);
					double media = model.retornarResultado();
					view.setResultado((int) media);
					
		
					if(media >= 7) {
						view.displayErrorMessage ("Aprovado");
					} else {
						view.displayErrorMessage ("Reprovado");
						
					}
					
				} catch (NumberFormatException ex) {
					view.displayErrorMessage("Ops:Ocorreu um erro, letras não são permitidas apenas números ");			}
			}
		}
	}


