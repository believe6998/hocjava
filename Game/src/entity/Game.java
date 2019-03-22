package entity;

public class Game {
    private String name;
    private String description;
    private double price;
    private String releaseAt;
    private String website;

    public Game() {
    }

    public Game(String name, String description, double price, String releaseAt, String website) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.releaseAt = releaseAt;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getReleaseAt() {
        return releaseAt;
    }

    public void setReleaseAt(String releaseAt) {
        this.releaseAt = releaseAt;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", releaseAt='" + releaseAt + '\'' +
                ", website='" + website + '\'' +
                '}';
    }

}


