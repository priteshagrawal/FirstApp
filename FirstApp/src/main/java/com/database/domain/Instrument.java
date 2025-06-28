package com.database.domain;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Instrument {

    private String symbol;
    private String NAME_OF_COMPANY;
    private String series ;
    private String DATE_OF_LISTING ;
    private int PAID_UP_VALUE ;
    private int MARKET_LOT ;
    private String ISIN_NUMBER;
    private int FACE_VALUE;
    private String ScreenerFileName;
    private String ScreenerFinanceName;
    private String ScreenerSearchName ;


}