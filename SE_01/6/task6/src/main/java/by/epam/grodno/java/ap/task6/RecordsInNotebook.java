package by.epam.grodno.java.ap.task6;

/**
 * Class describing work with records in notebook
 * @author Aliaksei
 *
 */
public class RecordsInNotebook {
	public static void main(String[] arg) {
		Notebook notebook = new Notebook();
		String add[], del[], edit[], all[][];
		add = new String[1];
		del = new String[0];
		edit = new String[1];
		all = new String[10][add.length];
		notebook.addRecord(add);
		notebook.deleteRecord(del);
		notebook.editRecord(edit);
		notebook.viewAllRecord(all);
	}

}
