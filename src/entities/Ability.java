package entities;

public class Ability {
    private int height = -1;
    private double weight = -1;
    private int upperStrength = -1;
    private int lowerStrength = -1;
    private int coreStrength = -1;
    private int cardiopulmonaryFunction = -1;
    private int flexibility = -1;

    public Ability() {
    }
    public Ability(int height, double weight, int upperStrength, int lowerStrength, int coreStrength, int cardiopulmonaryFunction, int flexibility) {
        this.height = height;
        this.weight = weight;
        this.upperStrength = upperStrength;
        this.lowerStrength = lowerStrength;
        this.coreStrength = coreStrength;
        this.cardiopulmonaryFunction = cardiopulmonaryFunction;
        this.flexibility = flexibility;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getUpperStrength() {
        return upperStrength;
    }

    public void setUpperStrength(int upperStrength) {
        this.upperStrength = upperStrength;
    }

    public int getLowerStrength() {
        return lowerStrength;
    }

    public void setLowerStrength(int lowerStrength) {
        this.lowerStrength = lowerStrength;
    }

    public int getCoreStrength() {
        return coreStrength;
    }

    public void setCoreStrength(int coreStrength) {
        this.coreStrength = coreStrength;
    }

    public int getCardiopulmonaryFunction() {
        return cardiopulmonaryFunction;
    }

    public void setCardiopulmonaryFunction(int cardiopulmonaryFunction) {
        this.cardiopulmonaryFunction = cardiopulmonaryFunction;
    }

    public int getFlexibility() {
        return flexibility;
    }

    public void setFlexibility(int flexibility) {
        this.flexibility = flexibility;
    }
}
