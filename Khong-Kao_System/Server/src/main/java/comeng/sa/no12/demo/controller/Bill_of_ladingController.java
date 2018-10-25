package comeng.sa.no12.demo.controller;

import comeng.sa.no12.demo.entity.Staff;
import comeng.sa.no12.demo.entity.Bill_of_lading;
import comeng.sa.no12.demo.entity.Item;
import comeng.sa.no12.demo.entity.TypeItem;

import comeng.sa.no12.demo.repository.Bill_of_ladingRepository;
import comeng.sa.no12.demo.repository.TypeItemRepository;
import comeng.sa.no12.demo.repository.ItemRepository;
import comeng.sa.no12.demo.repository.StaffRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
class Bill_of_ladingController { // pornhub ช่วยได้
    @Autowired
    private Bill_of_ladingRepository bill_of_ladingRepository;
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private TypeItemRepository typeItemRepository;
    @Autowired
    private StaffRepository staffRepository;

    public Bill_of_ladingController(Bill_of_ladingRepository bill_of_ladingRepository, ItemRepository itemRepository,
            TypeItemRepository typeItemRepository, StaffRepository staffRepository) {
        this.bill_of_ladingRepository = bill_of_ladingRepository;
        this.itemRepository = itemRepository;
        this.typeItemRepository = typeItemRepository;
        this.staffRepository = staffRepository;

    }

    @GetMapping("/Bill_of_lading/{id}")

    @CrossOrigin(origins = "http://localhost:4200")
    public Bill_of_lading billList(@PathVariable("id") Long id) {
        return bill_of_ladingRepository.findByBillId(id);
    }

    @GetMapping("/Bill_of_lading-list")

    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Bill_of_lading> bill_of_lading() {
        return bill_of_ladingRepository.findAll().stream().collect(Collectors.toList());
    }

    /*
     * @PostMapping("/Bill_of_lading-insert/{id}")
     * 
     * @CrossOrigin(origins = "http://localhost:4200") public
     * ResponseEntity<Map<String, Object>> BillLadingSubmit(@PathVariable("id") Long
     * id) { try { Product p = this.productRepository.findByProductId(id);
     * TypeProduct t = this.typeProductRepository.findByTypeId(id); User u =
     * this.userRepository.findByUserId(id); this.bill_of_ladingRepository.save(new
     * Bill_of_lading(p, t, u));
     * 
     * Map<String, Object> json = new HashMap<String, Object>(); json.put("success",
     * true); json.put("status", "save");
     * 
     * HttpHeaders headers = new HttpHeaders(); headers.add("Content-Type",
     * "application/json; charset=UTF-8"); headers.add("X-Fsl-Location", "/");
     * headers.add("X-Fsl-Response-Code", "302"); return (new
     * ResponseEntity<Map<String, Object>>(json, headers, HttpStatus.OK));
     * 
     * } catch (NullPointerException e) { Map<String, Object> json = new
     * HashMap<String, Object>();
     * System.out.println("Error Save CancelReservation"); json.put("success",
     * false); json.put("status", "save-false");
     * 
     * HttpHeaders headers = new HttpHeaders(); headers.add("Content-Type",
     * "application/json; charset=UTF-8"); headers.add("X-Fsl-Location", "/");
     * headers.add("X-Fsl-Response-Code", "500"); return (new
     * ResponseEntity<Map<String, Object>>(json, headers,
     * HttpStatus.INTERNAL_SERVER_ERROR));
     * 
     * } }
     */

}
