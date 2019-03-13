package com.tasif.visitorpattern;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);
}
