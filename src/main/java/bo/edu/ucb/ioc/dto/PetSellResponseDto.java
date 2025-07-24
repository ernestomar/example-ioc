package bo.edu.ucb.ioc.dto;

// Data Transfer Object
public class PetSellResponseDto {
    private int petId;
    private PaymentStatus paymetStatus;
    private Double finalPrice;
    public PetSellResponseDto() {
    }
    public int getPetId() {
        return petId;
    }
    public void setPetId(int petId) {
        this.petId = petId;
    }
    public PaymentStatus getPaymetStatus() {
        return paymetStatus;
    }
    public void setPaymetStatus(PaymentStatus paymetStatus) {
        this.paymetStatus = paymetStatus;
    }
    public Double getFinalPrice() {
        return finalPrice;
    }
    public void setFinalPrice(Double finalPrice) {
        this.finalPrice = finalPrice;
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
        PetSellResponseDto other = (PetSellResponseDto) obj;
        if (petId != other.petId)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "PetSellResponseDto [petId=" + petId + ", paymetStatus=" + paymetStatus + ", finalPrice=" + finalPrice
                + "]";
    }

    
}
