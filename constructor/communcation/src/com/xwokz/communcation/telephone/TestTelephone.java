package com.xwokz.communcation.telephone;

import com.xwokz.communcation.telephone.Telephone;

public class TestTelephone {
	public static void main(String []an) {
		
		com.xwokz.communcation.telephone.Telephone tp =  new com.xwokz.communcation.telephone.Telephone();
		com.xwokz.communcation.telephone.Telephone tp1 =  new com.xwokz.communcation.telephone.Telephone("Electromagnetic","Electromagnetic waves",1833,"Carl Friedich");
		com.xwokz.communcation.telephone.Telephone tp2 =  new com.xwokz.communcation.telephone.Telephone("make and break","Electromagnetic waves",1849,"Charles Bourseul");
		com.xwokz.communcation.telephone.Telephone tp3 =  new com.xwokz.communcation.telephone.Telephone("teletrophono","wire",1854,"Antonio Meucci");
		com.xwokz.communcation.telephone.Telephone tp4 =  new com.xwokz.communcation.telephone.Telephone("Reis telephone","transmitter and reciever",1857,"Johann Philipp Reis");
		
		System.out.println(tp.getAll());
		System.out.println(tp1.getAll());
		System.out.println(tp2.getAll());
		System.out.println(tp3.getAll());
		System.out.println(tp4.getAll());
	}
}
