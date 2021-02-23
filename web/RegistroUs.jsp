<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="img/telefono-inteligente.png">
    <link rel="stylesheet" href="css_s/Menu.css">
    <link rel="stylesheet" href="css_s/Tablas_a.css">
    
<heads
<body>
    <header>
        <title>Gestion de usuarios</title>
        <div class="contenedor">
            <h1><i class="">Telefonía Circulitos</i></h1>
                <nav class="menu">
                    <a href="index.jsp">Inicio</a>
                    <a href="#blog">Servicios y productos</a>
                    <a href="RegistroUs.jsp">Formulario cliente</a>
                    <a href="RegisEq.jsp">Formulario equipo</a>
                    <a href="RegistroLine.jsp">Linea y facturas</a>
                </nav>
            </div>
        
    </header>
    <form action="datosp" method="post" enctype="multipart/form-data">
            <!--<input type="number" class="doc" id="doc" name="doc" placeholder="ID">-->
            <input type="text" class="doc" id="nom" name="nom" placeholder="Nombre" required="">
            <input type="text" class="doc" id="ape" name="ape" placeholder="Apellido" required="">
            <input type="text" class="doc" id="cor" name="cor" placeholder="Telefono fijo" required="">
            <input type="date" class="doc" id="cel" name="cel" placeholder="fecha de nacimiento" required="">
            <input type="text" class="doc" id="gen" name="gen" placeholder="cedula">
            <input type="file" class="doc" id="gen" name="img" placeholder="imagen" >
            <input type="submit" name="ing" class="amn" id="ing" value="Ingresar">
    </form>
</body>
</html>