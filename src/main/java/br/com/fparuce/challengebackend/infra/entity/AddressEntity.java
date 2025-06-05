package br.com.fparuce.challengebackend.infra.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "address")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "number")
    private String number;

    @Column(name = "complement")
    private String complement;

    @Column(name = "district")
    private String district;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "state_initials")
    private String stateInitials;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "country")
    private String country;
}
