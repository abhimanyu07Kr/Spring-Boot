package in.abhi.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.abhi.Address;

public interface AddRepo extends JpaRepository<Address, Integer>{

}
