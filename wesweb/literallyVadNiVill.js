const express = require('express')
const app = express()
const port = 3000
var http = require('http');
var qs = require('querystring');
var formOutput = '<html><body>'
  + '<h1>XYZ Repository Commit Monitor</h1>'
  + '<form method="post" action="inbound" enctype="application/x-www-form-urlencoded"><fieldset>'
  + '<div><label for="UserName">User Name:</label><input type="text" id="UserName" name="UserName" /></div>'
  + '<div><label for="Repository">Repository:</label><input type="text" id="Repository" name="Repository" /></div>'
  + '<div><label for="Branch">Branch:</label><input type="text" id="Branch" name="Branch" value="master" /></div>'
  + '<div><input id="ListCommits" type="submit" value="List Commits" /></div></fieldset></form></body></html>';


var clientDir = __dirname + '\\client\\'

app.get('/', (req, res) => {
  res.sendFile(clientDir + 'index.html')
})
app.get('/index.css', (req, res) => {
  res.sendFile(clientDir + 'index.css')
})
app.post('/input.html', (req, res) => {
  if(req.method === "POST") {
    var requestBody = '';
      req.on('data', function(data) {
        requestBody += data;
      });
      req.on('end', function() {
        var formData = qs.parse(requestBody);
        console.log(formData.fname + ' ' + formData.lname)
        res.writeHead(200, {'Content-Type': 'text/html'});
        res.write('<!doctype html><html><head><title>response</title></head><body>');
        res.write('Thanks for the data!<br />First Name: '+formData.fname);
        res.write('<br />Last Name: '+formData.lname);
        res.end('</body></html>');
      });
  }
})



app.listen(port, () => console.log(`Example app listening on port 3000!`))