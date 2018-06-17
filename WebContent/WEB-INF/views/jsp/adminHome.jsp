<!doctype html>
<html lang=''>
<head>
<meta charset='utf-8'>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript" src="resources/js/canvasjs.min.js"></script>

<title>Vehicle Tracking</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<%@ include file="adminsidebar.jsp"%>
	<script>
		$("#viewUser").removeClass('active');
		$("#addUser").removeClass('active');
		$("#home").addClass('active');
		window.onload = function () {
		    var chart = new CanvasJS.Chart("chartContainer",
		    {
		      title:{
		      text: "Vehicle movment"
		      },
		      data: [
		      {
		        bevelEnabled: true,
		        type: "column",
		        dataPoints: [
		        { y: 10, x: 01/01/2018 },
		        { y: 20, x: 02/01/2018},
		        { y: 30, x: 03/01/2018 },
		        { y: 40, x: 04/01/2018 },
		        { y: 50, x: 05/01/2018 }
		             ]
		      }
		      ]
		    });

		    chart.render();
		  }
	</script>
	<div class="homepageimg">
		<div id="chartContainer" style="height: 300px; width: 100%;">
  </div>
	</div>
</body>
<html>