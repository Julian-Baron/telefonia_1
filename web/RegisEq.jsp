<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link rel="icon" href="img/telefono-inteligente.png">
    <link rel="stylesheet" href="css_s/Menu.css">
    <link rel="stylesheet" href="css_s/Tablas_a.css">
    
</head>
<body>
    <header>
        <title>Registro De Equipo</title>
        <div class="contenedor">
            <h1><i class="icon-gitlab">Telefonía Circulitos</i></h1>
                <nav class="menu">
                    <a href="index.jsp">Inicio</a>
                    <a href="#blog">Servicios y productos</a>
                    <a href="RegistroUs.jsp">Registro cliente</a>
                    <a href="RegisEq.jsp">Adquirir equipo</a>
                    <a href="RegistroLine.jsp">Linea y facturas</a>
                </nav>
            </div>
    </header>
        
    <div id="tablass">
        <form action="Registroequ" method="post">
            <input type="number" class="doc" id="doc" name="doc" placeholder="Serial">
            <input type="text" class="doc" id="nom" name="nom" placeholder="Numero de linea">
            <input type="text" class="doc" id="ape" name="ape" placeholder="Marca del equipo">
            <input type="text" class="doc" id="cor" name="cor" placeholder="Descripcion del equipo">
            <select type="text" class="doc" id="ing" name="cel" placeholder="Estado del equipo">
                <option>Reportado</option>
                <option>No Reportado</option>
            </select>
            <input type="submit" name="ing" class="amn" id="ing" value="Ingresar">
            <input type="submit" name="act" class="amn" id="ing" value="Actualizar">
        </form>
    </div>
     <footer>
        <div class="contenedor">
            <p class="copy">Telefonía Circulitos &copy; 2020</p>
            <div id="sociales">
            </div>
            </div>
    </footer>
    
    
</body>
</html>
