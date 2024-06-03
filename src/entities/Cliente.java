package entities;

public class Cliente {
    private int id;
    private String name;
    private double quantityDeposity;
    private double quantityValue;
    private final int taxa = 5;

    public void setQuantityDeposity(double quantityDeposity){
        this.quantityDeposity = quantityDeposity;
    }
    
    public double totalValue(){
        return quantityDeposity + quantityValue;
    }
 
    public Cliente (int id, String name, double quantityDeposity){
        this.id = id;
        this.name = name;
        this.quantityDeposity = quantityDeposity;
    }
    public Cliente(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void addQuantity(double quantity){
        this.quantityDeposity += quantity;
    }
    public void removeQuantity(double quantity){
        double totalWithDraw = quantity + taxa;
        this.quantityDeposity -= totalWithDraw;
    }


    public String toString(){
        return "Acount "
            + id 
            +", Holder: "
            + name
            +", Balance: $ "
            +String.format("%.2f", totalValue());
    }

}

