package bo.edu.ucb.ioc.dto;

public class PetSellRequestDto {
    private int petId;
    private int qtty;
    
    public PetSellRequestDto() {
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public int getQtty() {
        return qtty;
    }

    public void setQtty(int qtty) {
        this.qtty = qtty;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + petId;
        result = prime * result + qtty;
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
        PetSellRequestDto other = (PetSellRequestDto) obj;
        if (petId != other.petId)
            return false;
        if (qtty != other.qtty)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PetSellRequestDto [petId=" + petId + ", qtty=" + qtty + "]";
    }
    
    
    
}
