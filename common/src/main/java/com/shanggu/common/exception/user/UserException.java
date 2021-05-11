package com.shanggu.common.exception.user;

import com.shanggu.common.exception.BaseException;

/**
 * 用户信息异常类
 * 
 * @author shanggu
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
