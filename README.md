# java-pos-desktop
POS Y Reportes con Java y Mysql.

**Contenido:**

- [java-pos-desktop](#java-pos-desktop)
  - [login](#login)
  - [Crear usuario](#crear-usuario)
  - [Menu de opciones](#menu-de-opciones)
  - [Inventario](#inventario)
    - [Ver productos](#ver-productos)
    - [Crear productos](#crear-productos)
    - [Modificar productos](#modificar-productos)
    - [Eliminar productos](#eliminar-productos)
  - [POS](#pos)
  - [Reportes](#reportes)
    - [Documentos usuario](#documentos-usuario)
    - [Corte de caja usuario](#corte-de-caja-usuario)
    - [Catalogo de productos](#catalogo-de-productos)
- [Notas](#notas)
  - [Librerias externas utilizadas.](#librerias-externas-utilizadas)


## login

Inicia sesion con usuario y cintraeña.

![image](https://github.com/B3rert/java-pos-desktop/assets/62106542/91b96bbb-a8d9-4a84-8749-4edf17c2d3ec)

## Crear usuario

En caso de no contar con un usuario y contraseña, crear uno.

![image](https://github.com/B3rert/java-pos-desktop/assets/62106542/2261c805-53a2-4fe0-9729-5bcc5f17df64)

## Menu de opciones

Despues de iniciar sesion visiualizará el menú de modulos disponibles.

![image](https://github.com/B3rert/java-pos-desktop/assets/62106542/801a78de-0dc3-4cbd-bc5e-b60a6afb65af)

## Inventario

En el modulo inventario podrá visualizar un menu de opciones disponibles para el modulo.

![image](https://github.com/B3rert/java-pos-desktop/assets/62106542/bdeecb38-2fff-426d-b120-711032948e3b)

### Ver productos

Permite visualizar todos los productosd del inventario.

![image](https://github.com/B3rert/java-pos-desktop/assets/62106542/831be986-d8d4-4331-9bf4-bf6bb3badad5)

### Crear productos

Utilice la opciom de crear producto para agregar productos al inventario.

![image](https://github.com/B3rert/java-pos-desktop/assets/62106542/db8d3dcb-c3bc-4154-80cf-079fdc6913f6)

### Modificar productos

Para editar los valores de algun producto utilice esta opcion.

![image](https://github.com/B3rert/java-pos-desktop/assets/62106542/a48a608f-9f46-4567-a67b-b9c2598ffb44)

### Eliminar productos

En caso de querer eliminar un producto utilice esta opcion.

![image](https://github.com/B3rert/java-pos-desktop/assets/62106542/f9db7de6-f414-42c3-a24e-f754e1c181b7)

## POS

Permite realizar ventas de productos registrados en el inventario.

![image](https://github.com/B3rert/java-pos-desktop/assets/62106542/d14a392e-90af-4e47-953c-b7d6c6c16a17)

## Reportes

Pone a disposicion una serie de opciones que permiten visualizar reportes en fomrato PDF.

![image](https://github.com/B3rert/java-pos-desktop/assets/62106542/a52c7b89-8a36-4cd9-80f9-86a05f318ec7)

### Documentos usuario

Permite ver todos los documentos (ventas) creados por el usuario.

![image](https://github.com/B3rert/java-pos-desktop/assets/62106542/72b92d6f-955f-4f2d-bbe0-01f2b4857b56)

### Corte de caja usuario

Permite visualizar los documentos creados por el usuario durante el dia.

![image](https://github.com/B3rert/java-pos-desktop/assets/62106542/e83e6886-9f91-402d-b7de-bcb327c2d161)

### Catalogo de productos

Permite visualizar todos los productos del inventario.

![image](https://github.com/B3rert/java-pos-desktop/assets/62106542/01e17341-5ec1-4f0a-9d31-8e77ca07151b)


# Notas

* Para ejecutar el proyecto en otro dispositivo asegurece de cambiar la conexion a la base de datos ubicada en el archivo conexion.java.
* Asegurese de contar con la base de datos y tablas necesarias para el proyecto.
* Para generar reportes aseguese que la ruta establecida en el proyecto sea correcta.
* Asegurese de contar con las librerias necesarias.

## Librerias externas utilizadas.

* [iTextPDF 12.5.5](https://github.com/itext/itextpdf/releases)

