# Literalura - API de Libros

Este es un proyecto de Spring Boot que interactúa con la API de Gutendex para buscar libros por título o autor.

## Tecnologías utilizadas

- **Spring Boot**: Framework principal para crear aplicaciones Java.
- **Spring Data JPA**: Para la interacción con bases de datos.
- **PostgreSQL**: Base de datos relacional para almacenar los datos de los libros y autores.
- **Gutendex API**: API externa para buscar libros gratuitos.
- **Git y GitHub**: Control de versiones y repositorio en línea.

## Requisitos previos

Asegúrate de tener instalados los siguientes programas en tu computadora:

- **Java 11 o superior** (para ejecutar la aplicación).
- **PostgreSQL** (para configurar la base de datos).
- **Maven** (para gestionar las dependencias y construir el proyecto).
- **Git** (para gestionar el repositorio y subir cambios a GitHub).

## Instalación

1. Clona el repositorio:

   `git clone https://github.com/tuusuario/literalura.git`

   Luego, navega a la carpeta del proyecto:
   
   `cd literalura`

2. Configura tu base de datos PostgreSQL:

   Asegúrate de tener PostgreSQL instalado y en ejecución. Luego crea una base de datos llamada `literalura` y configura tu archivo `src/main/resources/application.properties` con las credenciales correspondientes.

3. Construye el proyecto con Maven:

   `mvn clean install`

4. Ejecuta la aplicación:

   `mvn spring-boot:run`

5. La aplicación estará corriendo en `http://localhost:8080`. Puedes probar las rutas de la API utilizando herramientas como Postman o directamente desde tu navegador.

## Endpoints disponibles

### **GET** `/books`
Obtiene todos los libros almacenados en la base de datos.

### **GET** `/books/{id}`
Obtiene un libro específico por su ID.

### **POST** `/books`
Guarda un nuevo libro en la base de datos.

### **DELETE** `/books/{id}`
Elimina un libro de la base de datos por su ID.

### **GET** `/authors`
Obtiene todos los autores almacenados en la base de datos.

### **GET** `/authors/{id}`
Obtiene un autor específico por su ID.

### **POST** `/authors`
Guarda un nuevo autor en la base de datos.

### **DELETE** `/authors/{id}`
Elimina un autor de la base de datos por su ID.

### **GET** `/books/search`
Busca libros usando la API externa de Gutendex por título.

## Estructura del proyecto

El proyecto sigue una arquitectura de capas estándar:

- **Controller**: Maneja las solicitudes HTTP y las respuestas.
- **Service**: Contiene la lógica de negocio.
- **Model**: Define las entidades que se usan para interactuar con la base de datos.
- **Repository**: Proporciona acceso a la base de datos.

## Contribuciones

Si deseas contribuir a este proyecto, por favor sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature-nueva-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -am 'Añadir nueva funcionalidad'`).
4. Sube tus cambios a tu repositorio (`git push origin feature-nueva-funcionalidad`).
5. Crea un Pull Request en GitHub.

