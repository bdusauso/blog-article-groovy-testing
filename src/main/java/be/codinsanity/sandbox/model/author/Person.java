package be.codinsanity.sandbox.model.author;

import org.joda.time.DateMidnight;

import java.util.HashSet;
import java.util.Set;

/**
 * author : Bruno Dusausoy
 * A simple Javabean representing a person.
 */
public class Person {

    private String firstname;
    private String lastname;
    private String email;
    private DateMidnight birthDate;
    private Set<Address> addresses = new HashSet<>();

    public Person() {}

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public DateMidnight getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(DateMidnight birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    static class Address {
        private String street;
        private String zipCode;
        private String city;
        private String country;

        String getStreet() {
            return street;
        }

        void setStreet(String street) {
            this.street = street;
        }

        String getCity() {
            return city;
        }

        void setCity(String city) {
            this.city = city;
        }

        String getCountry() {
            return country;
        }

        void setCountry(String country) {
            this.country = country;
        }

        String getZipCode() {
            return zipCode;
        }

        void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Address address1 = (Address) o;

            if (street != null ? !street.equals(address1.street) : address1.street != null) return false;
            if (city != null ? !city.equals(address1.city) : address1.city != null) return false;
            if (country != null ? !country.equals(address1.country) : address1.country != null) return false;
            if (zipCode != null ? !zipCode.equals(address1.zipCode) : address1.zipCode != null) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = street != null ? street.hashCode() : 0;
            result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
            result = 31 * result + (city != null ? city.hashCode() : 0);
            result = 31 * result + (country != null ? country.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Address{");
            sb.append("street='").append(street).append('\'');
            sb.append(", zipCode='").append(zipCode).append('\'');
            sb.append(", city='").append(city).append('\'');
            sb.append(", country='").append(country).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!email.equals(person.email)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("firstname='").append(firstname).append('\'');
        sb.append(", lastname='").append(lastname).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
