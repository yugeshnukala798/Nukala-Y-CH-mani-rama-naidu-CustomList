package com.epam.CustomList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        CustomList<Integer> list = new CustomList<>();
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(9);
        LOGGER.debug(list);
        list.remove(3);
        LOGGER.debug(list);
        LOGGER.debug(list.get(0));
        LOGGER.debug(list.get(1));
        LOGGER.debug(list.size());
        CustomList<String> list2=new CustomList<>();
        list2.add("apple");
        list2.add("ball");
        list2.add("cat");
        list2.add("dog");
        LOGGER.debug(list2);
        LOGGER.debug(list.get(0));
        LOGGER.debug(list2.size());
        list2.remove(2);
        LOGGER.debug(list2);
    }
}