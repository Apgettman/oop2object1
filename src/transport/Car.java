package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private float engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int numberOfSeats;
    private boolean changeTires;
    private final Key key;
    private final Insurance insurance;

    public Car(String brand, String model, float engineVolume, String color, int productionYear,
               String productionCountry, String transmission, String bodyType, String regNumber,
               int numberOfSeats, String changeTires, Key key, Insurance insurance) {

        this.brand = ValidationUtils.validOrDefault(brand, "default");
        this.model = ValidationUtils.validOrDefault(model, "default");
        this.productionYear = productionYear >= 0 ? productionYear : 2020;
        this.productionCountry = ValidationUtils.validOrDefault(productionCountry, "default");
        this.bodyType = ValidationUtils.validOrDefault(bodyType, "default");
        this.numberOfSeats = Math.max(numberOfSeats, 2);
        this.key = key;
        this.insurance = insurance;
        setEngineVolume(engineVolume);
        setColor(color);
        setTransmission(transmission);
        setRegNumber(regNumber);
        setChangeTires(changeTires);

    }

    public void setSeasonTires() {
        int currentMonth = LocalDate.now().getMonthValue();
        this.changeTires = currentMonth <= 4 || currentMonth >= 11;
    }

    public boolean isNumberValid() {
        if (this.regNumber.length() != 9) {
            return false;
        }
        char[] regNumberChars = this.regNumber.toCharArray();
        return isNumberLetter(regNumberChars[0]) && isNumber(regNumberChars[1]) && isNumber(regNumberChars[2])
                && isNumber(regNumberChars[3]) && isNumberLetter(regNumberChars[4]) && isNumberLetter(regNumberChars[5])
                && isNumber(regNumberChars[6]) && isNumber(regNumberChars[7]) && isNumber(regNumberChars[8]);
    }

    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    private boolean isNumberLetter(char symbol) {
        String allowedSymbols = "АВЕКМНОРСТУХ";
        return allowedSymbols.contains("" + symbol);
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setChangeTires(boolean changeTires) {
        this.changeTires = changeTires;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume > 0.0f ? engineVolume : 1.5f;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = ValidationUtils.validOrDefault(color, "Черный");
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = ValidationUtils.validOrDefault(transmission, "default");
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = ValidationUtils.validOrDefault(regNumber, "default");
        ;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isChangeTires() {
        return changeTires;
    }

    public void setChangeTires(String changeTires) {
        this.changeTires = Boolean.parseBoolean(changeTires);
    }

    public String toString() {
        return "Автомобиль{" + "Марка: " + brand + '\'' +
                ", Модель: " + model + '\'' +
                ", Объем: " + engineVolume + '\'' +
                ", Цвет: " + color + '\'' +
                ", Год выпуска: " + productionYear + '\'' +
                ", ГРЗ: " + regNumber + '\'' +
                ", Страна производителя: " + productionCountry + '\'' + '}';
    }

    public static class Key {

        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public Key getKey() {
        return key;
    }


    public static class Insurance {

        private final LocalDate validUntil;
        private final float cost;
        private final String number;

        public Insurance(LocalDate validUntil, float cost, String number) {
            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(10);
            this.cost = Math.max(cost, 1f);
            this.number = ValidationUtils.validOrDefault(number, "default");
        }

        public boolean isNumberValid() {
            return number.length() == 9;
        }
        public boolean isInsuranceValid() {
            return LocalDate.now().isBefore(this.validUntil);
        }
    }
}





