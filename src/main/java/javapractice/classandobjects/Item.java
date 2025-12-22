package javapractice.classandobjects;

public class Item {

    /*
        Create a custom Java class called Item with the following attributes:
        name: Name of the item.
        unitPrice: Price per unit of the item.
        quantity: The number of units of the item.

        The Item class should have the following actions(methods):
        setInfo(): This method sets all the fields( name, unitPrice, quantity) of an Item object.
        calcCost(): This method calculates and returns the total cost of the item based on its unit price and quantity.
        toString(): When you use an Item object in a print statement, it should display the full information of the item object.
     */

    public String name;
    public double unitPrice;
    public int quantity;

    public void setInfo(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(double unitPrice, int quantity) {
        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total= $" + calcCost(unitPrice,quantity) +
                '}';
    }
}
