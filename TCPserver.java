<<<<<<< HEAD
=======
import java.io.*;
import java.net.*;

<<<<<<< HEAD:server.java
>>>>>>> 3c353672f65bac4746428db5d61020c3c1da7fc4
class TCPServer {
=======
class TCPserver {
>>>>>>> 074593f6fcc42ca8cadd347873a266d009fba6b0:TCPserver.java
 public static void main(String argv[]) throws Exception {
  String clientSentence;
  String capitalizedSentence;
  ServerSocket welcomeSocket = new ServerSocket(6789);
<<<<<<< HEAD
while (true) {
   Socket connectionSocket = welcomeSocket.accept();
=======

  while (true) {
   Socket connectionSocket = welcomeSocket.accept();
   BufferedReader inFromClient =
    new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
   DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
   clientSentence = inFromClient.readLine();
   System.out.println("Received: " + clientSentence);
   capitalizedSentence = clientSentence.toUpperCase() + '\n';
   outToClient.writeBytes(capitalizedSentence);
  }
>>>>>>> 3c353672f65bac4746428db5d61020c3c1da7fc4
}
}
