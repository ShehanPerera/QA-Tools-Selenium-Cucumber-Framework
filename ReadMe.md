# QA-Tools-Selenium-Cucumber-Framework


This is Selenium,BDD,Java based automation framework to do Google search.

## Pre requisites
1. java : 1.8
2. mvn : 3.6.1
3. Internet connection
4. Firefox (88.0) or Chrome (81.0) browsers.
If browser versions are different than this please download relevant driver from below links and replace to drivers
folder.
* Chrome driver : https://chromedriver.chromium.org/
* Firefox driver : https://github.com/mozilla/geckodriver/releases

## Configurations

1. Check config/config.properties to setup url , browser and headed.
2. Using features/GoogleSearch.feature can change some test steps.
Eg :
Changing "When type name as shehan akalanka perera" to "When type name as Joe" will allowed to use search keyword as Joe.

## How Run Test

1. In QA-Tools-Selenium-Cucumber-Framework folder run below command

```
mvn clean install
```
2. Open below file on browser to check html reports.

```QA-Tools-Selenium-Cucumber-Framework/target/reports/cucumber-html-reports/file-Features-WebAutomation-feature.html```

3. Sample report

