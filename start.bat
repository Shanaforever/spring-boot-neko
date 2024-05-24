@echo off
set path=C:\C8\jdk-11.0.11+9\bin\
START "neko-server" "%path%\javaw" -Dthin.root=. -jar neko-server.jar --spring.profiles.active=local
echo start vipservice......
pause