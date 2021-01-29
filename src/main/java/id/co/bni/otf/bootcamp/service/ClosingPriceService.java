package id.co.bni.otf.bootcamp.service;

import id.co.bni.otf.bootcamp.repository.ClosingRepository;
import id.co.bni.otf.bootcamp.repository.StocksRepository;
import id.co.bni.otf.bootcamp.service.dto.ClosingPriceDTO;
import id.co.bni.otf.bootcamp.service.mapper.ClosingPriceMapper;
import id.co.bni.otf.bootcamp.service.mapper.StocksMapper;

import java.util.Date;

public class ClosingPriceService {

    public ClosingRepository closingPriceRepository;
    public ClosingPriceMapper closingPriceMapper;

    public ClosingRepository closingRepository;

    public ClosingPriceService(ClosingRepository closingPriceRepository, ClosingPriceMapper closingPriceMapper) {
        this.closingPriceRepository = closingPriceRepository;
        this.closingPriceMapper = closingPriceMapper;
    }

    public ClosingPriceDTO getPrice(Date date){
        closingPriceRepository.findOneByDate(date);
    }

}
