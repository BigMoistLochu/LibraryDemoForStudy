FROM mysql:8.0

# Ustawiamy zmienne środowiskowe
ENV MYSQL_DATABASE=LibraryDataBase \
    MYSQL_ROOT_PASSWORD=pass123 \
    MYSQL_USER=user1 \
    MYSQL_PASSWORD=haslo1

COPY schema.sql /docker-entrypoint-initdb.d/