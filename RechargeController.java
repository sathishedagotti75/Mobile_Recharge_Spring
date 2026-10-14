package com.sathish.demo.controller;


import com.sathish.demo.model.MobileRecharge;
import com.sathish.demo.service.RechargeService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/recharge")
public class RechargeController {

    private final RechargeService service;

    public RechargeController(RechargeService service) {
        this.service = service;
    }

    @PostMapping
    public MobileRecharge addRecharge(
            @Valid @RequestBody MobileRecharge recharge) {
        return service.addRecharge(recharge);
    }

    @GetMapping
    public List<MobileRecharge> getAllRecharges() {
        return service.getAllRecharges();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MobileRecharge> getRechargeById(
            @PathVariable int id) {

        MobileRecharge recharge = service.getRechargeById(id);

        if (recharge == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(recharge);
    }
}