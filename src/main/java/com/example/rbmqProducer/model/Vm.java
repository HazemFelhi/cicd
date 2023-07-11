package com.example.rbmqProducer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Vm {

    private Long vmId;
    private String vmName;
    private Long vmQty;
    private Integer vmPrice;
}
