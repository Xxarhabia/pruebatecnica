package com.wposs.pueba.services.impl;

import com.wposs.pueba.entities.TranasaccionEntity;
import com.wposs.pueba.services.TransaccionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TransaccionServiceImpl implements TransaccionService {
    @Override
    public List<TranasaccionEntity> listarTransaccion() {
        return null;
    }

    @Override
    public void crearTransaccion(TransaccionService transaccionService) {

    }

    @Override
    public TranasaccionEntity busacarPorId(TranasaccionEntity tranasaccionEntity) {
        return null;
    }
}
