package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.utng.practice.model.Instance;

public interface InstanceRepository extends JpaRepository<Instance, Long>{

	@Query("select instance from Instance instance")
	public List<Instance> finAll();
}
