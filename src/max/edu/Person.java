package max.edu;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private String firstName;
    private String midName;
    private String lastName;
    private String city;
    private String street;
    private String houseNumber;
    private String phoneNumber;
    private LocalDate dateOfBirth;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person" + '\n' +
                " firstName = " + midName + '\n' +
                " lastName = " + lastName + '\n' +
                " city = " + city + '\n' +
                " street = " + street + '\n' +
                " houseNumber = " + houseNumber + '\n' +
                " phoneNumber = " + phoneNumber + '\n' +
                " dateOfBirth = " + dateOfBirth + '\n'
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(midName, person.midName) && Objects.equals(lastName, person.lastName) && Objects.equals(city, person.city) && Objects.equals(street, person.street) && Objects.equals(houseNumber, person.houseNumber) && Objects.equals(phoneNumber, person.phoneNumber) && Objects.equals(dateOfBirth, person.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, midName, lastName, city, street, houseNumber, phoneNumber, dateOfBirth);
    }
}

