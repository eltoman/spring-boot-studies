# Alura Studies
## Spring boot P 3 (Tests, Deploy and profiles)

#### How to run local with environment variables
```sh
java -jar -DFORUM_DATABASE_URL=jdbc:h2:mem:alura-forum -DFORUM_DATABASE_USERNAME=sa -DFORUM_DATABASE_PASSWORD= -DFORUM_JWT_SECRET=123456 -DFORUM_APP_PORT=9092 -Dspring.profiles.active=prod target/forum.jar
```

#### How to run docker with environment variables
```sh
docker build –t alura/forum .

docker run -p 8080:8080 -e SPRING_PROFILES_ACTIVE='prod' -e FORUM_DATABASE_URL='jdbc:h2:mem:alura-forum' -e FORUM_DATABASE_USERNAME='sa' -e FORUM_DATABASE_PASSWORD='' -e FORUM_JWT_SECRET='123456' alura/forum
```
