
<%@taglib prefix="cs" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<link href="css/bootstrap.min.css"
        rel="stylesheet">
</head>
<body id="main_body" >

	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery-2.2.1.min.js"></script>
	<div class="container" style="margin:50px">
		<h1><a>Cake Manager Application</a></h1>
		<h4><a>Create Cake</a></h4>
		<form  class="appnitro"  method="post" action="${pageContext.request.contextPath}/save-cake" commandName="cakeEntity" >
		<label >Title </label>
		<div>
			<input id="title" name="title" class="element text medium" type="text" maxlength="255" value="" path="title"/> 
		</div> 
		
		<label class="description" for="element_2">Description </label>
		<div>
		<textarea rows="4" cols="25" id="description" name="description" path="description"></textarea>
		</div> 
		<label class="image" for="element_2">Image </label>
		<div>
			<input id="image" name="image" path="image" class="element text medium" type="file" autocomplete="off" accept="jpg|jpeg|png|xlsx|xls|docx|doc|pdf|csv" maxlength="255" value=""/> 
		</div> 
		</br>
			    
				<button  type="submit" >Submit</button>
		</form>	
		</div>
		<div class="container" style="margin:50px">
		<table class="table table-bordered table-striped" id="blgsdtblee">
    <thead>
    <tr>
    <th class="sno" class="text-center">S.No</th>
    <th class="text-center">Title</th>
    <th class="text-center">Description</th>
    <th class="text-center">Image</th>
    
    </tr>
    </thead>
   <cs:forEach var="cake" items="${cakeList}" varStatus="trindex">
   <tbody>
    <tr>
    
    <td class="text-center">${trindex.index+1}</td>
     <td class="text-center">${cake.title}</td>
      <td class="text-center">${cake.description}</td>
        
         <td class="text-center"> ${cake.image}</td>
    </tr>
    </tbody>
    </cs:forEach>
    </table>
	</div>
		<div id="footer">
		
		</div>
	</body>
