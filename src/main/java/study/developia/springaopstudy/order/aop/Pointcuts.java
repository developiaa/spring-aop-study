package study.developia.springaopstudy.order.aop;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {
    // study.developia.springaopstudy.order 패키지와 하위 패키지
    // 포인트컷을 분리하여 여러 어드바이스에서 사용할 수 있도록 함
    @Pointcut("execution(* study.developia.springaopstudy.order..*(..))")
    public void allOrder() {   // pointcut signature
    }

    // 클래스 이름 패턴이 *Service
    @Pointcut("execution(* *..*Service.*(..))")
    public void allService() {
    }

    @Pointcut("allOrder() && allService()")
    public void orderAndService() {

    }
}
