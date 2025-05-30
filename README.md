# Sistema de Gestión de Compra y Venta.
 
Este proyecto es un sistema de gestión desarrollado en Java mediante una interfaz gráfica de usuario (GUI) construida con Swing y usando SQL para almacenar los datos.

# Importante !!!

En la carpeta DB hay 2 archivos .txt con las sentencias SQL a ejecutar una es para crear las tablas la otra para los procedimientos almacenados.

## Requisitos

- JDK 8 o superior.
- IDE como NetBeans, Eclipse, IntelliJ IDEA, etc.
- Descargar un .jar para conectar java con SQL como por ejemplo [.jar](https://learn.microsoft.com/en-us/sql/connect/jdbc/release-notes-for-the-jdbc-driver?view=sql-server-ver15)
- Tener un gestor de bases de datos como SQL Server.
- Libreria jCalendar aqui dejo el link [jCalendar](https://toedter.com/jcalendar)

## Estructura del Proyecto 

El proyecto está organizado en varias capas para separar la lógica de presentación, datos y negocio:

- **capaPresentacion**: Contiene las clases relacionadas con la interfaz de usuario.
- **capaData**: Contiene las clases que modelan los datos de usuarios y proveedores.
- **capaLogica**: Contiene las clases que gestionan la lógica del negocio.

## Componentes del Sistema

### 1. frmLogin
 
Este formulario permite al usuario ingresar al sistema mediante autenticación con usuario y contraseña.

### 2. frmMenu

Este es el menú principal del sistema, desde donde se pueden acceder a las diferentes funcionalidades:

- **Gestión de Compras**
- **Gestión de Ventas**
- **etc**
### Clonar el Repositorio

Para obtener una copia del proyecto en tu máquina local, ejecuta el siguiente comando en tu terminal o CMD:

```bash
git clone https://github.com/MiguelAntonioRS/Gestion-Proyect-of-Buys-and-Sales.git

cd Gestion-Proyect-of-Buys-and-Sales

cd src/com/presentation

javac FrmLogIn
