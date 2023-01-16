package com.ifx.account.util;

import com.ifx.account.entity.Account;
import com.ifx.account.mapstruct.AccountHelper;
import com.ifx.common.base.AccountInfo;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author pengpeng
 * @description
 * @date 2023/1/16
 */
public class UtilTest {
    @Test
    public void testMapperInfo(){
        //given
        Account account = new Account(  );
        AccountInfo accountInfo = new AccountInfo();
        account.setAccount("sadsadas");
        //when
        accountInfo = AccountHelper.INSTANCE.trans2Info(account );
        //then
        Assert.assertEquals(accountInfo.getAccount(),account.getAccount());
    }
}
