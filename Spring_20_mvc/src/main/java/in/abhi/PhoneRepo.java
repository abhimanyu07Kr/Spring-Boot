package in.abhi;

import org.springframework.data.jpa.repository.JpaRepository;

import in.abhi.entity.Phone;

public interface PhoneRepo extends JpaRepository<Phone, Integer>{

}
