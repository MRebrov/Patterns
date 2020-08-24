/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testMenu;

import iterator_composite_menu.Menu;
import iterator_composite_menu.MenuComponent;
import iterator_composite_menu.MenuItem;
import iterator_composite_menu.Waitress;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A702906
 */
public class TestMenu {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Desser of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                2.99));
        dinerMenu.add(new MenuItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99));
        dinerMenu.add(new MenuItem("Soup of the day",
                "Soup of the day with a side of potato salad",
                false,
                3.29));
        dinerMenu.add(new MenuItem("Hotdog",
                "A hot dog, with sauerkraut, relish, onions, topped with cheese",
                false,
                3.05));

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles",
                "Waffles, with your choice blueberries or strawberries",
                true,
                3.59));

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries",
                "Veggie Burger on a whole wheat bun, lettuce, tomato, and fries",
                true,
                3.99));
        cafeMenu.add(new MenuItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false,
                3.69));
        cafeMenu.add(new MenuItem("Burrito",
                "A large burrito, with a whole pinto beans, salsa, guacamole",
                true,
                4.29));
        
        dessertMenu.add(new MenuItem("Apple Pie",
                "Apple pie with flakey crust, topped with vanilla icecream",
                true,
                1.59));
        
        dinerMenu.add(dessertMenu);
                
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        
        waitress.printVegetarianMenu();
    }
}
