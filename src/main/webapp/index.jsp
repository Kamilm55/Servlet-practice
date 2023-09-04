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
<form method="post" action="./UploadFile" enctype="multipart/form-data">
    Choose a file: <input type="file" multiple="multiple" name="UploadFile" />
    <input type="submit" value="Upload" />
</form>
</form>
</body>
</html>
