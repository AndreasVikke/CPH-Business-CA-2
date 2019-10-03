package dto;

import entities.Address;

/**
 *
 * @author andreas
 */
public class AddressDTO {
    private long id;
    private String street;
    private CityInfoDTO cityInfo;

    public AddressDTO(long id, String street, CityInfoDTO cityInfo) {
        this.id = id;
        this.street = street;
        
        this.cityInfo = new CityInfoDTO(cityInfo.getId(), cityInfo.getCity(), cityInfo.getZip());
    }
    
    public AddressDTO(Address address) {
        this.id = address.getId();
        this.street = address.getStreet();
        
        this.cityInfo = new CityInfoDTO(address.getCity());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public CityInfoDTO getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfoDTO cityInfo) {
        this.cityInfo = cityInfo;
    }
}
