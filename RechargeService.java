
package com.sathish.demo.service;

import com.sathish.demo.model.MobileRecharge;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class RechargeService {

    private final Map<Integer, MobileRecharge> recharges =
            new HashMap<>();

    private int nextId = 1;

    public MobileRecharge addRecharge(MobileRecharge recharge) {
        recharge.setRechargeId(nextId++);
        recharges.put(recharge.getRechargeId(), recharge);
        return recharge;
    }

    public List<MobileRecharge> getAllRecharges() {
        return new ArrayList<>(recharges.values());
    }

    public MobileRecharge getRechargeById(int id) {
        return recharges.get(id);
    }
}