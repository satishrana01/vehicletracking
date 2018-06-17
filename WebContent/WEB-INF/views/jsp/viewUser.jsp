<!doctype html>
<html lang=''>
<head>
   <meta charset='utf-8'>
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <title>View & Edit Users</title>
</head>
<body>
<%@ include file="header.jsp" %>		
<%@ include file="adminsidebar.jsp" %>
<script>
 $("#viewUser").addClass('active');
 $("#addUser").removeClass('active');
 $("#home").removeClass('active');
   </script>		
<div class="userlist">
	<div class="container">
 	  <table class="table table-hover">
    <thead>
      <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Mobile</th>
        <th>Role</th>
        <th>Enable/Disable</th>
        <th>Action</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>John</td>
        <td>Doe</td>
        <td>+919899950259</td>
        <td>Normal</td>
        <td><label class="switch"><input id="mySlider" type="checkbox" checked>
			<span class="slider round"></span>
		</label></td>
		<td class="nav navbar-nav"><a class="btn-info btn">
			<span class="glyphicon glyphicon-edit"></span> edit</a>
			<button class="btn-info btn" type="button">
			<span class="glyphicon glyphicon-trash"></span>delete</button>
		</td>
      </tr>
      <tr>
        <td>Mary</td>
        <td>Moe</td>
        <td>+919899950259</td>
        <td>Normal</td>
        <td><label class="switch"><input id="mySlider" type="checkbox">
			<span class="slider round"></span>
		</label></td>
		<td class="nav navbar-nav"><a class="btn-info btn">
			<span class="glyphicon glyphicon-edit"></span> edit</a>
			<button class="btn-info btn" type="button">
			<span class="glyphicon glyphicon-trash"></span>delete</button>
		</td>
      </tr>
      <tr>
        <td>July</td>
        <td>Dooley</td>
        <td>+919899950259</td>
        <td>Admin</td>
        <td><label class="switch"><input id="mySlider" type="checkbox" checked>
			<span class="slider round"></span>
		</label></td>
		<td class="nav navbar-nav"><a class="btn-info btn">
			<span class="glyphicon glyphicon-edit"></span> edit</a>
			<button class="btn-info btn" type="button">
			<span class="glyphicon glyphicon-trash"></span>delete</button>
		</td>
      </tr>
       <tr>
        <td>July</td>
        <td>Dooley</td>
        <td>+919899950259</td>
        <td>Admin</td>
        <td><label class="switch"><input id="mySlider" type="checkbox" checked>
			<span class="slider round"></span>
		</label></td>
		<td class="nav navbar-nav"><a class="btn-info btn">
			<span class="glyphicon glyphicon-edit"></span> edit</a>
			<button class="btn-info btn" type="button">
			<span class="glyphicon glyphicon-trash"></span>delete</button>
		</td>
      </tr>
       <tr>
        <td>July</td>
        <td>Dooley</td>
        <td>+919899950259</td>
        <td>Admin</td>
        <td><label class="switch"><input id="mySlider" type="checkbox" checked>
			<span class="slider round"></span>
		</label></td>
		<td class="nav navbar-nav"><a class="btn-info btn">
			<span class="glyphicon glyphicon-edit"></span> edit</a>
			<button class="btn-info btn" type="button">
			<span class="glyphicon glyphicon-trash"></span>delete</button>
		</td>
      </tr>
    </tbody>
  </table>
</div>
</div>
</body>
<html>
