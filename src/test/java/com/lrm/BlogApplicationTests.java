package com.lrm;

import com.demo.CommonResult;
import com.demo.Exception_Exception;
import com.demo.K2CallBackService;
import com.demo.K2CallBackService_Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {

//	@Autowired
//	private UserRepository userRepository;

    @Test
    public void contextLoads() throws Exception_Exception {
        K2CallBackService_Service k2CallBackService_service = new K2CallBackService_Service();
        K2CallBackService k2CallBackServiceImplPort = k2CallBackService_service.getK2CallBackServiceImplPort();
        //CommonResult result = k2CallBackServiceImplPort.updateK2ProcStatus("YWGD20200724387", "", "");
        CommonResult result = k2CallBackServiceImplPort.updateK2ProcStatus("YWGD20200724387", "6", "");
        System.out.println(result.getMessage() + "===================================");
    }

}
