import java.util.Objects;


public class Character extends Creature implements Comparable<Character> {

    Place place;


    public Character(String name) {
        super(name);
        this.name = name;
    }

    public Character(String name, String age) {
        super(name, age);

        this.name = name;
        this.age = age;


    }

    @Override
    public int compareTo(Character o) {
        return this.name.compareTo(o.name);
    }


    @Override
    public boolean equals(Object o) {
        Character ch = (Character) o;
        if (this.name == ch.name) {
            return true;
        } else {
            return false;
        }

    }


    @Override
    public int hashCode() {
        return Objects.hash(place);
    }



    @Override
    public String toString() {
        return "Character{" +
                "place=" + place +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }




    public void walk() {
        System.out.println(" " + this.name + " " + "подошел поближе");
        class Timeless {
            public void go() {                                                     //локальный класс
                System.out.println("Из-за недостатка времени продолжил путь");

            }

        }
        Timeless timeless = new Timeless();
        timeless.go();

    }

    public void watch() {

        System.out.println(this.name + " " + "увидел препятствие");

    }


    public Place getPlace() {

        return this.place;
    }


    public void setPlace(Place p) {
        this.place = p;
        p.add(this);
    }


}



