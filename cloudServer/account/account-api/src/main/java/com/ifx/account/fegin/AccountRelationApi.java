package com.ifx.account.fegin;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author pengpeng
 * @description
 * @date 2023/3/21
 */
//@ReactiveFeignClient(name = "accountRelation-api",url = "${account.service.url:localhost:8001}")
@FeignClient(name = "accountRelation-api",url = "${account.service.url:localhost:8001}")
public interface AccountRelationApi {
}
