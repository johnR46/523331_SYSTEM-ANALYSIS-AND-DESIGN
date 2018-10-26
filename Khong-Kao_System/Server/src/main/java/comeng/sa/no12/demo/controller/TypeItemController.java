
package comeng.sa.no12.demo.controller;

import comeng.sa.no12.demo.entity.TypeItem;
import comeng.sa.no12.demo.repository.TypeItemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
class TypeItemController {
    private TypeItemRepository typeItemRepository;

    public TypeItemController(TypeItemRepository typeItemRepository) {
        this.typeItemRepository = typeItemRepository;
    }

    @GetMapping("/TypeItem-list")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<TypeItem> TypeItemList() {
        return typeItemRepository.findAll().stream().collect(Collectors.toList());
    }

    @GetMapping("/TypeItem/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public TypeItem TypeItem(@PathVariable("id") Long id) {
        return typeItemRepository.findByTypeId(id);
    }

    @PostMapping("/TypeItem-insert/{id}/nametype/{nametype}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Map<String, Object>> typeItemsumbit(@PathVariable("id") Long id,@PathVariable("nametype")String nametype) {
        try {
            
            

            TypeItem  t = new TypeItem(nametype);

           this.typeItemRepository.save(t);
           
            Map<String, Object> json = new HashMap<String, Object>();
            json.put("success", true);
            json.put("status", "save");

            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json; charset=UTF-8");
            headers.add("X-Fsl-Location", "/");
            headers.add("X-Fsl-Response-Code", "302");
            return (new ResponseEntity<Map<String, Object>>(json, headers, HttpStatus.OK));

        } catch (NullPointerException e) {
            Map<String, Object> json = new HashMap<String, Object>();
            System.out.println("Error Save CancelReservation");
            json.put("success", false);
            json.put("status", "save-false");

            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json; charset=UTF-8");
            headers.add("X-Fsl-Location", "/");
            headers.add("X-Fsl-Response-Code", "500");
            return (new ResponseEntity<Map<String, Object>>(json, headers, HttpStatus.INTERNAL_SERVER_ERROR));

        }
    }




    

     

}