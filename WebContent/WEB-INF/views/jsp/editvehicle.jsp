<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Vehicle information</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<%@ include file="usersidebar.jsp"%>
	<script>
		$("#home").removeClass('active');
		$("#editvehicle").addClass('active');
		$("#addvehicle").removeClass('active');
		$(document).ready(function() {
			$('input').keyup(function() {
				if (this.value.length == $(this).attr("maxlength")) {
					$(this).next().focus();
				}
			});
		});
		function openDiaglog(){
			$("#vehicleinfo").css("display", "block"); 
			}
	</script>
	<div class="userlist">
		<div class="container">
			<form autocomplete="false" class="form-inline" action="">
				<div class="form-group">
					<label for="email">Registration No:</label> <input placeholder="DL"
						required size="2" maxlength="2" type="text" class="form-control"
						id="email">
				</div>
				<div class="form-group">
					<label for="pwd">&nbsp;</label> <input placeholder="AA" required
						size="2" maxlength="2" type="text" class="form-control" id="pwd">
				</div>
				<div class="form-group">
					<label for="pwd">&nbsp;</label> <input placeholder="00" required
						size="2" maxlength="2" type="text" class="form-control" id="pwd">
				</div>
				<div class="form-group">
					<label for="pwd">&nbsp;</label> <input placeholder="1234" required
						size="4" maxlength="4" type="text" class="form-control" id="pwd">
				</div>
				<button type="submit" class="btn btn-default">Search</button>
				<br>
				<br>
				<div id="vehicleinfo" style="display: block;">
					<div class="form-group">
						<label for="email">Vehicle IN/OUT :</label> <select required
							id="inputState" class="form-control">
							<option selected>Choose...</option>
							<option>OUT</option>
						</select>
					</div>
					<br>
					<br>
					<div class="form-group">
						<label for="email">Reading(KM) Old:</label>
						<label>3212344</label>
							
					</div>
					<br>
					<br>
					<div class="form-group">
						<label for="email">Reading(KM) New:</label> <input
							placeholder="11111111" required type="text" class="form-control"
							id="pwd">
					</div>
					<br>
					<br>
					<div class="form-group">
						<label for="email">Mobile
							No&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:</label> <input
							disabled="disabled" value="919899950259" class="form-control"
							id="email">
					</div>
					<br></br>
					<button type="submit" class="btn btn-default">Submit</button>
					<button type="reset" class="btn btn-default">Reset</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>