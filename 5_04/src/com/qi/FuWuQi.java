package com.qi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class FuWuQi {

	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		Socket socket = null;
		Map<String,Socket> maps = new HashMap<String,Socket>();
		try {
			serverSocket = new ServerSocket(8888);
			System.out.println("创建成功");
			//监听所有连接该服务器的客户端IP地址,通过map集合来存储所有人的IP地址
			socket = serverSocket.accept();
			BufferedReader na = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String name = na.readLine();
			maps.put(name, socket);
			FangFa yh = new FangFa(socket,maps);
			new Thread(yh).start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
