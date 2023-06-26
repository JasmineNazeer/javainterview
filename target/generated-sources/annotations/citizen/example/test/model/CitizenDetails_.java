package citizen.example.test.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CitizenDetails.class)
public abstract class CitizenDetails_ {

	public static volatile SingularAttribute<CitizenDetails, String> address;
	public static volatile SingularAttribute<CitizenDetails, String> phone;
	public static volatile SingularAttribute<CitizenDetails, String> name;
	public static volatile SingularAttribute<CitizenDetails, LocalDate> dateOfBirth;
	public static volatile SingularAttribute<CitizenDetails, Long> id;

	public static final String ADDRESS = "address";
	public static final String PHONE = "phone";
	public static final String NAME = "name";
	public static final String DATE_OF_BIRTH = "dateOfBirth";
	public static final String ID = "id";

}

