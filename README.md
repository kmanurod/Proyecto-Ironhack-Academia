  /Academia API/

Academia API es una aplicación diseñada para ser la base de la estructura de una academia. En ella podremos ejecutar consultas y modificaciones en la base de datos.

  /Modelo Entidad-Relacion/

Archivo correspondiente a "Modelo ER Academia" puedes encontralo en la pagina principal del repositorio.

  /Configuracion/

1.Para acceder a la base de datos diseñada con MySql debe copiar los siguientes datos en application.properties:

spring.application.name=cicloasignaturauf2

spring.datasource.url=jdbc:mysql://localhost:3306/ciclo_asignatura_uf

spring.datasource.username=root

spring.datasource.password=12345678

spring.jpa.hibernate.ddl-auto=update

server.port=8080

2.Para poder modificar la base de datos en Postman debe de entrar con los siguientes parametros de admin

spring.security.user.name=root

spring.security.user.password=12345678

  /Controladores y Rutas/

CicloController:

@RequestMapping("/api/ciclos")// 

@GetMapping// Devuelve todos los Ciclos.

AsignaturaController:

@RequestMapping("/api/asignaturas")

@GetMapping// Obtener todas las asignaturas

@GetMapping("/{id}")// Obtener una asignatura por su ID

@PostMapping// Crear una nueva asignatura

@PutMapping("/{id}")// Actualizar una asignatura existente

@DeleteMapping("/{id}")// Eliminar una asignatura por su ID

UnidadFormativaController:

@RequestMapping("/api/unidades-formativas")

@GetMapping// Obtener todas las unidades formativas

@GetMapping("/{id}")// Obtener una unidad formativa por su ID

@PostMapping// Crear una nueva unidad formativa

@PutMapping("/{id}")// Actualizar una unidad formativa existente

@DeleteMapping("/{id}")// Eliminar una unidad formativa por su ID

  /Aplicaciones Futuras/

Gestión de Ciclos y Asignaturas Académicas:

Plataforma de Inscripción: Implementar un sistema de inscripción en línea para estudiantes y profesores.

Seguimiento del Progreso: Crear un módulo para que los estudiantes puedan hacer seguimiento de su progreso en las asignaturas y ciclos.

Evaluaciones Automáticas: Integrar funcionalidades para la realización y calificación automática de evaluaciones.

Sistema de Gestión de Usuarios:

Roles y Permisos: Expander el sistema de autenticación para manejar roles y permisos de usuarios de manera más detallada (por ejemplo, admin, profesor, estudiante).

Perfil de Usuario: Implementar perfiles de usuario donde cada uno pueda ver y actualizar su información personal y académica.

Integraciones con Herramientas Externas:

Integración con LMS: Conectar tu sistema con plataformas de gestión de aprendizaje (LMS) como Moodle o Blackboard.

API Pública: Crear una API pública para que terceros puedan interactuar con tu sistema, ofreciendo así servicios adicionales como aplicaciones móviles.

Funcionalidades de Comunicación:

Sistema de Mensajería Interna: Implementar un sistema de mensajería interna para que estudiantes y profesores se comuniquen entre ellos.

Notificaciones: Configurar notificaciones por correo electrónico y SMS para alertar a los usuarios sobre eventos importantes, plazos, etc.

Analítica y Reportes:

Dashboard de Analítica: Crear dashboards para analizar el rendimiento académico de los estudiantes, asignaturas más complicadas, tasa de aprobación, etc.

Reportes Personalizados: Generar reportes personalizados para estudiantes, profesores y administradores, con información relevante y estadísticas.

Accesibilidad y Usabilidad:

Interfaz Multilingüe: Implementar soporte para múltiples idiomas para hacer el sistema accesible a una audiencia más amplia.

Diseño Responsive: Asegurarte de que el sitio web sea completamente responsive y accesible desde dispositivos móviles.

Seguridad y Cumplimiento:

Autenticación de Dos Factores: Implementar autenticación de dos factores para una mayor seguridad.

Cumplimiento de Normativas: Asegurarte de que el sistema cumpla con normativas y leyes locales e internacionales sobre protección de datos.

  /Recursos/

Spring Boot Documentation: https://spring.io/projects/spring-boot

MySQL Documentation: https://dev.mysql.com/doc/

Postman Documentation: https://www.postman.com/

Spring Security Guide: https://spring.io/guides/topicals/spring-security-architecture

Google Slides [https://docs.google.com/presentation/d/16cmouXdsAI_8RjKVkiVbCsBsnSkwYbn859gs9CLTMQ0/edit?usp=sharing]

  /Miembro del Equipo/

Manuel Rodriguez.
