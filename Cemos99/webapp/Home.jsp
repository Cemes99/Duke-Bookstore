<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>	   
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>BookStore</title> 
    <link rel="stylesheet" href="./Style.css">
</head>
<body>
           <header>
        <h1 class="logo">BookStore</h1>
        <div class="toggle" onclick="toggleMenu();"></div>
        <ul class="header-container">
            <li><a href="./index.html">Home</a></li>
            <li><a href="./about.html">About</a></li>
            <li><a href="./menu.html">Menu</a></li>
            <li><a href="./contact.html">Contact</a></li>
        </ul>
    </header>
    <section class="banner">
       <img src="./img/error-bg.jpg" alt="">
    </section>

    <section class="content">
        <div class="container">
            <div class="category-box">
                <div class="category">
                    <h2>Category</h2>
                    <div class="category-item">
                        <a href="">Action</a>
                        <a href="">Action</a>
                        <a href="">Action</a>
                        <a href="">Action</a>
                        <a href="">Action</a>
                    </div>
                </div>
            </div>
            <div class="product-box">
            <c:forEach items="${listProduct}" var"o">
            <div class="product">
                <div class="product-item">                   
                        <div class="product-inner">
                            <img src="${o.img}" alt="">
                            <h2 class="title">${o.title}</h2>
                            <h3 class="price">${o.price}</h3>
                            <p class="descripton">adasdasdas</p>
                        </div>                 
                    </div>        
                </div>
            </c:forEach>
            </div>
        </div>
    </section>
</body>
</html>