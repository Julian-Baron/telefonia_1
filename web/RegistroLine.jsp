<%@page import="javax.swing.JOptionPane"%>
<%@page import="Modelo.Mod_tablas_linea_equipo"%>
<%@page import="Modelo.Con_tabla_linea"%>
<%@page import="Modelo.Mod_BuscarFactura"%>
<%@page import="Modelo.Con_BuscarFactura"%>
<%@page import="controlador.Buscarfa"%>
<%@page import="Modelo.Buscarfac"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Modelousuario"%>
<%
    HttpSession da=request.getSession();
    String dv=(String)da.getAttribute("linumerolinea");
%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css_s/Menu.css">
    <link rel="icon" href="img/telefono-inteligente.png">
    <link rel="stylesheet" href="css_s/Tablas_a.css">
    
</head>
<body>
    <header>
       <title>Gestion de Lineas</title>
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
    
    
    
        <form action="RegistroLi" method="post">
            <input type="number" class="doc" id="doc" name="doc" placeholder="Numero de la linea">
            <input type="text" class="doc" id="nom" name="nom" placeholder="Cedula personal">
            
            <select type="text" class="doc" id="ing" name="ape" placeholder="Estado de la linea">
                <option>Activa</option>
                <option>Inactiva</option>
            </select>
            
            <input type="submit" name="ing" class="doc" id="ing" value="Ingresar">
            <input type="submit" name="act" class="doc" id="ing" value="Actualizar">
        </form>
    

    <div id="tablas_usuarios">
        <div class="contenedor">
            Tabla de usuarios y linea correspondiente
        </div>
        <table width="100%">
            <thead>
                <tr>
                    
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Percedula</th>
                    <th>Perlinea</th>
                    <th>Imagen</th>
                </tr>
            </thead>
            <%
                
                
                ArrayList<Con_tabla_linea> vv=new ArrayList<>();
                              
                Con_tabla_linea uv=new Con_tabla_linea();
                Mod_tablas_linea_equipo muv=new Mod_tablas_linea_equipo();
                vv=muv.Buscar_persona();
                
                for (int i = 0; i<vv.size(); i++) {
                        
                    uv=vv.get(i);
            %>
            <tbody>
            <tr>
                    
                    <td><%=uv.getNombre()%></td>
                    <td><%=uv.getApellido()%></td>
                    <td><%=uv.getCedula()%></td>
                    <td><%=uv.getLinea()%></td>
                    
                </form>
                </tr>
            </tbody>
            <%
                }
            
            %>
        </table>
        <div class="contenedor">
            _____________________________
        </div>
    </div>
        
        <div class="Con_tab">
            
            
            
        </div>
    
    
    
        <form action="" method="POST">
            <input type="text" class="doc" id="nom" name="nom" placeholder="Numero de linea">
            <input type="date" class="doc" id="doc" name="fecha" placeholder="Fecha de emision">
            <input type="number" class="doc" id="nom" name="val" placeholder="valor de la factura">
            
           <!-- <select type="text" class="doc" id="ing" name="fac" placeholder="Estado de la linea">
                <option>Activa</option>
                <option>Inactiva</option>
            </select>-->
            
            <input type="submit" name="ing" class="doc" id="inbg" value="Ingresar">
           
        </form>
        <%
            if(request.getParameter("ing")!=null){
                String a,b;
                double c;
                boolean can;
                a=request.getParameter("fecha");
                b=request.getParameter("nom");
                c=Double.parseDouble(request.getParameter("val"));
                
                Con_BuscarFactura con=new Con_BuscarFactura(b, a, c);
                
                Mod_BuscarFactura mu=new Mod_BuscarFactura();
                can=mu.insertar_Factura(con);
            if(can){
                JOptionPane.showMessageDialog(null,"datos ingresados correctamente");
                response.sendRedirect("RegistroLine.jsp");
            }
            else{
                JOptionPane.showMessageDialog(null,"Datos no ingresados");
                response.sendRedirect("RegistroLine.jsp");
                }
            }
            
            
            %>
        
    <div class="Container" >
        
        <h1>Generacion de Facturas</h1>
        <form action="" method="Post">
            <input type="text" class="doc" id="fac" name="fac" placeholder="Numero de Cedula para buscar la factura">
            <input type="date" class="doc" id="fac" name="Fech" placeholder="Fecha a buscar las facturas realizadas">
            <input type="submit" name="bus" class="doc" id="ing" value="Buscar">
        </form>
        
        
        
        
        
        
       
    
    
   
        <table  width="100%">
            <div class="con">
                 <div class="contenedor">
                 Tabla de usuarios y linea correspondiente
                </div>
            <thead>
                <tr>
                    <th>Número de factura</th>
                    
                    <th>Fecha de emisión</th>
                    <th>Valor de la factura</th>
                    <th>Eliminar</th>
                </tr>
            </thead>
            <%
                if(request.getParameter("bus")!=null){
                
                ArrayList<Con_BuscarFactura> v=new ArrayList<>();
                String N;
                String A;

                N=request.getParameter("fac");
                A=request.getParameter("Fech");
                
                Con_BuscarFactura re=new Con_BuscarFactura(N, A);
                Con_BuscarFactura u=new Con_BuscarFactura();
                Mod_BuscarFactura mu=new Mod_BuscarFactura();
                v=mu.Buscar_Factura(re);
                
                for (int i = 0; i<v.size(); i++) {
                        
                    u=v.get(i);
            %>
            <tbody>
            <form action="" method="post">
                <tr>
                    <td><input class=" delete" name="doc" type="submit" value="<%=u.getFactura_numero()%>" placeholder="Eliminar"></td>
                    <td><input class=" delete" name="feca" type="submit" value="<%=u.getFecha_emision()%>" placeholder="Eliminar"></td>
                    <td><input class=" delete" name="fact" type="submit" value="<%=u.getFactura()%>" placeholder="Eliminar"></td>
                    <td><input class=" delete" type="submit" value="Eliminar" placeholder="Eliminar"></td>
                </tr>
            </form> 
            </tbody>
            <%
                
                }
                if(request.getParameter("eliminar")!=null){
                int Ns;
                boolean vi;
                Ns=Integer.parseInt(request.getParameter("doc"));
                Con_BuscarFactura res=new Con_BuscarFactura(Ns);
                    Mod_BuscarFactura mus=new Mod_BuscarFactura();
                vi=mus.eliminar_Factura(res);
                if(vi){
                    JOptionPane.showMessageDialog(null,"datos Eliminados correctamente");
                    response.sendRedirect("RegistroLine.jsp");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Datos no Eliminados");
                    response.sendRedirect("RegistroLine.jsp");
                    }
            }
            }
            %>
            </div>
        </table>
        
        
        
        
    </div>
    
    
        
    </body>
</html>