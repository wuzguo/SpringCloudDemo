/*************************************************************************
 *                  HONGLING CAPITAL CONFIDENTIAL AND PROPRIETARY
 *
 *                COPYRIGHT (C) HONGLING CAPITAL CORPORATION 2012
 *    ALL RIGHTS RESERVED BY HONGLING CAPITAL CORPORATION. THIS PROGRAM
 * MUST BE USED  SOLELY FOR THE PURPOSE FOR WHICH IT WAS FURNISHED BY
 * HONGLING CAPITAL CORPORATION. NO PART OF THIS PROGRAM MAY BE REPRODUCED
 * OR DISCLOSED TO OTHERS,IN ANY FORM, WITHOUT THE PRIOR WRITTEN
 * PERMISSION OF HONGLING CAPITAL CORPORATION. USE OF COPYRIGHT NOTICE
 DOES NOT EVIDENCE PUBLICATION OF THE PROGRAM.
 *                  HONGLING CAPITAL CONFIDENTIAL AND PROPRIETARY
 *************************************************************************/

package com.hongling.cloud.demo.feign.fallback;

import com.hongling.cloud.demo.feign.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * TODO 熔断返回值
 *
 * @author wuzguo at 2018/9/17 11:03
 */

@Component
public class HystrixHelloService implements HelloService {

    @Override
    public String helloFromClient(String name) {
        return "Hello，" + name + " 服务熔断，这里是默认值哦...";
    }
}
