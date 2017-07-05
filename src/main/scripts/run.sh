#!/bin/sh
#
JAVA_OPTIONS="-server  -Xms512m -Xmx512m "  
nohup java -jar ../my-front.jar  >/dev/null 2>&1 &