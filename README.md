# AlphaBank_task

Сервис, который обращается к сервису курсов валют, и отдает gif в ответ:  
если курс по отношению к рублю за сегодня стал выше вчерашнего, то отдаем gif типа "rich"  
если ниже - "broke"

heroku - https://gif-alphabank.herokuapp.com/   
swagger - https://gif-alphabank.herokuapp.com/swagger-ui/index.html#

docker -  
docker build -t alpha .  
docker run -p 8080:8080 alpha  


## Техническая составляющая
### Backend

* JDK 11

* Spring framework
  * Boot
  * Data
  
* Gradle

* Feign

* Swagger

### Тестирование

* JUnit
* Mockito

### Deploy

* Hosting - Heroku  



