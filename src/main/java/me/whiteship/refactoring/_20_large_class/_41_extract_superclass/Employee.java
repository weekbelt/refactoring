package me.whiteship.refactoring._20_large_class._41_extract_superclass;

public class Employee extends Party {

    public Employee(String name) {
        super(name);
    }

    private Integer id;

    private double monthlyCost;

    public Integer getId() {
        return id;
    }

    @Override
    public double monthlyCost() {
        return monthlyCost;
    }
}
