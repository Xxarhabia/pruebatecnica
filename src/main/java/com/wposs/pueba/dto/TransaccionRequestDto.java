package com.wposs.pueba.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransaccionRequestDto {

    @NotBlank
    private String tipoTransaccion;

    @NotNull
    private double saldoTransaccion;

}
