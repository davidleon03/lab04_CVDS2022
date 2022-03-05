# lab04_CVDS2022
PARTE II\
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



