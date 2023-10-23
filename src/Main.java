public class Main {
    public static void main(String[] args) {
        Category category = new Category();

        category.setName("Elektronika");

        System.out.println("Informacje o kategorii:");
        System.out.println(category.toString());

        System.out.println("\nPróba ustawienia wartości null jako nazwy kategorii:");
        try {
            category.setName(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
        //
        System.out.println("\nPróba ustawienia pustego ciągu znaków jako nazwy kategorii:");
        try {
            category.setName("");
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        }

        System.out.println("\nInformacje o kategorii po próbach zmian:");
        System.out.println(category.toString());
    }
}
