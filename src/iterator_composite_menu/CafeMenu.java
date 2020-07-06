/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator_composite_menu;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author MRebrov
 */
public class CafeMenu {

    Map menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries",
                "Veggie Burger on a whole wheat bun, lettuce, tomato, and fries",
                true,
                3.99);
        addItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false,
                3.69);
        addItem("Burrito",
                "A large burrito, with a whole pinto beans, salsa, guacamole",
                true,
                4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Map getItems() {
        return new Hashtable(menuItems);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }

}
