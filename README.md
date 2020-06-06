# Autor: Guillermo Esteban Bernal Bonilla

## Profesor: Luis Daniel Benavides Navarro ARSW-2020-I

## Viernes 05-Junio-2020

## Media y Desviación estandar con MyLinkedList

El objetivo de este proyecto es facilitar el calculo de la media y la desviación estandar de una cantidad n de archivos que contengan los datos, para esto se realizo la implementación de un LinkedList propio el cual realiza las operaciones basicas de una lista tales como agregar, eliminar y recorrer.

## Requisitos para el uso de Media y Desviación estandar con MyLinkedList

Este proyecto se construyo utilizando el lenguaje de Java, el editor Eclipse Java 2020-3 con su JDK respectivo, y Maven para su ejecución, por esto debes seguir los sigueintes pasos. 

El primer paso sera descargar la version más reciente de Maven y el JDK de la version 8 de java ya que esta version es compatible con el proyecto.

![JDK](https://user-images.githubusercontent.com/54051399/83717739-1a9a9700-a5f9-11ea-97ad-1b17dc37d5fa.PNG)

![Maven](https://user-images.githubusercontent.com/54051399/83717759-27b78600-a5f9-11ea-9fdb-1de8409a9283.PNG)

[Toca acá para ver la Descarga de Maven y la configuración del JDK y Maven](https://www.youtube.com/watch?v=ExOl1qkYGiI&t=238s)

Por ultimo deberas descargar GIT para poder obtener el proyecto desde este repositorio.

![Git](https://user-images.githubusercontent.com/54051399/83717783-330ab180-a5f9-11ea-948f-1c9f420f91ae.PNG)

[Toca acá para ver la Descarga e instalación de GIT](https://www.youtube.com/watch?v=ES2xtLyI-B8)

Esto es todo lo que tienes que realizar para probar Media y Desviación estandar con MyLinkedList en tu ordenador.

## Licencia

La licencia utilizada para este proyecto es GPL-3.0 la cual se encuentra especificada en el siguiente enlace

[Licencia](https://github.com/EstebanK23/Laboratorio-02-ARSW/blob/master/LICENSE.txt)

## Diseño

![Class Diagram1](https://user-images.githubusercontent.com/54051399/83940289-20cf7580-a7a9-11ea-84f5-ede556e661b8.png)

### Descripción del diseño

Este diseño consta de una fachada la cual es la clase principal App, también de 4 clases las cuales serán las encargadas de realizar la lectura de archivos, la implementacion de mi LinkedList y el calculo de la media y desviacion estandar para cada archivo leido, como se muestra la clase App implementa la clase LeerArchivo ya que este sera el constructor principal, a la misma vez LeerArchivos implementa MyLinkedList y operaciones ya que con una obtendra el LinkedList y con la otra pasara el Linked a los calculos.

Las clases para leer,crear el LinkedList y calcular pertenecen al paquete edu.escuelaing.arsw.intro.CalculadoraMediaDesviacion, la clase principal pertene al paquete edu.escuelaing.arsw.intro.

## Uso de Media y Desviación estandar con MyLinkedList

Lo primero que deberas hacer es abrir la terminal de tu ordenador (CMD) y obtener el proyecto que se encuenta en el siguiente enlace:

[Repositorio Media y Desviación estandar con MyLinkedList](https://github.com/EstebanK23/Laboratorio-02-ARSW)

Para obtener el proyecto deberas clonarlo desde git, el cual ya debe estar instalado como se menciono anteriormente, para esto se usara el siguiente comando en la terminal.

![git clone](https://user-images.githubusercontent.com/54051399/83940310-3349af00-a7a9-11ea-8243-871c95bd95c8.PNG)

El paso siguiente es compilar el proyecto haciendo uso del siguiente comando de Maven.

![mvn package1](https://user-images.githubusercontent.com/54051399/83940326-42306180-a7a9-11ea-9aba-3140432a999d.PNG)

Al realizar este comando podremos ver los siguente

![mvn package2](https://user-images.githubusercontent.com/54051399/83940342-51afaa80-a7a9-11ea-80ef-7e0156f56904.PNG)

![mvn package3](https://user-images.githubusercontent.com/54051399/83940356-5e340300-a7a9-11ea-8b68-193bbc717a97.PNG)

Por ultimo para realizar la prueba existe el siguiente comando.

![codigo archivo](https://user-images.githubusercontent.com/54051399/83940374-6b50f200-a7a9-11ea-9cf0-96a21595618c.PNG)

Se muestran dos ejemplos cuando se pasa la direccion de una carpeta.

![codigo carpeta](https://user-images.githubusercontent.com/54051399/83940449-b66b0500-a7a9-11ea-9af3-612d25c9fed6.PNG)

## Ejecución de pruebas

Para dar inicio a la ejecucion de pruebas se utilizara el siguiente comando de Maven.

![mvn test1](https://user-images.githubusercontent.com/54051399/83940454-c387f400-a7a9-11ea-9a59-19eca4e2e2d2.PNG)

Se muestra la ejecución de pruebas correctamente

![mvn test2](https://user-images.githubusercontent.com/54051399/83940462-d6022d80-a7a9-11ea-8ff2-1f6930ecbac3.PNG)

Se muestran algunos ejemplos de la ejecución de 9 pruebas donde se evidencia el funcionamiento de la siguiente manera.

![prueba archivo](https://user-images.githubusercontent.com/54051399/83940469-e0242c00-a7a9-11ea-910c-39ae857f48db.PNG)

![prueba carpeta](https://user-images.githubusercontent.com/54051399/83940473-ee724800-a7a9-11ea-8e94-417e09bd26bd.PNG)
  
Por ultimo se muestra la validación de todas las pruebas desde el editor Eclipse.

![pruebas](https://user-images.githubusercontent.com/54051399/83940476-faf6a080-a7a9-11ea-9210-57f5fe42094d.PNG)
