public class Person {
    public static String name;
    public static float height;
    public static float weight;
    public float bmi;

    public Person() {

    }

    public float calculator() {
        return (weight / (height * height));
    }

    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public float getBmi() {
        return bmi;
    }

    public Person(String name, float height, float weight, float bmi) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.bmi = bmi;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", height=" + height + ", weight=" + weight + ", bmi=" + bmi + '}';
    }
}
