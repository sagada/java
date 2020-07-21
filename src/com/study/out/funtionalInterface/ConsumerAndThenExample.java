package com.study.out.funtionalInterface;


import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerAndThenExample {
    public static void main(String[] args) {
        Consumer<Member> consumerA = m -> {
            System.out.println("Consumer A  : " + m.getName());
        };

        Consumer<Member> consumerB = m -> {
            System.out.println("Consumer B  : " + m.getId());
        };

        Consumer<Member> consumerAB = consumerA.andThen(consumerB);
        consumerAB.accept(new Member("홍길동", "ysh", null));


        Function<Member, Address> functionA;
        Function<Address, String> functionB;
        Function<Member, String> functionAB;

        functionA = Member::getAddress;
        functionB = Address::getCity;

        functionAB = functionA.andThen(functionB);

        String city;

        city = functionAB.apply(
                new Member("홍길동", "hong", new Address("한국","서울"))
        );

        System.out.println("거주 도시 : " + city);


    }
}

class Member
{
    private String name;
    private String id;
    private Address address;

    public Member(String name, String id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
class Address
{
    private String country;
    private String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}