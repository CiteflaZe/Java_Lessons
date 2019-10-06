package hometask9;

public class Address implements Cloneable{
    private String city;
    private int code;

    public Address(String city, int code) {
        this.city = city;
        this.code = code;
    }

    private Address(Address address){
        this.city = address.city;
        this.code = address.code;
    }

//    public Address clone(){
//        return new Address(this);
//    }

    @Override
    protected Address clone() throws CloneNotSupportedException {
        super.clone();
        return new Address(this);
    }

    public String getCity() {
        return city;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", code=" + code +
                '}';
    }
}
