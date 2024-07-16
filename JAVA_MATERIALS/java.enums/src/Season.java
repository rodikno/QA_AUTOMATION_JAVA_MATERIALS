public enum Season {
    SPRING("Весна"),
    SUMMER("Літо"),
    AUTUMN("Осінь"),
    WINTER("Зима");

    private final String translation;

    Season(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}