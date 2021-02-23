<!DOCTYPE html>
<html lang="en">
<head>
<title>Comic elements</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>NAME</th>
					<th>IMAGEFILE</th>
					<th>COUNTOFPAGES</th>
					<th>BOOKPAGES</th>
				</tr>
			</thead>
			<tbody>
				<#list comic as comic>
				<tr>
					<td>${comic.name}</td>
					<td>${comic.imagefile}</td>
					<td>${comic.countOfPages}</td>
					<td>${comic.bookNumber}</td>
				</tr>
				</#list>
			</tbody>
		</table>
	</div>

</body>
</html>