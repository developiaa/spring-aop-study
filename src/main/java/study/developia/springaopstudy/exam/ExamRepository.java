package study.developia.springaopstudy.exam;

import org.springframework.stereotype.Repository;
import study.developia.springaopstudy.exam.annotation.Retry;
import study.developia.springaopstudy.exam.annotation.Trace;

@Repository
public class ExamRepository {

    private static int seq = 0;

    /**
     * 5번에 1번 실패하는 요청
     */
    @Trace
    @Retry(4)
//    @Retry(value = 4)
    public String save(String itemId) {
        seq++;
        if (seq % 5 == 0) {
            throw new IllegalStateException("예외발생");
        }
        return "ok";
    }

}
