package lk.ijse.pos.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item implements SuperEntity {

    @Id
    private String itemCode;
    private String Description;
    private int qty;
    private double price;

    public Item() {
    }

    public Item(String itemCode, String description, int qty, double price) {
        this.itemCode = itemCode;
        this.Description = description;
        this.qty = qty;
        this.price = price;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemCode='" + itemCode + '\'' +
                ", Description='" + Description + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
