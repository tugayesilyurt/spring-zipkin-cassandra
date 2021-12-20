# Docker Compose Spring Boot,Zipkin and Cassandra storage example ( also using DTO mapper )

## Run the System
We can easily run the whole with only a single command:

* `docker-compose up`

The services can be run on the background with command:

* `docker-compose up -d`


## Stop the System
Stopping all the running containers is also simple with a single command:

* `docker-compose down`


If you need to stop and remove all containers, networks, and all images used by any service in <em>docker-compose.yml</em> file, use the command:

* `docker-compose down --rmi all`

### EndPoints ###

| Service       | EndPoint                      | Method | Description                                      |
| ------------- | ----------------------------- | :-----:| ------------------------------------------------ |
| Book          | /api/v1/book    				| GET    | Return book list             	                |

- **Zipkin**

![Zipkin](https://github.com/tugayesilyurt/spring-zipkin-cassandra/blob/main/assets/zipkin.PNG)

- **Cassandra**

![Postman](https://github.com/tugayesilyurt/spring-zipkin-cassandra/blob/main/assets/cassandra.PNG)
	
- **Postman**

![Postman](https://github.com/tugayesilyurt/spring-zipkin-cassandra/blob/main/assets/postman.PNG)