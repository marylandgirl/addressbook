package com.example.addressbook;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface AddressRepository extends CrudRepository<Address,Long> {
//    List<Address>  findByLastName(String lastName);
    Iterable <Address> findAllByLastNameContainingIgnoreCase(String search);
}
