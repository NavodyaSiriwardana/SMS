<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0,
    maximum-scale=1.0, minimum-scale=1.0">
    <title>header</title>
    <link rel="stylesheet" href="css/login.css">
</head>
<body>
    <div class="container">
       
        <header>
        
            <h1>LONDON BRIDGE</h1>
           
           
        </header>

        <nav>
            <ul>
               <li><a href="#">HOME</a></li>
               <li><a href="#">SUBJECTS</a></li>
               <li><a href="#">RESOURCES</a></li>
               <li><a href="#">IVENTS</a></li>
               <li><a href="#">SPORTS</a></li>

            </ul>
            <div class="mobnav">
                <h4>Menu</h4>
            <ul>
                <li><a href="#">HOME</a></li>
                <li><a href="#">SUBJECTS</a></li>
                <li><a href="#">RESOURCES</a></li>
                <li><a href="#">IVENTS</a></li>
                <li><a href="#">SPORTS</a></li>
   
             </ul>
            </div>

        </nav>
    </div><!--end header-->
    <!--methanin uda mukuth karanna epa-->


    

    <div class="login">
        <form action="#" method="post" class="form">
            <h2>LOGIN</h2>
            <input type="text" name="username" class="box" placeholder="enter Username">
            <input type="password" name="password" class="box" placeholder=" enter Password">
            <input type="submit" value="LOGIN" id="submit">

        </form>
        <div class="side">
            <img src="pic\images.jpg" alt="log pic">
        </div>
    </div>


  

    <br>
    <!--mwthanin yata mukuth karanna epa-->
    <!--footer-->
    <div class="footer">
        
        <div class="suport">
            <h3>Do you need any</h3>
            <h2>SUPPORT ?</h2>
            <a href="#">+94 766934794</a>
            <br>
            <a href="#">support.lanka.lk</a>

        </div>
        <div class="link">
            <h3>Quick Links</h3>
            <a href="#">Menu</a>
        </div>

        <div class="copy">
            <h4>copyrihght 2024 c LANKA.</h4>
            <h4>All Right Reserved</h4> 

        </div>
    </div><!--end footer-->
    
 <!--js-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

    <script>
        $(document).ready(function(){
            $('.mobnav h4').click(function(){
                $('.mobnav ul').slideToggle();
            })

        })

    </script>
</body>
</html>