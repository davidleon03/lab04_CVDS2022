<!DOCTYPE html>
<html>
<head>
    <title>Start Page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<script>
  function validateForm() {
  var x = document.forms["formulario"]["id"].value;
  if (x != parseInt(x)) {
    alert("Ingrese un numero valido");
    return false;
  }
}
</script>
<body>
<h1>Hello World!</h1>
<form name="formulario" action="/davidServlet" method="post">
    <p> numero : <input type ="text" name="id"></p>
    <p> <input type="submit" value="Enviar"> </p>
</form>

</body>
</html>