package com.hitisoft.orm.jpa;

import java.util.List;
import java.util.Map;
import com.hitisoft.orm.util.HtQuery;

public interface BaseDao <T, PK> {


    /**
     * 根据主键查对象(对象不存在, 不抛出异常)
     *
     * @param id
     * @return
     */
    public T findById(PK id);

}
