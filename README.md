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


