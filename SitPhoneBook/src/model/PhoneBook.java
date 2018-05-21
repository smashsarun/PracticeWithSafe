
package model;

public class PhoneBook {
    private String phoneNum;
    private String nickname;
    private int gen;

    public PhoneBook(String phoneNum, String nickname, int gen) {
        this.phoneNum = phoneNum;
        this.nickname = nickname;
        this.gen = gen;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getGen() {
        return gen;
    }

    public void setGen(int gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "phoneBook{" + "phoneNum=" + phoneNum + ", nickname=" + nickname + ", gen=" + gen + '}';
    }
    
    
}
