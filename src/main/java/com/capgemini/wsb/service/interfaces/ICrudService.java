package com.capgemini.wsb.service.interfaces;

import java.io.Serializable;
import java.util.List;

public interface ICrudService<D,I extends Serializable,E> {
    D create(D dto);
    D get(I id);
    D update(D dto);
    void delete(I id);
    List<D> getList();
}
