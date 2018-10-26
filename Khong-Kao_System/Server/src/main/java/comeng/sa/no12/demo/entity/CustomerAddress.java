package comeng.sa.no12.demo.entity;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.*;
import java.util.*;

@Entity
@Data
@Table(name = "customerAddress")
public class CustomerAddress {
    @Id
    @SequenceGenerator(name = "customerAddress_seq", sequenceName = "customerAddress_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customerAddress_seq")

    private Long addressId;
    private String customerAddress;
    private String customerAddress2;
    private String district;
    private String city;
    private String country;
    private Integer zipCode;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "provinceId", insertable = true)
    private Province province;

    private CustomerAddress() {
    }

    public CustomerAddress(Province province, String customerAddress, String customerAddress2, String district,
            String city, Integer zipCode) {
        this.province = province;
        this.customerAddress = customerAddress;
        this.customerAddress2 = customerAddress2;
        this.district = district;
        this.city = city;
        this.zipCode = zipCode;

    }

}
