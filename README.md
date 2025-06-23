# VirtualPetBattleArena

Proyecto de ejemplo compuesto por varios microservicios desarrollados con Spring Boot y Gradle.

## Requisitos

Para preparar el entorno de desarrollo necesitas instalar:

1. **JDK 21**
2. **Docker** y **Docker Compose**
3. **Gradle 8** (opcional si dispones del wrapper)

## Configuración de la ambientación

1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu-usuario/VirtualPetBattleArena.git
   cd VirtualPetBattleArena
   ```
2. Compila todos los servicios con Gradle (usando el wrapper incluido):
   ```bash
   ./gradlew build      # en Windows usa gradlew.bat
   ```
3. Inicia el entorno local con Docker Compose:
   ```bash
   docker-compose up
   ```
   Se crearán los contenedores para cada microservicio y estarán accesibles en los puertos definidos en `docker-compose.yml`.
4. Accede a `http://localhost:8080` para verificar que la API Gateway está en funcionamiento.

## Microservicios disponibles

- **api-gateway** – Enrutamiento y autenticación
- **user-service** – Gestión de usuarios
- **pet-service** – Administración de mascotas
- **battle-service** – Lógica de batallas
- **notification-service** – Envío de notificaciones
- **analytics-service** – Métricas y análisis

## Comandos útiles

- `./gradlew build` – Compila todos los módulos
- `./gradlew test` – Ejecuta las pruebas (si existen)

## Licencia

Distribuido bajo la licencia Apache 2.0.
