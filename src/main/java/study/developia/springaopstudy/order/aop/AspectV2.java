package study.developia.springaopstudy.order.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Slf4j
@Aspect
public class AspectV2 {

    // 패키지와 그 하위 패키지
    // 포인트컷을 분리하여 여러 어드바이스에서 사용할 수 있도록 함
    @Pointcut("execution(* study.developia.springaopstudy.order..*(..))")
    private void allOrder() {   // pointcut signature

    }

    @Around("allOrder()")
    public Object doLog(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("[log] {}", joinPoint.getSignature()); // join point 시그니처
        return joinPoint.proceed();
    }
}
