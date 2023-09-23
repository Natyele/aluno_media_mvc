package mvc;

import mvc.controller.AlunoMediaController;
import mvc.model.AlunoMediaModel;
import mvc.view.AlunoMediaView;

public class Principal {

	public static void main(String[] args) {

		// Objetos das classes MVC
		AlunoMediaView view = new AlunoMediaView();
		AlunoMediaModel model = new AlunoMediaModel();
		AlunoMediaController controller = new AlunoMediaController(view, model);

		// Exibir o formulário
		view.setVisible(true);
	}
}