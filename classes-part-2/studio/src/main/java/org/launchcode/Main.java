package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem menuItem1 = new MenuItem(11.99,"Butter Chicken","main cource",false);
        MenuItem menuItem2 = new MenuItem(15.99, "French toast","main course",false);
        MenuItem menuItem3 = new MenuItem(13.99,"PanCake","main course", true);

        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        menuItems.add(menuItem3);

        Menu menu = new Menu(LocalDate.now(),menuItems);

        //Print the entire, updated menu to the screen.
        System.out.println("Menu Items(Last Updated on:"+menu.getLastUpdated()+"):\n");
        for (MenuItem item : menu.getItems()) {
            System.out.println(item.getPrice()+ "$ -" + item.getDescription() + " - " + item.getCategory()+ " -Newly added? " + item.isNew());
        }

        //Print an individual menu item to the screen.
        System.out.println("");


    }
}
