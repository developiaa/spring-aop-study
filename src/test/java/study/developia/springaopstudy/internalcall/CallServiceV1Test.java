package study.developia.springaopstudy.internalcall;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import study.developia.springaopstudy.internalcall.aop.CallLogAspect;


@Slf4j
@Import(CallLogAspect.class)
@SpringBootTest
class CallServiceV1Test {

    // proxy
    @Autowired
    CallServiceV1 callServiceV1;

    @Test
    void external() {
        callServiceV1.external();
    }

}