package com.capgemini.wsb.service.interfaces;

import java.io.Serializable;

public interface ICrudService<D,I extends Serializable, M> {
    D crete(D dto, M mapper);
    D get(I id, M mapper);
    D update(D dto, M mapper);
    void delete(I id);
}
