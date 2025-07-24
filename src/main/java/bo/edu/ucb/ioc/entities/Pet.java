package bo.edu.ucb.ioc.entities;

import java.util.Date;

// Plain Old Java Object
public class Pet {
    private int petId;
    private String name;
    private Date dateOfBirth;
    private Double price;
    private PetType petType;
    public Pet() {
    }

    
    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + petId;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pet other = (Pet) obj;
        if (petId != other.petId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Pet [petId=" + petId + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", price=" + price + "]";
    }


    public PetType getPetType() {
        return petType;
    }


    public void setPetType(PetType petType) {
        this.petType = petType;
    }

      
}
