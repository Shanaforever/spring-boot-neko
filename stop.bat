@echo off
wmic  process where (commandline LIKE "%%neko-server%%" and caption="javaw.exe") delete
echo close neko-server success!
pause