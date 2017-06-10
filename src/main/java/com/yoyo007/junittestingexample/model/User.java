package com.yoyo007.junittestingexample.model;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author derrek
 * 
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User implements Serializable {
    
    private Long id;
    
    private String firstName;
    
    private String middileInitial;
    
    private String lastName;
    
}
