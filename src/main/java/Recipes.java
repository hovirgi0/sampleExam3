import java.util.ArrayList;
import java.util.Scanner;

public class Recipes {
    public static void main(String[] args) {
        //
        Goods tukortojas = new Goods("\"Tükörtojás\"", "1. Az olajat egy serpenyőben kellőképp felforrósítjuk és óvatosan beleütjük" +
                " a tojásokat.\r\n2. Keverés nélkül készre sütjük, míg a tojásfehérje megsül, de a sárgája" +
                " folyós marad.\r\n3. Hogy jobban átsüljön, a tojásfehérjét egy villa segítségével óvatosan" +
                " megmozgathatjuk.");
        tukortojas.setDesc("\"1. Az olajat egy serpenyőben kellőképp felforrósítjuk és óvatosan beleütjük\" +\n" +
                "                \" a tojásokat.\\r\\n2. Keverés nélkül készre sütjük, míg a tojásfehérje megsül, de a sárgája\" +\n" +
                "                \" folyós marad.\\r\\n3. Hogy jobban átsüljön, a tojásfehérjét egy villa segítségével óvatosan\" +\n" +
                "                \" megmozgathatjuk.\"");

        System.out.println(tukortojas.getName()); //recept neve
        System.out.println(tukortojas.getDesc()); //recept leírása
        System.out.println(Recipes.delete());//elem törlése metódus

        //UpdateRecipes leszármazott osztály
        UpdateRecipes updateRecipes = new UpdateRecipes();
        updateRecipes.addGoods(tukortojas);
       // System.out.println(updateRecipes.Add());
        updateRecipes.update("\"Tükörtojás\"", "1. Az olajat egy serpenyőben kellőképp felforrósítjuk és óvatosan beleütjük" +
                " a tojásokat.\r\n2. Keverés nélkül készre sütjük, míg a tojásfehérje megsül, de a sárgája" +
                " folyós marad.\r\n3. Hogy jobban átsüljön, a tojásfehérjét egy villa segítségével óvatosan" +
                " megmozgathatjuk."); //update metódus módosítja a Recipes objektumban tárolt elemeket
    }
    protected static ArrayList<Goods> goodsList = new ArrayList<>();

    public static String Add() { //új recept hozzáadása
        StringBuilder builder = new StringBuilder();
        for (Goods goods : goodsList) {
            builder.append(goods.getName()).append(" ").append(goods.getDesc()).append("\r\n");
        }
        return builder.toString();
    }

    public static String delete() { //adott elem törlése
        String removedStr = new String();
        for (Goods goods : goodsList) {
            removedStr = String.valueOf(goodsList.remove(getItems()));
        }
        return removedStr;
    }

    public static String getItems() { //String formátumban visszaadja az aktuálisan tárolt receptek adatait) metódussal
        String Items = new String();
        for (Goods goods : goodsList) {
            Items += goods.getDesc();
        }
        return Items;
    }

}
