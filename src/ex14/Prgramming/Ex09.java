package ex14.Prgramming;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Food{
    private String name;
    private boolean isVege;
    private int calories;
    private Type type;
    class Type{
        List<String> type= Arrays.asList("고기", "생선", "기타");
    }

    public Food(String name, boolean isVege, int calories, Type type) {
        this.name = name;
        this.isVege = isVege;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVege() {
        return isVege;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }
}

public class Ex09 {
    public static void main(String[] args) {
        List<Food> list= new ArrayList<>();
        //list.add(new Food("연어구이", true, 250, ));
    }

}
