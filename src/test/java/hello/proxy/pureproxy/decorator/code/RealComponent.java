package hello.proxy.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealComponent implements Component{
    @Override
    public String opration() {
        log.info("Real Component 실행");
        return "data";
    }
}
