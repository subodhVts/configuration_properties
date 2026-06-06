package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Emplyee;

public interface StudentRepo extends JpaRepository<Emplyee, Integer> {

}
