public class Country {
    private String name;
    private double area;
    private int population;
    private String language;

    public Country(String name, double area, int population, String language) {
        this.name = name;
        this.area = area;
        this.population = population;
        this.language = language;

    }

    public Country() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", population=" + population +
                ", language='" + language + '\'' +
                '}';
    }
}

