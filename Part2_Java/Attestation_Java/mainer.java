package Part2_Java.Attestation_Java;

import java.util.*;

public class mainer {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>(Arrays.asList(
            new Notebook("Asus", 2, 512, "Windows", "Black", "Geforce"),
            new Notebook("HP", 4, 256, "Windows", "Silver", "Radeon"),
            new Notebook("Apple", 8, 512, "macOS", "Grey", "Geforce"),
            new Notebook("MSI", 16, 1024, "Windows", "Blue", "Geforce RTX"),
            new Notebook("Lenovo", 32, 256, "Linux", "White", "Radeon")));

        Map <String, String> filters = getFiltersFromUser();
        Set <Notebook> filteredNotebooks = filterNotebooks(notebooks, filters);  // Фильтрует ноутбуки на основе критериев из filters

        System.out.println("Результат фильтрации: ");
        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook);
        }
    }

    private static Map <String, String> getFiltersFromUser() {
        Scanner scanner = new Scanner(System.in);
        Map <String, String> filters = new HashMap<>();

        System.out.println("Введите цифру для фильтрации! ");
        System.out.println("1 - RAM");
        System.out.println("2 - Storage");
        System.out.println("3 - Operation System");
        System.out.println("4 - Color");
        System.out.println("5 - VC");
        System.out.println("Введите 'show' чтобы получить результаты работы фильтра");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("show")) break;

            switch (input) {
                case "1":
                    System.out.print("Enter minimum RAM: ");
                    filters.put("ram", scanner.nextLine());
                    break;
                case "2":
                    System.out.print("Enter minimum storage: ");
                    filters.put("storage", scanner.nextLine());
                    break;
                case "3":
                    System.out.print("Enter operating system: ");
                    filters.put("os", scanner.nextLine());
                    break;
                case "4":
                    System.out.print("Enter color: ");
                    filters.put("color", scanner.nextLine());
                    break;
                case "5":
                    System.out.print("Enter VC name: ");
                    filters.put("VC", scanner.nextLine());
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
            }
        }
        return filters;
    }

    private static Set<Notebook> filterNotebooks(Set<Notebook> notebooks, Map<String, String> filters) {
        Set<Notebook> filteredNotebooks = new HashSet<>(notebooks);

        for (Map.Entry<String, String> filter : filters.entrySet()) {
            switch (filter.getKey()) {
                case "ram":
                    int minRam = Integer.parseInt(filter.getValue());
                    filteredNotebooks.removeIf(notebook -> notebook.getRam() < minRam);
                    break;
                case "storage":
                    int minStorage = Integer.parseInt(filter.getValue());
                    filteredNotebooks.removeIf(notebook -> notebook.getStorage() < minStorage);
                    break;
                case "os":
                    String os = filter.getValue();
                    filteredNotebooks.removeIf(notebook -> !notebook.getOs().equalsIgnoreCase(os));
                    break;
                case "color":
                    String color = filter.getValue();
                    filteredNotebooks.removeIf(notebook -> !notebook.getColor().equalsIgnoreCase(color));
                    break;
                case "VC":
                    String videocard = filter.getValue();
                    filteredNotebooks.removeIf(notebook -> !notebook.getvideocard().equalsIgnoreCase(videocard));
                    break;
            }
        }
        return filteredNotebooks;
    }
}
