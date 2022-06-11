package study.developia.springaopstudy.exam;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.developia.springaopstudy.exam.annotation.Trace;

@Service
@RequiredArgsConstructor
public class ExamService {
    private final ExamRepository examRepository;

    @Trace
    public void request(String itemId) {
        examRepository.save(itemId);
    }
}