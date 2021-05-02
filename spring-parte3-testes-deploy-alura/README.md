# Alura Studies
## Spring boot P 3 (Tests, Deploy and profiles)

#### How to run local with environment variables
```sh
java -jar -DFORUM_DATABASE_URL=jdbc:h2:mem:alura-forum -DFORUM_DATABASE_USERNAME=sa -DFORUM_DATABASE_PASSWORD= -DFORUM_JWT_SECRET=123456 -DPORT=9092 -Dspring.profiles.active=prod target/forum.jar
```

#### How to run docker compose
```sh
docker compose build   
docker compose up    
```

#### Deploy using heroku
```sh
heroku login
heroku container:login
heroku container:push web --app alura-forum-
heroku container:release web --app alura-forum-

# Logs
heroku logs --tail --app alura-forum-
```