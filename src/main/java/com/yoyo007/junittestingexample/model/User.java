package com.yoyo007.junittestingexample.model;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name="USER")
public class User implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(name="FIRST_NAME")
    private String firstName;
    
    @Column(name="MIDDLE_INITIAL")
    private String middileInitial;
    
    @Column(name="LAST_NAME")
    private String lastName;
    
    @CreationTimestamp
    @Column(name="CREATE_DATE")
    private Timestamp createDate;
    
}
