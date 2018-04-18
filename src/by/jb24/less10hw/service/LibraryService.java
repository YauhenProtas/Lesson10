package by.jb24.less10hw.service;

import java.util.List;

import by.jb24.less10hw.entity.Library;
import by.jb24.less10hw.entity.PrintedEdition;
import by.jb24.less10hw.service.find.Findable;

public class LibraryService {
	
	public List<PrintedEdition> find(Library library, Findable findMatcher){
		List<PrintedEdition> units = library.getUnits();
		List<PrintedEdition> hasFined = null;
		hasFined = findMatcher.find(units);
		return hasFined;
	}
}
