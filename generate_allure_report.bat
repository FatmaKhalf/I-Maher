@echo off
set path=C:\Users\admin\.m2\repository\allure\allure-2.14.0\bin;C:\Users\admin\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_16.0.1.v20210528-1205\jre\bin;%path%
allure serve allure-results
pause
exit