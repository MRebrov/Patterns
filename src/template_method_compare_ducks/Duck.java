/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template_method_compare_ducks;

/**
 *
 * @author MRebrov
 */
public class Duck implements Comparable {

    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weights " + weight;
    }

    @Override
    public int compareTo(Object o) {
        Duck otherDuck = (Duck) o;

        if (this.weight == otherDuck.weight) {
            return 0;
        } else if (this.weight > otherDuck.weight) {
            return 1;
        } else {
            return -1;
        }

    }

}
