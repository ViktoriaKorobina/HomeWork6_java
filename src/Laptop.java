/*-Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
методы. Реализовать в java.
- Создать множество ноутбуков.
- Написать метод, который будет запрашивать у пользователя критерий (или критерии)
фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
- Далее нужно запросить минимальные значения для указанных критериев - сохранить
параметры фильтрации можно также в Map.
- Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
условиям.*/


import java.util.*;

public class Laptop {

    private int RAM;
    private int hardDriveCapacity;
    private int operatingSystem;
    private String color;
    private  String name;

    public Laptop(int RAM, int hardDriveCapacity, int operatingSystem, String color, String name) {
        this.RAM = RAM;
        this.hardDriveCapacity = hardDriveCapacity;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.name = name;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHardDriveCapacity() {
        return hardDriveCapacity;
    }

    public void setHardDriveCapacity(int hardDriveCapacity) {
        this.hardDriveCapacity = hardDriveCapacity;
    }

    public int getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(int operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Фирма: " + name + ", " +
                "ОЗУ = " + RAM + ", " +
                ", Объем жесткого диска = " + hardDriveCapacity +
                ", Версия Windows: " + operatingSystem +
                ", цвет = '" + color + '\'' +
                '}' + "\n";
    }

    public static HashMap<String, Integer> FilterParam(){
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите минимальные параметры фильтрации: ");
        System.out.println("Введите объем ОЗУ");
        int param1 = scanner.nextInt();
        System.out.println("Введите объем жесткого диска");
        int param2 = scanner.nextInt();
        System.out.println("Введите версия Windows");
        int param3 = scanner.nextInt();
        map.put("RAM", param1);
        map.put("Hard drive", param2);
        map.put("Windows", param3);
        return (HashMap<String, Integer>) map;
    }

    public static ArrayList<Laptop> filterResult(HashSet<Laptop> hashSet){
        Map<String, Integer> hashMap = FilterParam();
        List<Laptop> laptopFilter = new ArrayList<>();
        for (Laptop laptop: hashSet){
            if(laptop.RAM >= hashMap.get("RAM")
                    && laptop.hardDriveCapacity >= hashMap.get("Hard drive")
                    && laptop.operatingSystem >= hashMap.get("Windows")){
                laptopFilter.add(laptop);
            }
        }
        return (ArrayList<Laptop>) laptopFilter;
    }
}

