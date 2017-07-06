#!/bin/sh
#
JAVA_OPTIONS="-server  -Xms512m -Xmx512m "  
nohup java -jar ../spring-boot-mybatis-dubbo.jar  >/dev/null 2>&1 &