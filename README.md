# qr-generator
To generate qr code of your content type follow the below steps :
1. Start the springboot application.
2. Open any client like postman or curl and use POST method and the url : http://localhost:8080/api/qr/generate (Check the port for your application if it is different from 8080)
3. Give the below json input :
   {
   "content": "${Your Qr code content}",
   "size": 250
   }
4. Now send the request and you will get the qr code in the response.