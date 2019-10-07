package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Martin Frederiksen
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Company.deleteAllRows", query = "DELETE from Company"),
    @NamedQuery(name = "Company.findAll", query = "SELECT c FROM Company c")
})
public class Company extends InfoEntity implements Serializable {

    private String name;
    private String description;
    private String cvr;
    private int employeeCount;
    private long marketValue;

    public Company() {
    }

    public Company(String name, String description, String cvr, int employeeCount, long marketValue, InfoEntity infoEntity) {
        super(infoEntity.getEmail(), infoEntity.getPhones(), infoEntity.getAddress());
        this.name = name;
        this.description = description;
        this.cvr = cvr;
        this.employeeCount = employeeCount;
        this.marketValue = marketValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCvr() {
        return cvr;
    }

    public void setCvr(String cvr) {
        this.cvr = cvr;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public long getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(long marketValue) {
        this.marketValue = marketValue;
    }
}
