package hometask2;

public class Address {

    private String city;
    private int code;

    public Address (String city, int code) {
        this.city = city;
        this.code = code;
    }

    public String getCity(){
        return this.city;
    }

    public int getCode(){
        return this.code;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setCode(int code){
        this.code = code;
    }

}
