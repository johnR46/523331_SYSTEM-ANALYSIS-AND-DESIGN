package comeng.sa.no12.demo.repository;
import lombok.*;
import java.util.*;
import javax.persistence.*;
import comeng.sa.no12.demo.entity.ListItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

public interface ListItemRepository extends JpaRepository<ListItem, Long> {

    ListItem findByListItemId(Long listItemId);
}