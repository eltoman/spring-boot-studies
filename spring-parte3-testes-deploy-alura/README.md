# Alura Studies
## Spring boot P 3 (Tests, Deploy and profiles)

#### How to run with environment variables
```sh
java -jar -DFORUM_DATABASE_URL=jdbc:h2:mem:alura-forum -DFORUM_DATABASE_USERNAME=sa -DFORUM_DATABASE_PASSWORD= -DFORUM_JWT_SECRET=123456 -DFORUM_APP_PORT=9092 -Dspring.profiles.active=prod target/forum.jar
```