# lab04_CVDS2022

## PARTE I. - JUGANDO A SER UN CLIENTE HTTP
1. Abra una terminal Linux o consola de comandos Windows.
2. Realice una conexión síncrona TCP/IP a través de Telnet al siguiente servidor:
  - Host: www.escuelaing.edu.co
  - Puerto: 80
Teniendo en cuenta los parámetros del comando telnet:
![image](https://user-images.githubusercontent.com/78982514/156885744-3d7a2689-6bbc-4c08-b93c-b32a7ea97a89.png)

telnet HOST PORT
3. Antes de que el servidor cierre la conexión por falta de comunicación:
Revise la página 36 del RFC del protocolo HTTP, sobre cómo realizar una petición GET. Con esto, solicite al servidor el recurso ‘sssss/abc.html’, usando la versión 1.0 de HTTP.
Asegúrese de presionar ENTER dos veces después de ingresar el comando.
Revise el resultado obtenido. ¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.
![image](https://user-images.githubusercontent.com/78982514/156885862-f5153d86-bfb6-4ac8-b27e-32937bc0cd98.png)
Vemos que ocurre un error 400, de tipo Bad Request, es significa que el cliente está haciendo una petición de recursos inválida al servidor.
¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?
  1. informational response
  2. sucess
  3. redirection
  4. client errors
  5.server errors
4. Realice una nueva conexión con telnet, esta vez a:
Host: www.httpbin.org
Puerto: 80
![image](https://user-images.githubusercontent.com/78982514/156885934-bd3985b8-21a1-4d3b-8c61-c23702e24850.png)

Versión HTTP: 1.1
Ahora, solicite (GET) el recurso /html. ¿Qué se obtiene como resultado?
![image](https://user-images.githubusercontent.com/78982514/156885958-eea4e8e5-0126-48e2-a439-2a60c22490c2.png)

¡Muy bien!, ¡Acaba de usar del protocolo HTTP sin un navegador Web!. Cada vez que se usa un navegador, éste se conecta a un servidor HTTP, envía peticiones (del protocolo HTTP), espera el resultado de las mismas, y -si se trata de contenido HTML- lo interpreta y dibuja.

5. Seleccione el contenido HTML de la respuesta y copielo al cortapapeles CTRL-SHIFT-C. Ejecute el comando wc (word count) para contar palabras con la opción -c para contar el número de caracteres:

wc -c 
Pegue el contenido del portapapeles con CTRL-SHIFT-V y presione CTRL-D (fin de archivo de Linux). Si no termina el comando wc presione CTRL-D de nuevo. No presione mas de dos veces CTRL-D indica que se termino la entrada y puede cerrarle la terminal. Debe salir el resultado de la cantidad de caracteres que tiene el contenido HTML que respondió el servidor.
![image](https://user-images.githubusercontent.com/78982514/156885987-6080d4e8-7fbe-4229-9dd8-5e5a94d6e516.png)

Claro está, las peticiones GET son insuficientes en muchos casos. Investigue: ¿Cuál es la diferencia entre los verbos GET y POST? ¿Qué otros tipos de peticiones existen?

GET El método GET solicita una representación de un recurso específico. Las peticiones que usan el método GET sólo deben recuperar datos. HEAD El método HEAD pide una respuesta idéntica a la de una petición GET, pero sin el cuerpo de la respuesta. POST El método POST se utiliza para enviar una entidad a un recurso en específico, causando a menudo un cambio en el estado o efectos secundarios en el servidor. PUT El modo PUT reemplaza todas las representaciones actuales del recurso de destino con la carga útil de la petición.

DELETE El método DELETE borra un recurso en específico. CONNECT El método CONNECT establece un túnel hacia el servidor identificado por el recurso.

OPTIONS El método OPTIONS es utilizado para describir las opciones de comunicación para el recurso de destino. TRACE El método TRACE realiza una prueba de bucle de retorno de mensaje a lo largo de la ruta al recurso de destino.

PATCH El método PATCH es utilizado para aplicar modificaciones parciales a un recurso.

6. En la practica no se utiliza telnet para hacer peticiones a sitios web sino el comando curl con ayuda de la linea de comandos:

curl www.httpbin.org
Utilice ahora el parámetro -v y con el parámetro -i:

curl -v www.httpbin.org
![image](https://user-images.githubusercontent.com/78982514/156886054-26cd1be5-9a3b-4345-a998-7db4a224329b.png)

curl -i www.httpbin.org
![image](https://user-images.githubusercontent.com/78982514/156886071-550a8e98-e76d-4fd0-be1b-330d475124d2.png)

¿Cuáles son las diferencias con los diferentes parámetros?

-v, --verbose Hacer que la operación sea más comunicativa -i, --include Incluir encabezados de respuesta de protocolo en la salida

Seleccione el contenido HTML de la respuesta y copielo al cortapapeles CTRL-SHIFT-C. Ejecute el comando wc (word count) para contar palabras con la opción -c para contar el número de caracteres:
## PARTE II
I. Para esto, cree un proyecto maven nuevo usando el arquetipo de aplicación Web estándar maven-archetype-webapp y realice lo siguiente:\
![image](https://user-images.githubusercontent.com/98216838/156883250-e42bca82-c5e9-4bc8-9196-3ae2acb1a0db.png)\
Revise en el pom.xml para qué puerto TCP/IP está configurado el servidor embebido de Tomcat (ver sección de plugins).\
![image](https://user-images.githubusercontent.com/98216838/156884163-46f6aac3-9eaf-44f8-82ee-153fe6782bd0.png)
Compile y ejecute la aplicación en el servidor embebido Tomcat, a través de Maven con:\
![image](https://user-images.githubusercontent.com/98216838/156884307-fde451c9-533e-4e57-b63c-594258af1684.png)\
![image](https://user-images.githubusercontent.com/98216838/156884583-b473da23-9a71-431a-aec9-fa2965fe6040.png)\
Abra un navegador, y en la barra de direcciones ponga la URL con la cual se le enviarán peticiones al ‘SampleServlet’. Tenga en cuenta que la URL tendrá como host ‘localhost’, como puerto, el configurado en el pom.xml y el path debe ser el del Servlet. Debería obtener un mensaje de saludo.\
![image](https://user-images.githubusercontent.com/98216838/156884624-48700857-dba6-4634-a5b3-2ce569ac2e40.png)\
Observe que el Servlet ‘SampleServlet’ acepta peticiones GET, y opcionalmente, lee el parámetro ‘name’. Ingrese la misma URL, pero ahora agregando un parámetro GET (si no sabe como hacerlo, revise la documentación en http://www.w3schools.com/tags/ref_httpmethods.asp).\
![image](https://user-images.githubusercontent.com/98216838/156884832-8dc5eb55-bace-42de-a8df-4464dc07883a.png)\
Busque el artefacto gson en el repositorio de maven y agregue la dependencia.\
![image](https://user-images.githubusercontent.com/98216838/156884895-40c9e45d-3276-49a0-9292-b5683c51700d.png)\
En el navegador revise la dirección https://jsonplaceholder.typicode.com/todos/1. Intente cambiando diferentes números al final del path de la url.\
![image](https://user-images.githubusercontent.com/98216838/156884956-63ca733e-f8fc-4bf3-8d9a-ee5e278a15b8.png)
![image](https://user-images.githubusercontent.com/98216838/156884961-4c4b7352-de18-4c49-913f-d07ef6d8688d.png)
![image](https://user-images.githubusercontent.com/98216838/156884965-04053a0f-fff3-4ea4-8eb0-664d19065782.png)\
Basado en la respuesta que le da el servicio del punto anterior, cree la clase edu.eci.cvds.servlet.model.Todo con un constructor vacío y los métodos getter y setter para las propiedades de los "To Dos" que se encuentran en la url indicada.\
![image](https://user-images.githubusercontent.com/98216838/156885320-a3970a75-b039-4055-9bf6-bb6d0bb5279a.png)\
Intente hacer diferentes consultas desde un navegador Web para probar las diferentes funcionalidades.\
![image](https://user-images.githubusercontent.com/98216838/156888239-c3859dc6-3661-4f5f-a305-e6d6c653e1ce.png)\
![image](https://user-images.githubusercontent.com/98216838/157573430-ff9952b8-d653-49d0-9c4c-7892e56e85f0.png)\
![image](https://user-images.githubusercontent.com/98216838/157573475-4445a0e2-4f69-4426-bb08-79d818e632cd.png)
## Parte III
![image](https://user-images.githubusercontent.com/98216838/157577737-36c1d8df-3742-41ff-97e3-da88578461bb.png)\
![image](https://user-images.githubusercontent.com/98216838/157577851-2d120ca7-dfa6-4c7b-8336-00be06ac41b3.png)\
Recompile y ejecute la aplicación. Abra en su navegador en la página del formulario, y rectifique que la página hecha anteriormente sea mostrada. Ingrese los datos y verifique los resultados. Cambie el formulario para que ahora en lugar de POST, use el método GET . Qué diferencia observa?\
La diferencia principal se encuentra en las url de cada solicitud\






