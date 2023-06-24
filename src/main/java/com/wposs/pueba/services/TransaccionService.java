package com.wposs.pueba.services;

import com.wposs.pueba.entities.TranasaccionEntity;

import java.util.List;

public interface TransaccionService {
    List<TranasaccionEntity> listarTransaccion();

    void crearTransaccion(TransaccionService transaccionService);

    TranasaccionEntity busacarPorId(TranasaccionEntity tranasaccionEntity);

}
