package in.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.ChildrenEntity;

public interface ChildrenRepo extends JpaRepository<ChildrenEntity, Serializable>{


}
