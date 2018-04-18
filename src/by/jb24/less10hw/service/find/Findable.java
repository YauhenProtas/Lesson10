package by.jb24.less10hw.service.find;

import java.util.List;

import by.jb24.less10hw.entity.PrintedEdition;

public interface Findable {
	List<PrintedEdition> find(List<PrintedEdition> units);
}
