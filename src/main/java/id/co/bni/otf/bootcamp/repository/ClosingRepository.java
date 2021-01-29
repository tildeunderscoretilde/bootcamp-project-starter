package id.co.bni.otf.bootcamp.repository;

import id.co.bni.otf.bootcamp.entity.ClosingPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ClosingRepository extends JpaRepository<Stocks, Long>, QuerydslPredicateExecutor<Stocks> {
    ClosingPrice findOneByCode(String code);
    ClosingPrice findOneByDate(Date date);
}
