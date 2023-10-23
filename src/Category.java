public class Category {
    private String name;

    public Category() {
        this.name = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Błąd: Nazwa kategorii nie może być pusta ani null.");
        }
    }

    // Przesłonięta metoda toString()
    @Override
    public String toString() {
        return "Category [name=" + name + "]";
    }

}