import ch.qos.logback.classic.encoder.PatternLayoutEncoder

import java.nio.charset.Charset

import static ch.qos.logback.classic.Level.*

scan("60 seconds")
def USER_HOME = System.getProperty("user.home")
def APP_NAME = "demo-server"

def LOG_CHARSET = "UTF-8"
def LOG_PATTERN = "%d{yyyy-MM-dd HH:mm:ss.SSS} [%-5level] [%logger{100}] %msg%n"
appender("STDOUT", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "${LOG_PATTERN}"
        charset = Charset.forName("${LOG_CHARSET}")
    }
}
// appender("dailyRollingFileAppender", RollingFileAppender) {
//     file = "${USER_HOME}/logs/${APP_NAME}"
//     rollingPolicy(TimeBasedRollingPolicy) {
//         fileNamePattern = "${APP_NAME}.%d{yyyy-MM-dd}.log"
//         maxHistory = 30
//     }
//     filter(ThresholdFilter) {
//         level = ERROR
//     }
//     encoder(PatternLayoutEncoder) {
//         pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{35} - %msg %n"
//     }
// }
logger("org.hibernate", WARN)
logger("org.jboss", WARN)
logger("ch.qos", WARN)
logger("com.alibaba", WARN)
logger("org.quartz", WARN)
logger("org.apache", WARN)
logger("springfox", WARN)
logger("org.springframework", WARN)
logger("org.springframework.boot", INFO)
logger("io.netty", WARN)
logger("de.codecentric.boot.admin", WARN)
logger("javax", WARN)
logger("sun.rmi", WARN)
logger("org.aspectj", INFO)
root(DEBUG, ["STDOUT"])
