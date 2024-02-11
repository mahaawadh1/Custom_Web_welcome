package com.letcode.SecureBankSystem.entity;


import org.springframework.boot.autoconfigure.condition.ConditionalOnCloudPlatform;

import javax.persistence.*;

@Entity
@Table(name = "bank_account")
public class BankAccountEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double balance;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
