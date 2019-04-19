package cn.azsy.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@Service
public class LuckymoneyService {
    @Autowired
    LuckymoneyRepository repository;

    @Transactional
    public void CreateTwo() {
        Luckymoney luckymoney1 = new Luckymoney();
        luckymoney1.setProducer("张帆");
        luckymoney1.setMoney(new BigDecimal("520"));
        repository.save(luckymoney1);

        Luckymoney luckymoney2 = new Luckymoney();
        luckymoney2.setProducer("张帆");
        luckymoney2.setMoney(new BigDecimal("1314"));
        repository.save(luckymoney2);
    }
}
