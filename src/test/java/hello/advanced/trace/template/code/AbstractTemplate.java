package hello.advanced.trace.template.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractTemplate {

    //변하지 않는 부분
    public void execute() {
        long startTime = System.currentTimeMillis();
        //비지니스 로직 실행
        call();
        //비지니스 로직 실행 종료
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime={}", resultTime);
    }

    //변하는 부분. 자식 클래스에서 오버라이드
    protected abstract void call();
}
