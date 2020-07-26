package main;

import com.github.javafaker.Faker;

public class Box {

    private Integer value;
    public Box () {}
    public Box (Integer value) { setValue(value); }
    public Box(boolean random) {
    	if (random) {
    		setValue( new Faker().number().numberBetween(1, 100) );
    	}
    }
    public Integer  getValue() { return value; }
    public void setValue(Integer value) { this.value = value; }
}
