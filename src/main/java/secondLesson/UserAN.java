package secondLesson;

public class UserAN {
    private Address address;
    private String name;

    public UserAN(Address address, String name){
        this.address = new Address(address.getCity(), address.getCode());
        this.name = name;

    }

    public Address getAddress() {
        return new Address(address.getCity(), address.getCode()) ;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "UserAN{" +
                "address=" + address +
                ", name='" + name + '\'' +
                '}';
    }
}
