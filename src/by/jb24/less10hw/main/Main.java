package by.jb24.less10hw.main;

import java.util.List;

import by.jb24.less10hw.entity.Book;
import by.jb24.less10hw.entity.Library;
import by.jb24.less10hw.entity.Magazine;
import by.jb24.less10hw.entity.PrintedEdition;
import by.jb24.less10hw.service.LibraryService;
import by.jb24.less10hw.service.find.FindByPrice;
import by.jb24.less10hw.service.find.Findable;
import by.jb24.less10hw.view.PrintAsList;
import by.jb24.less10hw.view.Printable;
import by.jb24.less10hw.view.ViewAction;

public class Main {

	public static void main(String[] args) {
		Library myLibrary = new Library();
		
		myLibrary.add(new Book("Java", 300));
		myLibrary.add(new Book("C++", 250));
		myLibrary.add(new Magazine(40, 50));
		
		//myLibrary.remove(new Book("Java", 300));
		
		Findable matcher = new FindByPrice(300);
		
		LibraryService libService = new LibraryService();
		
		List<PrintedEdition> lists = libService.find(myLibrary, matcher);
		
		System.out.println(lists.size());

		ViewAction.print(new PrintAsList(), lists);
	}
	
	
	

}
