package base.department;

import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long>{

    Department findDeparmentByPrefix(String prefix);
}
