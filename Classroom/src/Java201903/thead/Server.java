package Java201903.thead;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
//	命令提示字元
//	cd C:\Java201903\eclipse-workspace\ThreadDemo\bin
//	set PATH=C:\Java201903\openjdk11\bin;%PATH%
//	java networking.Client
	public static void main(String[] args) throws Exception {
		System.out.println("Server Start");
		ServerSocket serverSocket = new ServerSocket(9999);
		while (true) {

			Socket socket = serverSocket.accept();
			PrintStream output = new PrintStream(socket.getOutputStream(), true);
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line = input.readLine(); // 2
			while (line != null) {
				System.out.println(socket + ":\t" + line);
				output.println("From Server:" + line); // 3

				line = input.readLine(); // 2
			}
			input.close();
			output.close();
			socket.close();

		}

	}
}
