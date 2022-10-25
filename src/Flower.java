import transport.ValidationUtils;

public class Flower {

     String name;
    private String flowerColor;
    private String country;
    private float cost;
    private int lifeSpan;

    public Flower (String name, String flowerColor, String country, float cost, int lifeSpan) {
        setName(name);
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
            this.flowerColor = ValidationUtils.validOrDefault(flowerColor, "Белый");
        }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
            this.country = ValidationUtils.validOrDefault(country, "Россия");
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
            this.cost = Math.max(cost, 1);
    }
    public int getLifeSpan() {
        return lifeSpan;
    }
    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan > 0 ? lifeSpan : 3;
    }
    public String toString() {
        return "Цветок{" + "Название: " + name + '\'' +
                ", Цвет: " + flowerColor + '\'' +
                ", Страна: " + country + '\'' +
                ", Цена: " + cost + '\'' +
                ", Срок стояния'" + lifeSpan + '\'' + '}';
    }
}
