package ex14.Prgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Color{
    String name;
    String hexaCode;

    public Color(String name, String hexaCode) {
        this.name = name;
        this.hexaCode = hexaCode;
    }

    public String getName() {
        return name;
    }

    public String getHexaCode() {
        return hexaCode;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                ", hexaCode='" + hexaCode + '\'' +
                '}';
    }
}

public class Ex05 {
    public static void main(String[] args) {
        List<Color> list = new ArrayList<>();
        list.add(new Color("Red", "FF0000"));
        list.add(new Color("Blue", "FE0000"));
        list.add(new Color("Yellow", "FA0000"));

        list = list.stream().sorted(Comparator.comparing(Color::getName)).collect(Collectors.toList());
        System.out.println(list);
    }
}
