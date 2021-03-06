package com.COMP373.VisitorPattern;

// visitor that implements the visitor interface
// every item has its own logic to calculate the cost

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public int visit(Book book) {
        int cost;
        if(book.getPrice() > 50) {
            cost = book.getPrice() - 5;
        }
        else
            cost = book.getPrice();
            System.out.println("Book ISBN: " + book.getIsbnNum() + " cost =" + cost);
            return cost;
        }

        @Override
        public int visit(Fruit fruit) {
            int cost = fruit.getPricePerLb() * fruit.getWeight();
            System.out.println(fruit.getName() + "cost = " + cost);
            return cost;
    }
}

