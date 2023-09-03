<html>
<body>

<h2>First app: "/ShowStudent" </h2>

<h3>Jdbc app</h3>
<p>Write id and fetch data from database and display</p>
<form action="./ShowStudent">
	<input type="text" placeholder="id" name="id"/>
	<input type="submit" />
</form>
<hr/>
<h2>Second app: "/UploadFile" </h2>
<h3>Choose file(s) you want to install:</h3>
<form action="./UploadFile" method="post" enctype="multipart/form-data">
	<input type="file" multiple />
	<input type="submit" />
</form>
</body>
</html>
