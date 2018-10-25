package comeng.sa.no12.demo.repository;
import lombok.*;
import java.util.*;
import javax.persistence.*;
import comeng.sa.no12.demo.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

public interface ItemRepository extends JpaRepository<Item, Long> {

    Item findByItemId(Long ItemId);
}