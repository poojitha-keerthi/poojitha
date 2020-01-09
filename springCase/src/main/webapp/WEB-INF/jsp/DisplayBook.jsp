<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<body>
       <form action="bookCRUD"> 
   <table align=center width=50%>
      <tr>
        <th>Book Id</th>
        <td><input type=text name=bookid  value=${book.bookid }></td>
        </tr>
        <tr>
           <th>Book Title</th>
           <td><input type=text name=booktitle  value=${book.booktitle }></td>
           </tr>
           <tr>
           <th>Price</th>
           <td><input type=text name=price  value=${book.price }></td>
           </tr>
           <tr>
           <th>Book Authour</th>
           <td><input type=text name=authour  value=${book.authour }></td>
           <tr>
           <td><input type=submit value="Add_Book" name="sub"></td>
            <td><input type=submit value="Del_Book" name="sub"></td>
             <td><input type=submit value="Mod_Book" name="sub"></td>
              <td><input type=submit value="Get_Book" name="sub"></td>
              </tr>
</body>
</html>