package com.tluo.lala.commons.base;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by edz on 2017/8/13.
 */
@Data
@EqualsAndHashCode
@JsonAutoDetect(fieldVisibility= JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC)
public abstract class BaseDomain implements Serializable{
    private static final long serialVersionUID = -3903227698553456808L;
    protected long id;
    protected int deleteFlag;
    protected Date create_time;
    protected Date updaate_time;
    protected long user_id;
}
