package com.acomerci.offering.model.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-07-01T18:46:51.077-0300")
@StaticMetamodel(Day.class)
public class Day_ {
	public static volatile SingularAttribute<Day, Integer> id;
	public static volatile SingularAttribute<Day, String> name;
	public static volatile ListAttribute<Day, BusinessDay> businessDays;
}
