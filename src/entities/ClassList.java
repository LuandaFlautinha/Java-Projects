package entities;

public class ClassList {
    private Integer id;
    private String name;
    private Double salary;

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSalarary(Double salary){
        this.salary = salary;
    }
    public Double getSalary(){
        return salary;
    }

    public ClassList(){

    }
    public ClassList(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void addSalary(Double percentage){  
        this.salary += this.salary * percentage/100;
    }

    public String toString(){
        return id+", "+name+", "+String.format("%.2f", salary);
    }
}
