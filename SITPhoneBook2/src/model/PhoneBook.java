
package model;

public class PhoneBook {
    private String phoneNumber;
    private String name;
    private int gen;

    public PhoneBook(String phoneNumber, String name, int gen) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.gen = gen;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGen() {
        return gen;
    }

    public void setGen(int gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "PhoneBook{" + "phoneNumber=" + phoneNumber + ", name=" + name + ", gen=" + gen + '}';
    }
    
    
}
