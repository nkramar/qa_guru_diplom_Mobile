
<h2 align="center"> Проект по мобильной автоматизации для приложения Wikipedia <a target="_blank" href="https://www.wikipedia.org/"></a> </h2>

<p align="center">
<img title="Wikipedia" src="images/WikipediaLogo.png">
</p>


## :green_book: *Содержание*
+ [Технологии и инструменты](#Technology)
+ [Примеры автоматизированных тест кейсов](#TestCases)
+ [Запуск тестов в Jenkins](#Jenkins)
+ [Команды для запуска из терминала](#SystemProperty)
+ [Отчет о результатах тестирования в Allure Report](#AllureReport)
+ [Интеграция с Allure TestOps](#AllureTestOps)
+ [Интеграция с Jira](#Jira)
+ [Уведомление в Telegram при помощи Alert bot](#Telegram)
+ [Пример видео выполнения теста на сервере BrowserStack](#BrowserStack)

____
# <a name="Technology">*Технологии и инструменты*</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://github.com/appium/appium-inspector/raw/main/docs/icon.png"><img src="images/AppiumInspectorIcon.png" width="50" height="50"  alt="Appium Inspector"/></a>  
<a href="https://github.com/allure-framework/allure2"><img src="images/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/AllureTestOps.svg" width="50" height="50"  alt="Allure TestOps"/></a>   
<a href="https://avatars.githubusercontent.com/u/3221291?s=200&v=4"><img src="images/Appium.svg" width="50" height="50"  alt="Appium"/></a>  
<a href="https://cdn.worldvectorlogo.com/logos/android-studio-1.svg"><img src="images/android-studio-icon.svg" width="50" height="50"  alt="AndroidStudio"/></a>  
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/Jira.svg" width="50" height="50"  alt="Jira"/></a>  
</p>

____
# <a name="TestCases">*Примеры автоматизированных тест кейсов*</a>

- :white_check_mark: Проверка добавления дополнительного языка в Wikipedia
- :white_check_mark: Проверка текста на стартовом экране
- :white_check_mark: Проверка функции поиска по тексту

____

# <img src="images/Jenkins.svg" width="25" height="25" alt="Jenkins"/> </a> <a name="Jenkins">*Запуск тестов в Jenkins*</a>

<a target="_blank" href="https://jenkins.autotests.cloud/job/qa_guru_diplom_Mobile_tests/">**Сборка в Jenkins**</a>
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/qa_guru_diplom_Mobile_tests/"><img src="images/JenkinsJobMobile.png" alt="Jenkins"/></a>  
</p>


____
# <a name="SystemProperty">*Команды для запуска из терминала*</a>

***Локальный запуск:***
```bash  
gradle clean android_tests -DdeviceHost=${DEVICEHOST}
```

***Удалённый запуск через Jenkins:***
```bash  
gradle clean android_tests -DdeviceHost=${DEVICEHOST}
```

# <a name="AllureReport">*Отчет о результатах тестирования в Allure Report*</a>

## <img src="images/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> *Allure* <a target="_blank" href="https://jenkins.autotests.cloud/job/qa_guru_diplom_Mobile_tests/">*отчёт*</a>
___

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/Allure_Report_Overview.png">  
</p>  

### *Тест кейсы*

<p align="center">  
<img title="Allure Tests" src="images/Test_cases.png">  
</p>

### *Графики*

  <p align="center">  
<img title="Allure Graphics" src="images/Allure_Charts.png">  
</p>

___

# <img src="images/AllureTestOps.svg" width="25" height="25"  alt="Allure"/> <a name="AllureTestOps">*Интеграция с Allure TestOps*</a>

## </a>*TestOps* <a target="_blank" href="https://allure.autotests.cloud/launch/15409/tree/155295?treeId=0">*Dashboard*</a>

<p align="center">  
<img title="Allure TestOps Dashboard" src="images/Allure_Test_Ops_Dashboard.png">  
</p>  

## *Тест кейсы*

<p align="center">  
<img title="Allure TestOps Tests" src="images/TestOpsTests.png">  
</p>

___

# <img src="images/Jira.svg" width="25" height="25"  alt="Allure"/> <a name="Jira">*Интеграция с Jira*</a>

## </a>*Тикет в* <a target="_blank" href="https://jira.autotests.cloud/browse/AUTO-1320">*Jira*</a>

<p align="center">  
<img title="Jira" src="images/JiraTicket.png">  
</p>

____
# <img src="images/Telegram.svg" width="25" height="25"  alt="Allure"/> <a name="Telegram">*Уведомление в Telegram при помощи Alert bot*</a>



<p align="center">  
<img title="Telegram notification" src="images/Telegram_bot.png">  
</p>

# <img src="images/Browserstack.svg" width="25" height="25" alt="Browserstack"/> <a name="BrowserStack">Пример видео выполнения теста на BrowserStack</a>

<p align="center"> 
<img title="Browserstack Video" src="images/BrowserStackVideoShort.gif" width="450" height="450"  alt="video">   
</p>



